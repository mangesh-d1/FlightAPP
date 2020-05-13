<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<h2>Flights</h2>
<table>
<tr><th>Airlines:</th>
<th>Departure City:</th>
<th>Arrival Time:</th>
<th>Departure Time:</th>
</tr>

<c:forEach items="${flights}" var="flights">
<tr>
<td>${flights.operatingAirlines}</td>
<td>${flights.departureCity}</td>
<td>${flights.arrivalCity}</td>
<td>${flights.estimatedDepartureTime}</td>
<td><a href="showCompleteReservation?flightId=${flights.id}">Select</a></td>
</tr>

</c:forEach>
</table>
</body>
</html>