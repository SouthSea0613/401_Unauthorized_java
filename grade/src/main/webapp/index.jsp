<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적처리 양식입니둥</h1>
	<form action="./score" method="post">
		<table width="300">
				<tr>
				<td>이름</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td><input type="text" name="birth" size="20"></td>
			</tr>
			<tr>
				<td>JAVA</td>
				<td><input type="text" name="java" size="20"></td>
			</tr>
			<tr>
				<td>Oracle</td>
				<td><input type="text" name="oracle" size="20"></td>
			</tr>
			<tr>
				<td>Web</td>
				<td><input type="text" name="web" size="20"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><button>전송</button></td>
			</tr>
		</table>
	</form>
</body>
</html>