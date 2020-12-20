package org.mddarr.rideservice.services.rides;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RideServiceInterface {

    String getDriverId();
    List<RideRequest> getAllRides();

}
