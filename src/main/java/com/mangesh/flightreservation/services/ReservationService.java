package com.mangesh.flightreservation.services;

import com.mangesh.flightreservation.DTO.ReservationRequest;
import com.mangesh.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
