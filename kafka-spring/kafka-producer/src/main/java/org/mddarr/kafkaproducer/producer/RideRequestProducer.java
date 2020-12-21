package org.mddarr.kafkaproducer.producer;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import org.mddarr.riderequests.AvroRideRequest;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RideRequestProducer {

    public static void main(String[] args) {
        populateRideRequestsTopic();
    }

    public static void populateRideRequestsTopic(){
        final Map<String, String> serdeConfig = Collections.singletonMap(
                AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        // Set serializers and
        final SpecificAvroSerializer<AvroRideRequest> rideRequestSerializer = new SpecificAvroSerializer<>();
        rideRequestSerializer.configure(serdeConfig, false);


        Map<String, Object> props = new HashMap<>();
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        props.put(ProducerConfig.LINGER_MS_CONFIG, 1);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, rideRequestSerializer.getClass());

        DefaultKafkaProducerFactory<String, AvroRideRequest> pf1 = new DefaultKafkaProducerFactory<>(props);
        KafkaTemplate<String, AvroRideRequest> template = new KafkaTemplate<>(pf1, true);
        template.setDefaultTopic("RideRequests");

        for(int i =0; i < 10; i++){
            final AvroRideRequest avroRideRequest = new AvroRideRequest("user1",2);
            template.sendDefault("uk", avroRideRequest);
        }

    }

}
