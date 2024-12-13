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
			<table border="1">
				<tr>
					<td>진료번호</td>
					<td>출판사</td>
					<td>판매일자</td>
					<td>도서코드</td>
					<td>도서명</td>
					<td>판매수량</td>
					<td>매출액</td>
				</tr>
				<c:forEach var="total" items="${totalList}">
					<tr>
						<td>${total.saleno}</td>
						<td>${total.comcodename}</td>
						<td>${total.saledate}</td>
						<td>${total.bcode}</td>
						<td>${total.bname}</td>
						<td>${total.amount}</td>
						<td>${total.total}</td>
					</tr>
				</c:forEach>
			</table>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>