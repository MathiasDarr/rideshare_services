package org.mddarr.rideservice.services.riderequest;

import org.mddarr.rideservice.models.RideRequest;
import org.mddarr.rideservice.models.requests.RideRequestDto;

public interface RideRequestServiceInterface {

    RideRequest requestRide(String userid, RideRequestDto rideRequestDto);

}
