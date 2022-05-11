<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.tek.sportyshoes.entity.Product, java.util.List" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table width="500px" border="1px">
		<tr>

			<th>userid</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>mobileno</th>
			<th>email</th>
		</tr>

		<c:forEach items="${userlist}" var="user">

		<tr>
		     <td>${user.userId}</td>
			 <td>${user.firstName}</td>
			 <td>${user.lastName}</td>
			 <td>${user.mobileNo}</td>
			 <td>${user.email}</td>
		</tr>
		</c:forEach>
	</table>
	<form action="home">


<input type="submit" value="home"/>
</form>
</body>
</html>