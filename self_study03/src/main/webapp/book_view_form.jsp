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
					<td>도서 코드</td>
					<td>도서 명</td>
					<td>총매출액</td>
				</tr>
				<c:forEach var="book" items="${bookList}">
					<tr>
						<td>${book.bcode}</td>
						<td>${book.bname}</td>
						<td>${book.total}</td>
					</tr>
				</c:forEach>
			</table>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>