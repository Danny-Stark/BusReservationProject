<%-- <%@page import="com.morningstar.model.Bus"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
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
			<h1 class="display-4">Bus Managament App</h1>
			<p class="lead">This application will help us in
				adding/removing/modifing/deleting data</p>
		</div>
		<form action="updateBus.do" method="post">
			Bus Id:<input type="text" name="bId"value="${busupdate.bId}"> 
			Bus Name:<input type="text" name="busName" value="${busupdate.busName}"> 
			Source:<input type="text" name="source" value="${busupdate.source}">
			Destination:<input type="text" name=destination value="${busupdate.destination}">
			DepartDate:<input type="text" name="deparDate" value="${busupdate.deparDate}">
			DepartTime:<input type="text" name="departTime" value="${busupdate.departTime}">
			ArriveDate:<input type="text" name="arriveDate" value="${busupdate.arriveDate}">
			ArriveTime:<input type="text" name="arriveTime" value="${busupdate.arriveTime}">
			Is Bus Booked:<input type="text" name="isBooked" value="${busupdate.isBooked}">
			<input type="submit" value="Update Bus">
		</form>
</body>
</html> --%>

 
 <%@page import="com.morningstar.model.Bus"%>
<%@page import="java.util.List"%>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>userRegistration</title>
</head>
<body>

	<!-- Section: Design Block -->
	<section class="background-radial-gradient overflow-hidden">
		<style>
.background-radial-gradient {
	background-color: hsl(218, 41%, 15%);
	background-image: radial-gradient(650px circle at 0% 0%, hsl(218, 41%, 35%)
		15%, hsl(218, 41%, 30%) 35%, hsl(218, 41%, 20%) 75%,
		hsl(218, 41%, 19%) 80%, transparent 100%),
		radial-gradient(1250px circle at 100% 100%, hsl(218, 41%, 45%) 15%,
		hsl(218, 41%, 30%) 35%, hsl(218, 41%, 20%) 75%, hsl(218, 41%, 19%) 80%,
		transparent 100%);
}

#radius-shape-1 {
	height: 220px;
	width: 220px;
	top: -60px;
	left: -130px;
	background: radial-gradient(#44006b, #ad1fff);
	overflow: hidden;
}

#radius-shape-2 {
	border-radius: 38% 62% 63% 37%/70% 33% 67% 30%;
	bottom: -60px;
	right: -110px;
	width: 300px;
	height: 300px;
	background: radial-gradient(#44006b, #ad1fff);
	overflow: hidden;
}

.bg-glass {
	background-color: hsla(0, 0%, 100%, 0.9) !important;
	backdrop-filter: saturate(200%) blur(25px);
}
</style>
		<div>
			<nav class="navbar navbar-expand-lg navbar-light bg-light  py-0">
				<div class="container-fluid">
					<div class="d-flex align-items-center mb-12 pb-12">
						<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i> <img
							src="https://toppng.com/uploads/preview/bus-clipart-logo-travel-bus-logo-11563056641hjni9vkxhc.png"
							alt="login form" class="img-fluid"
							style="border-radius: 1rem 0 0 1rem;" width="65" height="60" />
						<span class="h1 fw-bold mb-0">BusApp</span>
					</div>
					<a class="navbar-brand" href="#"></a>
					<button class="navbar-toggler" type="button"
						data-mdb-toggle="collapse" data-mdb-target="#navbarNav"
						aria-controls="navbarNav" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fas fa-bars"></i>
					</button>
					<div class="collapse navbar-collapse" id="navbarNav">
						<ul class="navbar-nav">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Home</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Contact
									Us</a></li>
							<li class="nav-item"><a class="nav-link" href="#">About
									US</a></li>
							
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div
			class="container px-4 py-5 px-md-5 text-center text-lg-start my-3">
			<div class="row gx-lg-5 align-items-center mb-5">
				<div class="col-4 mb-5 mb-lg-0" style="z-index: 10">
					<h1 class="my-5 display-5 fw-bold ls-tight"
						style="color: hsl(218, 81%, 95%)">
						Bus Registration<br /> <span style="color: hsl(218, 81%, 75%)">
							#TravelLikeAKing</span>
					</h1>
					<p class="mb-4 opacity-70" style="color: hsl(218, 81%, 85%)">
						Lorem ipsum dolor, sit amet consectetur adipisicing elit.
						Temporibus, expedita iusto veniam atque, magni tempora mollitia
						dolorum consequatur nulla, neque debitis eos reprehenderit quasi
						ab ipsum nisi dolorem modi. Quos?</p>
				</div>

				<div class="col-lg-6  mb-lg-0 position-relative">
					<div id="radius-shape-1"
						class="position-absolute rounded-circle shadow-5-strong"></div>
					<div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>

					<div class="card bg-glass">
						<div class="card-body ">
							<form  action="updateBus.do" method="post">
								<!-- 2 column grid layout with text inputs for the first and last names -->

								<!-- Email input -->
								<div class="form-outline mb-2">
									<input type="text" name="bId" id="form3Example3" class="form-control"
										value="${busupdate.bId}" > <label
										class="form-label"  for="form3Example3">Bus Id</label>
								</div>
								<!-- Password input -->
								<div class="form-outline mb-2">
									<input type="text"  name="busName" value="${busupdate.busName}" id="form3Example4" class="form-control"
									 /> <label class="form-label"
										for="form3Example4">Bus Name</label>
								</div>
								<div class="form-outline mb-2">
									<input type="text" name="source" value="${busupdate.source}" id="form3Example4" class="form-control"
									/> <label class="form-label"
										for="form3Example4">Source</label>
								</div>

								<div class="form-outline mb-2">
									<input type="text" name=destination value="${busupdate.destination}"  id="form3Example4" class="form-control"
										 /> <label class="form-label"
										for="form3Example4">Destinaton</label>
								</div>
								<div class="form-outline mb-2">
									<input type="date" name="deparDate" value="${busupdate.deparDate}" id="form3Example4" class="form-control"
									 /> <label class="form-label"
										for="form3Example4">Departure Date</label>
								</div>
								<div class="form-outline mb-2">
									<input type="time" name="departTime" value="${busupdate.departTime}" id="form3Example4" class="form-control"
										 /> <label class="form-label"
										for="form3Example4">Deaprt Time</label>
								</div>

								<div class="form-outline mb-2">
									<input type="date" name="arriveDate" value="${busupdate.arriveDate}" id="form3Example4" class="form-control"
										 /> <label class="form-label"
										for="form3Example4">Arrival Date</label>
								</div>
								<div class="form-outline mb-2">
									<input type="time" name="arriveTime" value="${busupdate.arriveTime}" id="form3Example4" class="form-control"
									 /> <label class="form-label"
										for="form3Example4">Arrival Time</label>
								</div>
								<div class="form-outline mb-2">
									<input type="text" name="isBooked" value="${busupdate.isBooked}"  id="form3Example4" class="form-control"
									 /> <label class="form-label"
										for="form3Example4">Is Bus Booked</label>
								</div>
								<!-- Submit button -->
								<button type="submit" class="btn btn-primary btn-block mb-4">
									Add Bus</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Remove the container if you want to extend the Footer to full width. -->

		<footer class="bg-light text-center text-lg-start">
			<!-- Copyright -->
			<div class="text-center p-3"
				style="background-color: rgba(0, 0, 0, 0.2);">
				2022 Copyright: <a class="text-dark"
					href="https://mdbootstrap.com/">TEAM 3</a>
			</div>
			<!-- Copyright -->
		</footer>
	</section>

</body>
</html>