package org.mddarr.rideservice.services.riderequest;


import org.mddarr.rideservice.RideServiceApplication;
import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.models.requests.RideRequestDto;
import org.mddarr.rideservice.repository.RideRequestRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;

import java.util.concurrent.TimeUnit;

@Service
public class RideRequestService implements RideRequestServiceInterface {

    private final RabbitTemplate rabbitTemplate;

    private final RideRequestRepository rideRequestRepository;

    public RideRequestService(RideRequestRepository rideRequestRepository, RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
        this.rideRequestRepository = rideRequestRepository;
    }

    @Override
    public RideRequest requestRide(String userid, RideRequestDto rideRequestDto) {
        RideRequest rideRequest = new RideRequest();
        rideRequest.setUser_id(userid);
        rideRequest.setRequest_time(rideRequestDto.getTime());
        rideRequest.setRiders(rideRequestDto.getRiders());
        rideRequest.setLocation_lat(rideRequestDto.getLocation_lat());
        rideRequest.setLocation_lng(rideRequestDto.getLocation_lng());
        rideRequest.setDestination_lat(rideRequestDto.getDestination_lat());
        rideRequest.setDestination_lng(rideRequestDto.getDestination_lng());
        rideRequest.setStatus("PENDING");
        rabbitTemplate.convertAndSend(RideServiceApplication.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ! " + userid);
        return rideRequestRepository.insert(rideRequest);
    }
}
