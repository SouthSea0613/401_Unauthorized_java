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
		<h1>admin.jsp - 관리자페이지</h1>
		
		${usersInfo}
		
		<hr>
		
		<table border="1">
			<c:forEach var="user" items="${usersList}">
				<tr>
					<td><a href="./normal?username=${user}">${user}</a></td>
					<td><a href="./delete?username=${user}">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
		<c:if test="${!empty userName}">
			로그인중<br>
		</c:if>
		<c:if test="${empty userName}">
			로그아웃중<br>
		</c:if>
		
		<c:if test="${userName == 'admin'}">
			관리자 로그인<br>
		</c:if>
		<c:if test="${userName != 'admin'}">
			일반인 로그인<br>
		</c:if>
		
		<c:choose>
			<c:when test="${userName == 'admin'}">
				관리자<br>
			</c:when>
			<c:when test="${userName != 'admin'}">
				일반인<br>
			</c:when>
		</c:choose>
		
		<c:set var="data" value="셋 테스트"/>
		<c:out value="${data}"></c:out>
		
		<hr>
		
		<div id="result"></div>
		<script>
		let usersList = ${usersListJson};
		
		let table = '<table border="1">';
		for (let id of usersList) {
			table += `<tr>`;
			table += `<td><a href=./normal?username=\${id}>\${id}</a></td>`;
			table += `<td><a href=./delete?username=\${id}>삭제</a></td>`;
			table += `<tr>`;
		}
		table += '</table>';
		document.getElementById('result').insertAdjacentHTML('beforeend', table);
		</script>
	</body>
</html>