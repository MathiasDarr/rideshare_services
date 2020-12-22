package org.mddarr.riderequestproducer;


import org.apache.kafka.clients.consumer.Consumer;
import org.mddarr.riderequests.AvroRideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.EmbeddedKafkaBroker;

@SpringBootTest(classes = {RideRequestProducerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class UatAbstractTest {
//    @Autowired
//    private KafkaProperties kafkaProperties;
//    @Autowired
//    private EmbeddedKafkaBroker kafkaEmbedded;

    protected Consumer<String, AvroRideRequest> avroRideRequestConsumer;


}
