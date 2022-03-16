<%@page import="com.empapp.model.dao.Employee"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee inforataion</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>salary</th>
				<th>age</th>
				<th>delete</th>
				<th>update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.salary}</td>
					<td>${emp.age}</td>
					<td><a href="empcontroller?action=del&id=<c:out value="${emp.id}"/>">delete</a></td>
					<td><a href="empcontroller?action=update&id=<c:out value="${emp.id}"/>">update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="empcontroller?action=add">add new employee</a>
</body>
</html>