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
	/* <% : 스크립틀릿  (자바코드) */
	/*  jsp -> servlet으로 변환 -> 실행  */
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
	// String request = "jsp 내장객체는 사용불가"
	// out, session, page 도 내장객체!!!!!!!!!!! 이름 변형해봐 사용하게 되면 Duplicate  나옴
	%>
	<%Person p = new Person(); 
	p.setAge(20);
	%>
<body>
	<h3>jspTest1.jsp</h3>
	 <h4>현재 시간은 <%=hour%>시 <%=min%>분 <%=sec%>초 입니다.</h4>
	  <%=request.getServletContext().getRealPath("/") %>
	 <% if (hour >= 12) {
		%>	<h3>오후입니다.</h3>
	  <% } else { %>
	   	<h3>오전입니다.</h3>
	   <%} %>
	   <hr>
	   sum: <%=sumMethod(3,4) %>
	   <hr>
	  나이: <div><%=p.getAge() %></div>
</body>
</html>
<!-- 필드, 메소드 선언, 위치 상관 없음  -->
<%!   /* < 이건 선언문  */
	private int sum;
	
	public int sumMethod(int x, int y) {
		return x+y;
	}
%>