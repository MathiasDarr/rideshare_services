package org.mddarr.rideservice.services;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RideService {
    List<RideRequest> getAllRides();

}
