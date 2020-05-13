package com.mangesh.flightreservation.DTO;

public class ReservationRequest {
	private Long flightId;
	private String passangerFirstName;
	private String passangerLastName;
	private String passangerEmail;
	private String passangerPhone;
	private String Nameonthecarrd;
	private String CardNumber;
	private String ExpirationDate;
	private String securitycode;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getPassangerFirstName() {
		return passangerFirstName;
	}

	public void setPassangerFirstName(String passangerFirstName) {
		this.passangerFirstName = passangerFirstName;
	}

	public String getPassangerLastName() {
		return passangerLastName;
	}

	public void setPassangerLastName(String passangerLastName) {
		this.passangerLastName = passangerLastName;
	}

	public String getPassangerEmail() {
		return passangerEmail;
	}

	public void setPassangerEmail(String passangerEmail) {
		this.passangerEmail = passangerEmail;
	}

	public String getPassangerPhone() {
		return passangerPhone;
	}

	public void setPassangerPhone(String passangerPhone) {
		this.passangerPhone = passangerPhone;
	}

	public String getNameonthecarrd() {
		return Nameonthecarrd;
	}
	public void setNameonthecarrd(String nameonthecarrd) {
		Nameonthecarrd = nameonthecarrd;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getSecuritycode() {
		return securitycode;
	}

	public void setSecuritycode(String securitycode) {
		this.securitycode = securitycode;
	}

}
