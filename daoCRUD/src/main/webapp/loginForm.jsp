<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>loginForm.jsp - 로그인 양식</h1>
		<form action="./login" method="post">
			아이디 : <input type="text" name="userName"><br>
			비밀번호 : <input type="password" name="userPW"><br>
			<button>로그인</button>
			<a href="./joinform">회원가입</a>
		</form>
	</body>
</html>