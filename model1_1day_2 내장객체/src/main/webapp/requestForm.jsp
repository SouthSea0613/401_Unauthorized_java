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
		<td>남<input type="radio" name="gender" value="male">
		여 <input type="radio" name="gender" value="female"> </td>
		</tr>
	<tr>	
		<td>취미</td>
		<td>독서<input type="checkbox" name="hobby" value="book">
		유튜브<input type="checkbox" name="hobby" value="youtube">
		축구<input type="checkbox" name="hobby" value="sccor"> 
		기타<input type="checkbox" name="hobby" value="gita">
		</td>
		<!-- String[] hobby = ['book','youtube']; -->
	</tr>
	<tr>
	<td colspan="2"> <input type="submit" value="전송"></td>
	</tr>
	</table>
</form>
</body>
</html>