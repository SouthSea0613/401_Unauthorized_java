<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<%
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
		%>
		<h3><%=hour %> : <%=min %> : <%=sec %></h3>
	</body>
</html>

<script>
	setTimeout(() => {
		location.reload(true);
	}, 1000);
</script>