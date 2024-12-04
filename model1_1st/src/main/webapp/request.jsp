<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request.jsp - 이거 너무 싫어!!!!!!!!!!!!!!!!!!!!!!</h1>
	getServletName: <%=request.getServerName()%><br> 
	getRemoteAddr: <%=request.getRemoteAddr()%><br> <!-- 이건 클라이언트주소 -->
	getProtocol: <%=request.getProtocol()%><br>
	getMethod: <%=request.getMethod()%><br> 
	URL: <%=request.getRequestURL()%><br> 
	URI: <%=request.getRequestURI()%><br> 
	ContextPath: <%=request.getContextPath()%><br>  <!-- 프로젝트 이름 -->
	QueryString: <%=request.getQueryString()%>
</body>
</html>