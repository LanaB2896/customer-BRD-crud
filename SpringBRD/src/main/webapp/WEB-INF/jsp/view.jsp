<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>
<form action="/table" method=post>
			<table>
			<tr><th>Customer Code</th>
				<th>Customer Name</th>
				<th>Customer Address</th>
				<th>Customer Pincode</th>
				<th>Customer E-mail</th>
				<th>Customer Number</th>
				<th>Registration Date</th>
				<th>Created By</th>
				<th>Modified Date</th>
		
			</tr>
<!-- 		</table> -->
		<c:forEach  var="element" items="${view}">
				<tr>
				<th>${element.customerCode}</th> 
					<th>${element.customerName}</th>
					<th>${element.customerAddress}</th>
					<th>${element.customerPincode}</th>
					<th>${element.customerEmail}</th>
					<th>${element.customerNumber}</th>
					<th>${element.registrationDate}</th>
					<th>${element.createdBy}</th>
					<th>${element.modifiedDate}</th>
				</tr>
			</c:forEach>
		</table>
		</form>
</body>
</html>


