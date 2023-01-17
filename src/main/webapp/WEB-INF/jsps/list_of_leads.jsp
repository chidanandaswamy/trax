<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads | List</title>
</head>
<body>
<a href="newLead">New Lead</a><br/>
<h2>List Of Leads</h2>
		<table border="1">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Lead Source</th>
				<th>E-mail</th>
				<th>Mobile</th>
			</tr>
			<c:forEach items="${leads}" var="lead">
				<tr>
					<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
					<td>${lead.lastName}</td>
					<td>${lead.leadSource}</td>
					<td><a href="sendEmail?email=${lead.email}">${lead.email}</a></td>
					<td>${lead.number}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>