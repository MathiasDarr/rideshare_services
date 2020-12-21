package org.mddarr.rideservice;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.AmqpConnectException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.concurrent.TimeUnit;

public class RabbitTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

//    @Test
//    public void test() throws Exception {
//        try {
//            rabbitTemplate.convertAndSend(RideServiceApplication.queueName, "Hello from RabbitMQ!");
//        }
//        catch (AmqpConnectException e) {
//            // ignore - rabbit is not running
//        }
//    }
}
