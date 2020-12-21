package org.mddarr.rideservice.controllers;


import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.models.requests.RideRequestDto;
import org.mddarr.rideservice.services.riderequest.RideRequestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideRequestController {

    private final RideRequestService rideRequestService;

    public RideRequestController(RideRequestService rideRequestService){
        this.rideRequestService = rideRequestService;
    }

    @PutMapping(value="/rides/requests")
    public RideRequest postRideRequest(@RequestBody RideRequestDto rideRequestDto){
        return rideRequestService.requestRide("dakobedbard@gmail.com", rideRequestDto);
    }

}
