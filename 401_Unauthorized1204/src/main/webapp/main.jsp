<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main.jsp - 메인</h1>
	${logout}<br>
	<h1>로그인한 회원정보 출력</h1>
	아이디: ${member.username}<br>
	비 번: ${member.userpw}<br>
	이 름: ${member.irum}<br>
	성 별: ${member.gender}<br>
</body>
</html>