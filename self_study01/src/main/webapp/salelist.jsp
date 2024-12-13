<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<jsp:include page="./header_nav.jsp"></jsp:include>
		<section>
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
		</section>
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>