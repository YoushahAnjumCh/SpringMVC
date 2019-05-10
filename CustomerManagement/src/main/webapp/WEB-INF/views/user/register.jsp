<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<body>
<form:errors path="usrs.*"/>
<h3 align="center">User Registration Form</h3>

<form:form method="post" action="/Spring4MVCHelloWorldDemo/user/create">
<table align="center">
	<tr>
		<td>FirstName</td>
		<td><input type="text" name="fname"placeholder="First Name"/></td>
	</tr>
	<tr>
		<td>Lastname</td>
		<td><input type="text" name="lname" placeholder="Last Name"/></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="email" placeholder="Email"/></td>
	</tr>
	
	<tr>
		<td>Mobile</td>
		<td><input type="text" name="mobile" placeholder="Mobile"/></td>
	</tr>
	
	<tr>
		<td>Age</td>
		<td><input type="text" name="age" placeholder="Age"/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Add User"/> </td>
	</tr>
</table>
<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo">Home</a></center>
</form:form>
</body>
</html>