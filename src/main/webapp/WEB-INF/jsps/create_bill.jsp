<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generate | Bill</title>
</head>
<body>
	<h2>Generate | Bill</h2>
		<form action="generateBill" method="post">
			<pre>
							<input type="hidden" name="leadSource" value="${leadSource}"/><br/>
				First Name	: ${contact.firstName} <input type="hidden" name="firstName" value="${contact.firstName}"/><br/>
				Last Name	: ${contact.lastName} <input type="hidden" name="lastName" value="${contact.lastName}"/><br/>
				Email		: ${contact.email} <input type="hidden" name="email" value="${contact.email}"/><br/>
				Number		: ${contact.number} <input type="hidden" name="number" value="${contact.number}"/><br/>
				Model		: <input type = "text" name="model"/><br/>
				Amount		: <input type = "text" name="amount"/><br/>
				<input type="submit" value="Generate Bill"/><br/>
			</pre>
		</form>
		${error}
</body>
</html>