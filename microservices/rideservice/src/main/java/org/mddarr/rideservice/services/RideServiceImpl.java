package org.mddarr.rideservice.services;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService{

    private final RideRepository rideRepository;

    public RideServiceImpl(RideRepository rideRepository){
        this.rideRepository = rideRepository;
    }

    @Override
    public List<RideRequest> getAllRides(){
        return rideRepository.getAllRides();
    }

}
