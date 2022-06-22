

<%@page import="com.morningstar.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>

	<section class="background-radial-gradient overflow-hidden mh-100">
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
			<nav class="navbar navbar-expand-lg navbar-light bg-light py-0">
			<div class="container-fluid">
				<div class="d-flex align-items-center mb-12 pb-12">
					<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i> <img
						src="https://toppng.com/uploads/preview/bus-clipart-logo-travel-bus-logo-11563056641hjni9vkxhc.png"
						alt="login form" class="img-fluid"
						style="border-radius: 1rem 0 0 1rem;" width="65" height="60" /> <span
						class="h1 fw-bold mb-0">BusApp</span>
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
		<center>
			<h2>Profile</h2>
		</center>

		<table class="table table-striped table-hover table-light mx-2 px-2"
			border="1">

			<tr>
				<th>UserId</th>
				<th>Title</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Dob</th>
				<th>Mobile</th>
			</tr>

			<tr>
				<td><c:out value="${ requestScope.Customer.userId }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.title }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.fName }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.lName }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.emailId }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.password }"></c:out>
				</td>
				<td><c:out value="${ requestScope.Customer.dob }"></c:out></td>
				<td><c:out value="${ requestScope.Customer.mobNo }"></c:out></td>
			</tr>
		</table>
		<div class="text-center">
			<a href="userDashboard.do" class="btn btn-success text-center">Back</a>
		</div>
		<footer class="bg-light text-center text-lg-start"> <!-- Copyright -->
		<div class="text-center p-3"
			style="background-color: rgba(0, 0, 0, 0.2);">
			 2020 Copyright: <a class="text-dark"
				href="https://mdbootstrap.com/">TEAM 3</a>
		</div>
		<!-- Copyright --> 
		</footer>
	</section>
</body>
</html>
