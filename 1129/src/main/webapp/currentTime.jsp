<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

Java SE -기존 
Java EE: Java SE + tomcat에서 제공하는 servelt=api.jar추가

Jsp에 Java+HTML... : model1 방식(옛날)
Jsp(html,css,js),  Java(Servlet, class) : model2(요즘)

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	setTimeout(() => {
		location.reload();
	}, 1000);
</script>
	<%
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR_OF_DAY);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	%>
</head>
<body>
<h3>
	현지시간은 <%=hour%>시 <%=min%>분 <%=sec%>초 입니다.
</h3>
</body>
</html>