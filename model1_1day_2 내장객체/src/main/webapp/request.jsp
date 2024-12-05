<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>request.jsp--박은경</h1>
getServerName: <%=request.getServerName()%><br>
getRemoteAddr: <%=request.getRemoteAddr()%><br>
getProtocol: <%=request.getProtocol()%><br>
getMethod : <%=request.getMethod()%><br>
URL : <%=request.getRequestURL() %><br>
URI : <%=request.getRequestURI() %><br>
ContextPath : <%=request.getContextPath() %><br>
QueryString : <%=request.getQueryString() %><br>
</body>
</html>