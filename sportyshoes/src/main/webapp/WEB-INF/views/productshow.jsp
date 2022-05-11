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

			<th>productid</th>
			<th>price</th>
			<th>category</th>
			<th>size</th>
		</tr>

		<c:forEach items="${prolist}" var="product">
		<tr>
		     <td>${product.productid}</td>
			 <td>${product.price}</td>
			 <td>${product.category}</td>
			 <td>${product.size}</td>
		</tr>
			
		</c:forEach>
	</table>
	<form action="home">


<input type="submit" value="home"/>
</form>
</body>
</html>