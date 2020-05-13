package com.mangesh.flightreservation.UserControllers;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mangesh.flightreservation.entities.Flight;
import com.mangesh.flightreservation.repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
    FlightRepository flightRepository;
	
	@RequestMapping("findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") String departureDate ,ModelMap modelMap) {
		System.out.println("departuredate"+departureDate);
		List<Flight> flights = flightRepository.findFlights(from , to );
		modelMap.addAttribute("flights",flights);
		System.out.println("Flights Present"+flights);
		return "DisplayFlights";
		
	}

}
