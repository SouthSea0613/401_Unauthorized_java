<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>여긴 scope3야 이제 그만 만들어....</h2>
<h3>request 영역값</h3>
<%-- id : <%= request.getAttribute("id")%><br> --%>
id: ${rid}<br>
name : ${requestScope.name}<br>

<h3>session 영역값: EL(백틱이랑 비슷한거)</h3>
id : ${sid}<br>
name : ${sessionScope.name}<br>

<h3>application 영역값</h3>
id : ${aid}<br>
name : ${applicationScope.name}<br>
</body>
</html>