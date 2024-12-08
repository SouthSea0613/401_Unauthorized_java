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
		<h1>회원목록조회/수정</h1>
		<table border="1">
			<tr>
				<td>회원번호</td>
				<td>회원성명</td>
				<td>고객등급</td>
				<td>매출</td>
			</tr>
			${salelist}
		</table>
		<footer>
			저작권 이미지
		</footer>
	</body>
</html>