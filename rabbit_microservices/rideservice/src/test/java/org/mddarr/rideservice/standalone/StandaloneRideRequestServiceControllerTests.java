package org.mddarr.rideservice.standalone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRequestRepository;
import org.mddarr.rideservice.services.riderequest.RideRequestService;
import org.mddarr.rideservice.services.rides.RideService;
import org.mockito.Mock;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.annotation.support.SimpAnnotationMethodMessageHandler;


public class StandaloneRideRequestServiceControllerTests {

    private RideRequestService rideRequestService;
    private TestMessageChannel clientOutboundChannel;
    private TestAnnotationMethodHandler testAnnotationMethodHandler;

    @Autowired
    private RideRequestRepository rideRequestRepository;

    @Mock
    RabbitTemplate rabbitTemplate;

    @BeforeEach
    public void setup(){
        this.rideRequestService = new RideRequestService(rideRequestRepository, rabbitTemplate);
    }

    @Test
    public void contextLoads(){

    }

    @Test void requestRide(){
        RideRequest rideRequest = new RideRequest();
    }

    private static class TestAnnotationMethodHandler extends SimpAnnotationMethodMessageHandler {
        public TestAnnotationMethodHandler(SubscribableChannel inChannel, MessageChannel outChannel, SimpMessageSendingOperations brokerTemplate) {
            super(inChannel, outChannel, brokerTemplate);
        }
        public void registerHandler(Object handler) {
            super.detectHandlerMethods(handler);
        }
    }

}
