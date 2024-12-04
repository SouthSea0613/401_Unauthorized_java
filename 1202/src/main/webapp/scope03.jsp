<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>scope03.jsp</h1>
		<h3>request 영역값</h3>
		id : <%=request.getAttribute("id") %><br/>
		name : ${requestScope.name}	<!-- EL(Express Language) -->
		
		<h3>session 영역값</h3>
		id : <%=session.getAttribute("id") %><br/>
		name : ${sessionScope.name}
		
		<h3>application 영역값</h3>
		id : <%=application.getAttribute("id") %><br/>
		name : ${applicationScope.name}
		
		<h3>${id}</h3>
	</body>
</html>