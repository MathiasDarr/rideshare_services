package org.mddarr.riderequestproducer;


import org.apache.kafka.clients.consumer.Consumer;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mddarr.riderequests.AvroRideRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = {RideRequestProducerApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
@EmbeddedKafka
public abstract class UatAbstractTest {
//    @Autowired
//    private KafkaProperties kafkaProperties;
//    @Autowired
//    private EmbeddedKafkaBroker kafkaEmbedded;

    protected Consumer<String, AvroRideRequest> avroRideRequestConsumer;


}
