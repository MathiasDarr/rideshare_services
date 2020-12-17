package org.mddarr.rideservice.models.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Date time;
    private Integer riders;
    private Double location_lat;
    private Double location_lng;

    private Double destination_lat;
    private Double destination_lng;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getRiders() {
        return riders;
    }

    public void setRiders(Integer riders) {
        this.riders = riders;
    }

    public Double getLocation_lat() {
        return location_lat;
    }

    public void setLocation_lat(Double location_lat) {
        this.location_lat = location_lat;
    }

    public Double getLocation_lng() {
        return location_lng;
    }

    public void setLocation_lng(Double location_lng) {
        this.location_lng = location_lng;
    }

    public Double getDestination_lat() {
        return destination_lat;
    }

    public void setDestination_lat(Double destination_lat) {
        this.destination_lat = destination_lat;
    }

    public Double getDestination_lng() {
        return destination_lng;
    }

    public void setDestination_lng(Double destination_lng) {
        this.destination_lng = destination_lng;
    }
}
