<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact | List</title>
</head>
<body>
<h2>List Of Contacts</h2>
		<table border="1">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Lead Source</th>
				<th>E-mail</th>
				<th>Mobile</th>
				<th>Billing</th>
			</tr>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
					<td>${contact.lastName}</td>
					<td>${contact.leadSource}</td>
					<td><a href="sendEmail?email=${contact.email}">${contact.email}</a></td>
					<td>${contact.number}</td>
					<td><a href="billing?id=${contact.id}">Bill</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>