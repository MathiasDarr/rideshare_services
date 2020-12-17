package org.mddarr.rideservice.controllers;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.services.RideService;
import org.mddarr.rideservice.services.RideServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RidesControllers {

    private final RideServiceImpl rideService;

    public RidesControllers(RideServiceImpl rideService){
        this.rideService = rideService;
    }

    @GetMapping(value="rides/requests")
    public List<RideRequest> getAllRides(){
        return rideService.getAllRides();
    }

}
