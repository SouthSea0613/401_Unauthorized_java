<%@page import="bean.Person"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	//<%: 스크립틀릿(java코드)
	//jsp --> servlet(class)변환 --> 실행
	Calendar c =Calendar.getInstance();
	int hour = c.get(Calendar.HOUR);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
	/* String request="jsp 내장 객체는 사용불가"; */
	/* String out="jsp 내장 객체는 사용불가"; */
	/* session(유지), page, out, response */

%>
<% Person p = new Person(); 
	p.setAge(20);
%>
<body>
	<h3>jspTest1.jsp</h3>
	<h1>현재시간 <%=hour%>시 <%=min%>분 <%=sec%>초</h1>
	<%-- <%=request.getServletContext().getRealPath("/") %> --%>
	<%if(hour>=12) {%>
	<h1>오후입니다.</h1>
	<%}else {%>
	<h1>오전입니다.</h1>
	<%} %>
	<hr>
	sum: <%=sumMethod(3, 4) %>
	<hr>
	나이: <div><%=p.getAge() %></div>
	
</body>
</html>

<!-- 서블릿의 필드, 메소드 선언, 위치 상관없음 -->
<%!
	private int sum;

	public int sumMethod(int x, int y){
		return x+y;
	}
%>
