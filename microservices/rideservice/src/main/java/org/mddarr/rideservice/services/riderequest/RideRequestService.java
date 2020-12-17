package org.mddarr.rideservice.services.riderequest;


import org.mddarr.rideservice.repository.RideRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RideRequestService implements RideRequestServiceInterface {
    private final RideRequestRepository rideRequestRepository;

    public RideRequestService(RideRequestRepository rideRequestRepository){
        this.rideRequestRepository = rideRequestRepository;
    }

}
