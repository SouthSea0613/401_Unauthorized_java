<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>server.jsp</h3>
	<!--  -->
	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	System.out.println("name: " + name);
	System.out.println("gender: " + gender);
	/* System.out.println("hobby: " +hobby[0]); */
	if (hobby != null) {
		for (String e : hobby) {
			System.out.println("hobby: " + e);
		}
	}
	%>
	<table border="1" width="300">
		<tr>
			<td>이름</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<%
				if (gender.equals("male")) {
				%> 남자 <%
				} else {
				%> 여자 <%
				}
				%>
			</td>
		</tr>
		<tr>
			<td>취미</td>
			<td>
				<%
				if (hobby != null) {
					for (String e : hobby) {
				%> <%=e%>&nbsp;&nbsp; <%
 }
 }
 %>
			</td>
		</tr>
	</table>
</body>
</html>