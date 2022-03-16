<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update an existing Employee</title>
</head>
<body>
<form action="empcontroller" method="post">
    <input type="hidden" name="id" value="${employee.id}">
	<table>
		<tr>
			<td>Enter Name</td>
			<td><input type="text" name="name" value="${employee.name}" readonly></td>
		</tr>
		<tr>
			<td>Enter Salary</td>
			<td><input type="text" name="salary" value="${employee.salary}"></td>
		</tr>
		
		<tr>
			<td>Enter Age</td>
			<td><input type="text" name="age" value="${employee.age}"></td>
		</tr>
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
</form>
</body>
</html>