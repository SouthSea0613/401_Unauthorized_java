<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- page영역 > request영역 > session영역 > application영역 -->
<h1>scope3.jsp</h1>

<h3>request 영역값</h3>
id : ${id} <br>
name : ${requestScope.name} <br>

<h3>session 영역값 : EL</h3>
id : ${id} <br>
name : ${sessionScope.name} <br>

<!-- 세션영역 데이터 삭제 -->
<%session.removeAttribute("id");
session.removeAttribute("name");
%>

<h3>application 영역값 : EL</h3>
id : ${id} <br>
name : ${applicationScope.name} <br>
<hr>
<h3>Session: Test</h3>
쿠키에 저장된 sessionID : <%=session.getId()%> <br>
로그인(인증) 성공시 : 	 <%session.setAttribute("id","cha"); %> <br>
로그인 여부판단(인가) : 	<% if(session.getAttribute("id")!=null){%> <br>
					<h3>cha님 환영합니다.</h3> <br>
					<% }else{ %> <br>
					<h3>로그인페이지로 이동</h3> <br>
					<%} %>
로그아웃(세션무효화) : <%session.invalidate(); %> <br>
세션 새로 발급 : <%request.getSession(); %> <br>
쿠키에 저장된 sessionID : <%=session.getId() %> <br>

<h3>include 중요</h3>
<jsp:include page="footer.jsp"><!-- 끝태그 생략 불가능 -->
<jsp:param value="Hong" name="name"/>
<jsp:param value="30" name="age"/></jsp:include>
</body>
</html>