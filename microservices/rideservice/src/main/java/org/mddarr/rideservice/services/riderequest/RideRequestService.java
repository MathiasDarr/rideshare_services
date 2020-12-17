package org.mddarr.rideservice.services.riderequest;


import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.models.requests.RideRequestDto;
import org.mddarr.rideservice.repository.RideRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class RideRequestService implements RideRequestServiceInterface {

    private final RideRequestRepository rideRequestRepository;

    public RideRequestService(RideRequestRepository rideRequestRepository){
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
        return rideRequestRepository.insert(rideRequest);
    }
}
