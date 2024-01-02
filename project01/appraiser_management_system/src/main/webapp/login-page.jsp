<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>LOGIN FORM</title>

<link rel="stylesheet" type="text/css" href="CSS/login-page.css">
<link rel="icon" href="images/logo.jpg">
</head>
<body>


	<form action="login" method="post">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="user" required="required"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass" required="required"></td>
			</tr>
			<c:if test="${error != null}">
				<span style=color:red>Please enter the valid credentials</span>
			</c:if>
			<tr>
				<td><input type="submit" value="LOGIN"></td>
			</tr>
		</table>
	</form>


</body>
</html>