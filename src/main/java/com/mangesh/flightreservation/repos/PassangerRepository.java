package com.mangesh.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangesh.flightreservation.entities.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {

}
