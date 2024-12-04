<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>나는 scope2</h2>
	<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	System.out.println(id+","+name);
	// request 내장객체의 영역
	request.setAttribute("rid", id);
	request.setAttribute("name", "r_"+name);
	
	// request 보다 life cycle이 더 길어!!!!!
	// session 내장객체의 영역
	session.setAttribute("sid", id);
	session.setAttribute("name", "s_"+name);
	
	// application 내장객체의 영역 (얘는 session 보다 더 길어)
	application.setAttribute("aid", id);
	application.setAttribute("name", "a_"+name);
	
	// 포워딩
	// response.sendRedirect("scope3.jsp");  // 새로운 request 생성
	request.getRequestDispatcher("scope3.jsp").forward(request, response);
	%>
</body>
</html>