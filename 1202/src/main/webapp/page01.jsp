<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<h1>page01.jsp</h1>
		<!-- redirect forwarding -->
		<%
		// response.sendRedirect("page02.jsp");
		request.getRequestDispatcher("page02.jsp").forward(request, response);
		%>
	</body>
</html>