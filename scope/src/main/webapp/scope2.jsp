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
	<%request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		//request 내장객체의 영역
		request.setAttribute("id","r_"+ id);
		request.setAttribute("name","r_"+ name);
		//session 내장객체의 영역
		session.setAttribute("id","s_"+ id);
		session.setAttribute("name","s_"+ name);
		//application 내장객체의 영역
		application.setAttribute("id","a_"+ id); // 쓸일이 별로 없음
		application.setAttribute("name","a_"+ name);
		//포워딩
		//response.sendRedirect("scope3.jsp"); //새로운 request 생성
		//(Dispatcher)포워딩
		//request.getRequestDispatcher("scope3.jsp").forward(request, response);
	%>
	<jsp:forward page=""></jsp:forward> <!-- model1 -->
</body>
</html>