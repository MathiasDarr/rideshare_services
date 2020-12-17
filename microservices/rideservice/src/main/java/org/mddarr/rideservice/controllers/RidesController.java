package org.mddarr.rideservice.controllers;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.services.rides.RideService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class RidesController {

    private final RideService rideService;

    public RidesController(RideService rideService){
        this.rideService = rideService;
    }

    @GetMapping(value="rides/requests")
    public List<RideRequest> getAllRides(){
        return rideService.getAllRides();
    }

    @GetMapping(value="rides")
    public String getRide(){
        return "Ride";
    }

    @GetMapping(value = "rides/driver")
    public String getDriver(){
        return rideService.getDriverId();
    }


}
