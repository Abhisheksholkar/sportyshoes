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

			<th>date</th>
			<th>category</th>
			<th>amount</th>
			<th>name</th>
			<th>quantity</th>
		</tr>

		<c:forEach items="${report}" var="reports">
			<c:if test="${param.date ==reports.date}">

		<tr>
		     <td>${reports.date}</td>
			 <td>${reports.category}</td>
			 <td>${reports.amount}</td>
			 <td>${reports.name}</td>
			 <td>${reports.quantity}</td>
		</tr>
			</c:if>
		</c:forEach>
	</table>
	<form action="home">


<input type="submit" value="home"/>
</form>
</body>
</html>