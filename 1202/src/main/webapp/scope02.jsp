<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>scope02.jsp</h1>
		<% 
		request.setCharacterEncoding("utf-8"); 
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		// 내장객체 영역
		request.setAttribute("id", "r_" + id);
		request.setAttribute("name", "r_" + name);
		
		session.setAttribute("id", "s_" + id);
		session.setAttribute("name", "s_" + name);
		
		application.setAttribute("id", "a_" + id);
		application.setAttribute("name", "a_" + name);
		
		// 포워딩
		response.sendRedirect("scope03.jsp");
		
		// request.getRequestDispatcher("scope03.jsp").forward(request, response);
		%>
	</body>
</html>