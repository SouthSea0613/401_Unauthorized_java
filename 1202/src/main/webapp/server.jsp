<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String gender = request.getParameter("gender");
String[] hobby = request.getParameterValues("hobby");

System.out.printf("%s\n", name);
System.out.printf("%s\n", gender);
for(String e:hobby) {
	System.out.printf("%s\n", e);
}
%>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h3>server.jsp</h3>
		<table border="1" width="300">
			<tr>
				<td>이름</td>
				<td><%=name %><td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<%if(gender.equals("male")) {
					%>	남자<%
					}
					else {
					%>	여자<% 
					}
					%>
				<td>
			</tr>
			<tr>
				<td>취미</td>
				<td>
					<%
					for(String e: hobby) {
						%> <%=e %> <%
					}
					%>
				<td>
			</tr>
		</table>
	</body>
</html>