package com.mangesh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangesh.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
