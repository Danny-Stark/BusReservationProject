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
<title>Student Form</title>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<h1 class="display-4">Bus Reservation system</h1>
			<p class="lead">This application will help us in
				adding/removing/modifing/deleting data</p>
		</div>
		<form method="post" action="addPerson.do">
			Person Title <input type="text" name="title" /> <br>
			Person FiretName <input type="text" name="fName" /> <br>
			Person LastName <input type="text" name="lName" /> <br>
			Person Email <input type="text" name="emailId" /> <br>
			Person Password <input type="text" name="password" /> <br>
			Person DOB <input type="text" name="dob" /> <br>
			Person Mobile <input type="text" name="mobNo" /> <br><br>
			<input type="submit" value="Add Person">
		</form>
	</div>
</body>
</html>