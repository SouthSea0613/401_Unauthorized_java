<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
 	// 1초마다 새로고침 하는 거
 	window.onload=()=>{
	setTimeout(() => {
		location.reload();
	},1000)}'
</script>
<% 
	// JSP 파일에 자바+HTML 같이 쓰는 것 model1 방식
	// 현재는 각 분야 분담해서 따로 저장함(html,css,js,... 전부 최대한 세분화해서 정리함) model2 방식(우리가 수업하는 방식!)
	Calendar c = Calendar. getInstance();
	int hour = c.get(Calendar.HOUR_OF_DAY);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
%>  <!-- 자바 언어 쓰는 곳 -->
</head>
<body>
<h3>현재 시간은 <%=hour%>시 <%=min%>분 <%=sec%>초 입니다.</h3>
</body>
</html>