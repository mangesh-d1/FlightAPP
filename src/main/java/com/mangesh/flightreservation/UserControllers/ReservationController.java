package com.mangesh.flightreservation.UserControllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap; 	
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mangesh.flightreservation.DTO.ReservationRequest;
import com.mangesh.flightreservation.entities.Flight;
import com.mangesh.flightreservation.entities.Reservation;
import com.mangesh.flightreservation.repos.FlightRepository;
import com.mangesh.flightreservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository flightRpository;
	
	@Autowired
	ReservationService reservationService;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long Id,ModelMap modelMap) {
		Flight flight = flightRpository.findById(Id).get();
		if (Flight .isPresent()) {
			modelMap.addAttribute("flight", flight);
		} else {
		    // ERROR?
		}
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelmap) {
		Reservation resrvation = reservationService.bookFlight(request);
		modelmap.addAttribute("msg","reservation created succesfully and id is "+resrvation.getId());
		return "reservationConfirmation";}

}
