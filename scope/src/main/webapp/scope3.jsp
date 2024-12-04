<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope3.jsp</h1>
	<h3>request 영역값</h3>
	id: ${rid} <br>
	name: ${rname} <br>
	
	<h3>session 영역값: EL</h3>
	id: ${sid} <br>
	name: ${sname} <br>
	
	<h3>application 영역값: EL</h3>
	id: ${aid} <br>
	name: ${aname} <br>
</body>
</html>