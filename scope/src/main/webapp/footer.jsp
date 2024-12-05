<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>footer.jsp</h1>
	인천일보 아카데미, 032-1111-2222	
	관리자 : <%=request.getParameter("name") %>, 나이 : ${param.age}
</body>
</html>