<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result of calculation</title>
</head>
<body>

<%
	Integer sum=(Integer)request.getAttribute("sum");
	out.print(sum+"<br>");
	
%>
<a href="cal.html">do you want to do more calculaton?</a>
</body>
</html>