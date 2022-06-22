<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
			<nav class="navbar navbar-expand-lg navbar-light bg-light py-0">
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
					</div>
					<div>
						<div class="col-8">
							<div class="col-4">
								<div class=" flex-column-reverse ">
									<button type="button" class="btn btn-primary me-3">Log
										Out</button>
								</div>
							</div>
						</div>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div class="row pt-5 pb-5 px-5">
			<div class="col-sm-4 ">
				<div class="card ">
					<div class="card-body">
						<h5 class="card-title">Add Bus</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="addBusForm.view" class="btn btn-primary">Click Here To Add</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Remove Bus</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="removeBus.view" class="btn btn-primary">Click Here To Remove</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Update Bus</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="updateBusById.view" class="btn btn-primary">Click Here To Update</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row pt-5 pb-5 px-5">
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">View All Buses</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="viewBus.do" class="btn btn-primary">click here to view</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">View All Users</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="addPersonForm.view" class="btn btn-primary">click here to view</a>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">View All Tickets</h5>
						<p class="card-text">With supporting text below as a natural
							lead-in to additional content.</p>
						<a href="addPersonForm.view" class="btn btn-primary">click here to view</a>
					</div>
				</div>
			</div>
		</div>

	<footer class="bg-light text-center text-lg-start">
  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
     2020 Copyright:
    <a class="text-dark" href="https://mdbootstrap.com/">TEAM 3</a>
  </div>
  <!-- Copyright -->
</footer>


	</section>

</body>
</html>