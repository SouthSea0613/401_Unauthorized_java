<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg}
	<h1>result.jsp - 성적처리 결과임둥</h1>
	<h2>${name}님 (${age})세 성적표</h2>
	--------------------------------------------------<br>
	<h2>java : ${java}</h2>
	<h2>oracle : ${oracle}</h2>
	<h2>web : ${web}</h2>
	--------------------------------------------------<br>
	${result}

<%-- 	<h2>총점 : ${total}</h2>
	<h2>평균 : ${avg}</h2>
	<h2>학점 : ${grade}</h2> --%>
</body>
</html>