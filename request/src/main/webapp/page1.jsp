<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>page1.jsp</h1>

<!-- redirect 포워딩 -->
<%-- <% response.sendRedirect("page2.jsp"); %> --%>

<!-- (dispatcher) 포워딩 -->
<%-- <%request.getRequestDispatcher("page2.jsp").forward(request, response);%> --%>

<!-- model1 -->
<jsp:forward page="page2.jsp" />
</body>
</html>