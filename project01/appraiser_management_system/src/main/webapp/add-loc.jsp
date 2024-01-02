<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %>
<%@ page import="com.zm.ams.dto.States"%>
<%@ page import="com.zm.ams.dto.AppraisalManagementCompany"%>
<%@ page import="com.zm.ams.services.impl.AmcServiceImpl" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/addloc-style.css" />
<style>

.form {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	max-width: 400px;
	width: 100%;
	box-sizing: border-box;
}
.form input {
	width: 100%;
	padding: 10px;
	margin-bottom: 16px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
	font-size: 14px;
}
.form input[type="button"] {
	background-color: gray;
	color: #fff;
	cursor: pointer;
	padding: 12px;
	font-size: 16px;
	border: none;
	border-radius: 4px;
}


.form input[type="button"]:hover {
	background-color: gray;
}
.form>* {
	margin-bottom: 15px;
}

</style>
</head>
<body>
<%
	if(session.getAttribute("first_name") == null)
	{
		response.sendRedirect("login-page.jsp");
	}
%>
	<form action="addLoc" method="post" class="form">
		<h2>ADD LOCATION</h2>

		<label for="AMC">AMC Company*</label> <select name="amc" required>
			<option value="" selected disabled>Select AMC</option>
			<%
			for (String amcName : new AmcServiceImpl().getAmcNames()) {
			%>
			<option value="<%=amcName%>"><%=amcName%></option>
			<%
			}
			%> 
			

		</select> <label for="State">State*</label> <select name="state" required>
			<option selected disabled>Select State</option>
			<c:forEach var="state" items="${States.values()}">
				<option value="${state.getStateName()}">${state}</option>
			</c:forEach>
		</select> <label for="City">City*</label> <input type="text" name="city"
			required />

		<table>
			<tr>
				<td><button type="submit">Add</button></td>
				<td><button type="button" onclick="window.location.href='home-page.jsp'">Cancel</button></td>
			</tr>
		</table>
	</form>
</body>
</html>
