<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.zm.ams.dto.States"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/search-style.css" />
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<form action="search-amc" method="post">

		<label for="company-name">Company Name:</label> <input type="text"
			name="amc" placeholder="Enter a keyword or company name">

		<label for="State">State:</label> <select name="state" required>
			<option selected disabled>Select State</option>
			<c:forEach var="state" items="${States.values()}">
				<option value="${state.getStateName()}">${state}</option>
			</c:forEach>
		</select> 
		<label for="city">City</label> <input type="text" name="city"
			placeholder="Enter city">
				
			<button type="submit">Search</button>
			<button type="button" onclick="window.location.href='home-page.jsp'">Cancel</button>
	</form>
	
</body>
</html>