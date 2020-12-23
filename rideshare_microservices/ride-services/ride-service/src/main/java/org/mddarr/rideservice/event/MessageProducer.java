package org.mddarr.rideservice.event;

import org.mddarr.rides.event.dto.AvroRideRequest;
import org.mddarr.rideservice.Constants;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, AvroRideRequest> kafkaTemplateEvent1;

    private static final Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    public void sendEvent1() {
        AvroRideRequest event1 = AvroRideRequest.newBuilder().setUserId("name").setRiders(2).build();
        logger.info("Send event 1 {}", event1);
        kafkaTemplateEvent1.send(Constants.EVENT_1_TOPIC, event1);
    }

}
