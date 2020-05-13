package com.mangesh.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mangesh.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    
	@Query(value = "SELECT * from Flight where departure_city= :departureCity and arrival_city= :arrivalCity",nativeQuery = true)
	List<Flight> findFlights(@Param("departureCity") String from,@Param("arrivalCity") String to);
}
