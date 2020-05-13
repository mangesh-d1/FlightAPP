<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Airline :${flight.operatingAirlines}<br/>
ArrivalCity :${flight.departureCity}<br/>	
DepartureCity :${flight.arrivalCity}<br/>

<form action="completeReservation" method="post">
<pre>
<h2>Passanger Details:</h2>
First name :<input type = "text" name = "passangerFirstName"/>
Last name :<input type = "text" name = "passangerLastName"/>
Email:<input type = "text" name = "passangerEmail"/>
Phone:<input type = "text" name = "passangerPhone"/>

<h2>Card Details</h2>
name on the card :<input type = "text" name = "Nameonthecarrd"/>
card number :<input type = "text" name = "CardNumber"/>
Expiry Date:<input type = "text" name = "ExpirationDate"/>
Three digit security code:<input type = "text" name = "securitycode"/>

<input type="hidden" name="flightId" value ="${Flight.Id}"/>


<input type="submit" value="confirm"/>
</pre>
</form>
</body>
</html>