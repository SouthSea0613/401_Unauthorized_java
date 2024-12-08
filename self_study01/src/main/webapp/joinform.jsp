<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<header>
			쇼핑몰 회원관리 ver1.0
		</header>
		<nav>
			<a href="./joinform">회원등록</a>
			<a href="./memberlist">회원목록 조회/수정</a>
			<a href="./salelist">회원매출조회</a>
			<a href="./main">홈</a>
		</nav>
		<h1>홈쇼핑 회원 등록</h1>
		<form action="<%= request.getParameter("action") %>" method="post">
			<table border="1">
				<tr>
					<td>회원번호(자동발생)</td>
					<td><input type="text" id="custno" name="custno" value="<%= request.getParameter("custno") %>" readonly="readonly"></td>
				</tr>
				<tr>
					<td>회원성명</td>
					<td><input type="text" id="custname" name="custname"></td>
				</tr>
				<tr>
					<td>회원전화</td>
					<td><input type="text" id="phone" name="phone"></td>
				</tr>
				<tr>
					<td>회원주소</td>
					<td><input type="text" id="address" name="address"></td>
				</tr>
				<tr>
					<td>가입일자</td>
					<td><input type="text" id="joindate" name="joindate"></td>
				</tr>
				<tr>
					<td>고객등급[A:VIP, B:일반, C:직원]</td>
					<td><input type="text" id="grade" name="grade"></td>
				</tr>
				<tr>
					<td>도시코드</td>
					<td><input type="text" id="city" name="city"></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit"><%= request.getParameter("buttontext") %></button></td>
				</tr>
			</table>
		</form>
		<footer>
			저작권 이미지
		</footer>
	</body>
</html>