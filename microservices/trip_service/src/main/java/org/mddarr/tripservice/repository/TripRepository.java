package org.mddarr.tripservice.repository;

import org.mddarr.tripservice.models.Trip;
import org.mddarr.tripservice.models.TripDataPoint;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends CassandraRepository<Trip, Long> {

    @Query("SELECT * from trips;")
    List<Trip> getTrips();

}