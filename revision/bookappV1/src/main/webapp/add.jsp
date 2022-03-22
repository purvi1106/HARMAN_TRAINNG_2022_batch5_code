<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a new book</title>
</head>
<body>

<form action="bookController" method="post">
	<table>
		<tr>
			<td>Tilte</td>
			<td><input type="text" name ="title"></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="text" name ="price"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="add book"></td>
		</tr>
		
	</table>
</form>

</body>
</html>