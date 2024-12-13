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
					<td>제품규격</td>
					<td>제품구분</td>
					<td>수량</td>
					<td>작업시작일</td>
				</tr>
				<c:forEach var="work" items="${workList}">
					<tr>
						<td>${work.w_workno}</td>
						<td>${work.p_code}</td>
						<td>${work.p_name}</td>
						<td>${work.p_size}</td>
						<td>${work.p_type}</td>
						<td>${work.w_quantity}</td>
						<td>${work.w_workdate}</td>
					</tr>
				</c:forEach>
			</table>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>