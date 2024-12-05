<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>joinFrm.jsp - 회원가입 양식</h1>
	<!-- localhost : 8080/MemberJoin/memberjoin -->
	<form action="memberjoin" method="post">
		ID : <input type="text" name="id"> <br>
		PW : <input type="password" name="pw"> <br>
		NAME : <input type="text" name="name"> <br>
		BIRTH : <input type="text" name="birth"> <br>
		<input type="submit" value="회원가입">
		<button>회원가입</button>
	</form>
</body>
</html>