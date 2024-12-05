<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>index.jsp - 메인(인덱스)</h1>
		${logout}<br>
		<h1>로그인한 회원 정보 출력</h1>
		아이디 : ${user.username}<br>
		비밀번호 : ${user.userPW}<br>
		이름 : ${user.name}<br>
		성별 : ${user.gender}<br>
	</body>
</html>