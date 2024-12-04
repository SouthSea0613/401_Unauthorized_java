<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h1>joinResult.jsp - 응답페이지</h1>
		ID : <%=request.getAttribute("id") %><br>
		NAME : <%=request.getAttribute("name") %><br>
		AGE : <%=request.getAttribute("age") %><br>
	</body>
</html>