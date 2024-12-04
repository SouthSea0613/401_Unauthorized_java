<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>request_Form</h3>
	<form action="server.jsp" method="get">
		<table border="1" width="300">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><input type="radio" name="gender" value="male">남 <input
					type="radio" name="gender" value="female">여</td>
			</tr>
			<tr>
				<td>취미</td>
				<td><input type="checkbox" name="hobby" value="book">독서
					<input type="checkbox" name="hobby" value="youtube">유튜브 <input
					type="checkbox" name="hobby" value="soccer">축구 <input
					type="checkbox" name="hobby" value="guiter">기타</td>
				<!-- String [] hobby = ['book' , 'youtube']; 이런식으로 넘어간대 -->
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>