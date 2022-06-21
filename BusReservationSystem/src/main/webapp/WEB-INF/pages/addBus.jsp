<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Form</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 class="display-4">Bus Reservation system</h1>
			<p class="lead">This application will help us in
				adding/removing/modifing/deleting data</p>
		</div>
		<form method="post" action="addBus.do">
			Bus Name <input type="text" name="busName" /> <br>
			Source <input type="text" name="source" /> <br>
			Destination <input type="text" name="destination" /> <br>
			Departure Date <input type="date" name="deparDate" /> <br>
			Departure Time <input type="datetime-local" name="departTime" /> <br>
			Arrival Time <input type="datetime-local" name="arriveTime" /> <br>
			Is Bus Booked <input type="text" name="isBooked" /> <br><br>
			<input type="submit" value="Add Bus">
		</form>
	</div>
</body>
</html>