package org.mddarr.rideservice.services.rides;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService implements RideServiceInterface {

    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository){
        this.rideRepository = rideRepository;
    }

    @Override
    public String getDriverId() {
        return "Driver";
    }

    @Override
    public List<RideRequest> getAllRides(){
        return rideRepository.getAllRides();
    }

}
