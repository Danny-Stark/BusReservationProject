<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Bus</title>
</head>
<body>
	<table class="table table-striped table-hover table-dark" border="1">
		<tr>
			<th>Bus No</th>
			<th>Bus Name</th>
			<th>SOURCE</th>
			<th>DESTINATION</th>
			<th>DEPARTDATE</th>
			<th>DEPARTTIME</th>
			<th>ARRIVETIME</th>
			<th>ISBOOKED</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="bus" items="${ requestScope.busList }">
			<tr>
				<td> <c:out value="${ bus.bId }"></c:out> </td>
				<td> <c:out value="${ bus.busName }"></c:out> </td>
				<td> <c:out value="${ bus.source }"></c:out> </td>
				<td> <c:out value="${ bus.destination }"></c:out> </td>
				<td> <c:out value="${ bus.deparDate }"></c:out> </td>
				<td> <c:out value="${ bus.departTime }"></c:out> </td>
				<td> <c:out value="${ bus.arriveTime }"></c:out> </td>
				<td> <c:out value="${ bus.isBooked }"></c:out> </td>
				<td> <a class="btn btn-primary" href="#" role="button">UPDATE</a> </td>
				<td> <a class="btn btn-danger" href="#" role="button">DELETE</a> </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>