<%@page import="dto.Person"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%! 
	private int sum;

	public int sumMethod(int x, int y) {
		return x + y;
	}
%>

<%
	// <% : 스크립틀릿 
	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);
	
	String req = "servlet 내장 객체는 사용불가";	// request, response, out, session, page, config, application

	Person person = new Person();
	person.setAge(20);
%>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h3>jspTest01.jsp</h3>
		<h1>현재 시간 : <%=hour%>시, <%=minute%>분, <%=second%>초</h1>
		<%=request.getServletPath() %>
		<%
			if(hour < 12) {
		%> 
				<h1>오전입니다.</h1>
		<%
			}
			else {
		%>
				<h1>오후입니다.</h1>
		<%
			}
		%>
		<hr>
		sum : <%=sumMethod(3, 4	) %>
		<br>
		나이 : <%=person.getAge() %>
	</body>
</html>