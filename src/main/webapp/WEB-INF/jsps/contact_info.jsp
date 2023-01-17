<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info</title>
</head>
<body>
	<h2>Contact Info</h2>
		<pre>
			First Name	: ${contact.firstName}<br/>
			Last Name	: ${contact.lastName}<br/>
			Lead Source	: ${contact.leadSource}<br/>
			E-mail		: ${contact.email}<br/>
			number		: ${contact.number}<br/>
			
		</pre>
		<form action="sendEmail" method="post">
			<input type="hidden" name="email" value="${contact.email}"/>
			<input type="submit" value="Send Mail"/>
		</form>
		${mail}
</body>
</html>