<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request.jsp - South_Sea</h1>
	getRemoteHost : <%=request.getRemoteHost() %><br>
	getRemoteAddr : <%=request.getRemoteAddr() %><br>
	getProtocol : <%=request.getProtocol() %><br>
	getMethod : <%=request.getMethod() %><br>
	getRequestURL : <%=request.getRequestURL() %><br>
	getRequestURI : <%=request.getRequestURI() %><br>
	ContextPath : <%=request.getContextPath() %><br>
	QueryString : <%=request.getQueryString() %><br>
</body>
</html>