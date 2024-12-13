<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<jsp:include page="./header.jsp"></jsp:include>
		<jsp:include page="./nav.jsp"></jsp:include>
		
		<section>
			<h2>제품조회</h2>
			<table border="1">
				<tr>
					<td>작업지시번호</td>
					<td>제품코드</td>
					<td>제품명</td>
					<td>준비</td>
					<td>인쇄</td>
					<td>코팅</td>
					<td>합지</td>
					<td>접합</td>
					<td>포장</td>
					<td>최종공정일자</td>
					<td>최종공정시간</td>
				</tr>
				<c:forEach var="process" items="${processList}">
					<tr>
						<td>${process.w_workno}</td>
						<td>${process.p_code}</td>
						<td>${process.p_name}</td>
						<td>${process.p_p1}</td>
						<td>${process.p_p2}</td>
						<td>${process.p_p3}</td>
						<td>${process.p_p4}</td>
						<td>${process.p_p5}</td>
						<td>${process.p_p6}</td>
						<td>${process.w_lastdate}</td>
						<td>${process.w_lasttime}</td>
					</tr>
				</c:forEach>
			</table>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>