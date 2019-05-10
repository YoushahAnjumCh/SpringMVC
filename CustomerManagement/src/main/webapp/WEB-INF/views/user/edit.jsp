<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form method="post" action="/Spring4MVCHelloWorldDemo/user/update" modelAttribute="usrs">
		<table>
			<tr>
			<td>
				<f:hidden path="userid"/>
				<f:label path="fname"> FirstName</f:label></td>
				<td><f:input path="fname"></f:input></td>
			</tr>
			<tr>
				<td><f:label path="lname"> Lastname</f:label></td>
				<td><f:input path="lname"></f:input></td>
			</tr>
			<tr>
				<td><f:label path="email"> Email</f:label></td>
				<td><f:input path="email"></f:input></td>
			</tr>

			<tr>
				<td><f:label path="mobile"> mobile</f:label></td>
				<td><f:input path="mobile"></f:input></td>
			</tr>

			<tr>
				<td><f:label path="age"> Age</f:label></td>
				<td><f:input path="age"></f:input></td>
			</tr>


			<tr>
				<td colspan="2"><input type="submit" value="Update User" /></td>
			</tr>

		</table>

	<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo/user/list">List</a></center>

	</f:form>

</body>
</html>