package com.mangesh.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangesh.flightreservation.DTO.ReservationRequest;
import com.mangesh.flightreservation.entities.Flight;
import com.mangesh.flightreservation.entities.Passanger;
import com.mangesh.flightreservation.entities.Reservation;
import com.mangesh.flightreservation.repos.FlightRepository;
import com.mangesh.flightreservation.repos.PassangerRepository;
import com.mangesh.flightreservation.repos.ReservationRepository;


@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassangerRepository passangerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		//make Payment
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		flight.setArrivalCity("AUS");
		flight.setDepartureCity("NYC");
		flight.setOperatingAirlines("American Airlines");
		
		Passanger passanger = new Passanger();
		passanger.setFirstName(request.getPassangerFirstName());
		passanger.setLastName(request.getPassangerLastName());
		passanger.setPhone(request.getPassangerPhone());
		passanger.setEmail(request.getPassangerEmail());
		Passanger savedPassanger = passangerRepository.save(passanger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassanger(savedPassanger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		
		return savedReservation;
	}

}
