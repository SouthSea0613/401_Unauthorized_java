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
			<h1>후보조회</h1>
			<table border="1">
				<tr>
					<td>후보번호</td>
					<td>성명</td>
					<td>소속정당</td>
					<td>학력</td>
					<td>주민번호</td>
					<td>지역구</td>
					<td>대표전화</td>
				</tr>
				<c:forEach var="member" items="${memberList}">
					<tr>
						<td>${member.m_no}</td>
						<td>${member.m_name}</td>
						<td>${member.p_name}</td>
						<td>${member.m_school}</td>
						<td>${member.m_jumin}</td>
						<td>${member.m_city}</td>
						<td>${member.p_tel}</td>
					</tr>
				</c:forEach>
			</table>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
</html>