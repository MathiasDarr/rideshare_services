package org.mddarr.rideservice.services;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository){
        this.rideRepository = rideRepository;
    }

    public List<RideRequest> getAllRides(){

        return rideRepository.getAllRides();

//        List<RideRequest> a = new ArrayList<>();
//        return a;
    }



}
