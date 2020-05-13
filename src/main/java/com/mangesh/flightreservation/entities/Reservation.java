package com.mangesh.flightreservation.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity
{
	private boolean CheckedIn;
	private int numberOfbags;
	@OneToOne
	private Passanger passanger;
	@OneToOne
	private Flight flight;
	
	public boolean isCheckedIn() {
		return CheckedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		CheckedIn = checkedIn;
	}
	public int getNumberOfbags() {
		return numberOfbags;
	}
	public void setNumberOfbags(int numberOfbags) {
		this.numberOfbags = numberOfbags;
	}
	public Passanger getPassanger() {
		return passanger;
	}
	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	

}
