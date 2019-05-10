<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<td>FirstName</td>
			<td>${fname}</td>
		</tr>
		
		<tr>
			<td>LastName</td>
			<td>${lname}</td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${mobile}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${age}</td>
		</tr>
	</table>
	
	
</body>
<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo/user/register">Register Page</a></center><br>

<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo/user/list">List Of All Student</a></center>


</html>