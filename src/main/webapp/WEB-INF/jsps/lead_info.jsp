<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead Info</h2>
		<pre>
			First Name	: ${lead.firstName}<br/>
			Last Name	: ${lead.lastName}<br/>
			Lead Source	: ${lead.leadSource}<br/>
			E-mail		: ${lead.email}<br/>
			number		: ${lead.number}<br/>
			
		</pre>
		<form action="sendEmail" method="post">
			<input type="hidden" name="email" value="${lead.email}"/>
			<input type="submit" value="Send Mail"/>
		</form>
		<form action="convert" method="post">
			<input type="hidden" name="id" value="${lead.id}"/>
			<input type="submit" value="Convert"/>
		</form>
		${mail}
</body>
</html>