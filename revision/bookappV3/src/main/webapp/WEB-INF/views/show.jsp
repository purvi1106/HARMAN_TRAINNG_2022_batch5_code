<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bookstore app : Harman</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.id}</td>
				<td>${book.title}</td>
				<td>${book.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="bookController?action=add">add book</a>
</body>
</html>