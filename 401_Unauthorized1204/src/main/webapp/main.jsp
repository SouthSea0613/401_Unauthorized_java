<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>main.jsp</h1>
<h2>로그인 한 회원정보</h2>
${member.name}님 환영합니다<br>
아이디 : ${member.username}<br>
성별 : ${member.gender}<br>
${logout}
</body>
</html>