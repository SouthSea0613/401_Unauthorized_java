
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	setTimeout(()=>{
	location.reload();
	},1000);
	</script>
<%
//Jsp 에 java + HTML .... : model1
//Jsp(HTML,CSS,JS), Servlet,class(Java) : model2 
 	Calendar c=Calendar.getInstance();
	int hour=c.get(Calendar.HOUR_OF_DAY);
	int min=c.get(Calendar.MINUTE);
	int sec=c.get(Calendar.SECOND);
	
%>
</head>
<body>
<h3>현재시간은 <%=hour%>시 <%=min %>분 <%=sec %>초 입니다. </h3>
</body>
</html>