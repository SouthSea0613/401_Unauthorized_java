<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입을 시작합니다</title>
</head>
<body>
<h3 style="color: red";>지긋지긋한 회원가입 우리는 회원이 더이상 필요치않아요 ^_^</h3>
<form action="join" method="post">
아이디: <input type="text" name="id"><br>
<!-- 파라미터네임을 네임에 넣자 -->
비밀번호: <input type="text" name="pw"><br>
이름: <input type="text" name="name"><br>
나이: <input type="text" name="age"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>