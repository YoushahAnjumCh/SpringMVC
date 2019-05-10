<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
    <%@taglib prefix="r" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo/user/register">Register Page</a></center>
<center><body align="center"></body><a href="/Spring4MVCHelloWorldDemo">Home</a></center>
<table border="1">
<tr>
<th>ID</th>
<th>Fname</th>
<th>Lname</th>
<th>Email</th>
<th>Mobile</th>
<th>Age</th>
<th>Settings</th>
</tr>

<r:forEach items="${users}" var="user">

<tr>
<td><r:out value="${user.userid}"></r:out></td>
<td><r:out value="${user.fname }"></r:out></td>
<td><r:out value="${user.lname }"></r:out></td>
<td><r:out value="${user.email }"></r:out></td>
<td><r:out value="${user.mobile }"></r:out></td>
<td><r:out value="${user.age }"></r:out></td>
<td>

<a href="<r:url value='/user/details/${user.userid}' />">Details</a>
<a href="<r:url value='/user/delete/${user.userid}' />">Delete</a>
<a href="<r:url value='/user/edit/${user.userid}' />">Edit</a>

</td>
</tr>
</r:forEach>


</table>

</body>
</html>