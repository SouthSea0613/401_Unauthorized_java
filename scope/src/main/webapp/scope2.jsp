<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope2.jsp</h1>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		System.out.println(id+","+name);
		//request 내장객체의 영역
		request.setAttribute("rid", id);		
		request.setAttribute("rname", name);
		//session 내장객체의 영역
		session.setAttribute("sid", id);
		session.setAttribute("sname", name);
		//application 내장객체의 영역
		application.setAttribute("aid", id);
		application.setAttribute("aname", name);
		
		//redirect포워딩
		// response.sendRedirect("scope3.jsp"); //새로운 요청, request생성
		//포워딩
		request.getRequestDispatcher("scope3.jsp").forward(request, response);
	%>
	
</body>
</html>