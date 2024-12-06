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
<h1>admin.jsp</h1>
${idListHtml}

<hr>
<div id="result">

</div>

<h1>JSTL 문법</h1>

	<c:if test="${empty userName}">
		<h3>id 속성이 비어있음 === 로그아웃 중..</h3>
	</c:if>
	<c:if test="${!empty userName}">
		<h3>id 속성이 있음 === 로그인 중..</h3>
	</c:if>


	<c:if test="${userName=='admin'}">
		<h3>관리자 모드</h3>
	</c:if>
	<c:if test="${userName!='admin'}">
		<h3>일반인 모드</h3>
	</c:if>
	
	
	<c:choose>
		<c:when test="${userName=='admin'}">
		<h3>관리자 모드</h3>
		</c:when>
	</c:choose>
	<c:choose>
		<c:when test="${userName!='admin'}">
		<h3>일반 모드</h3>
		</c:when>
	</c:choose>
	<hr>
	<c:set var="data" value="관리자" />
	<c:out value="${data}"></c:out>
	
<script>
	// mList는 JavaScript 배열 객체
	let idList = ${idListJson}; // 예시 데이터
	console.log(idList); //js객체

	//${id}: jsp El
	//\${id}: ``, 변수보관
	// 테이블 생성
	let tbl = '<table border="1">';
	for (let id of idList) {
	    tbl += '<tr>';
	    tbl += `<td><a href=./nomal?username=\${id}>\${id}</a></td>`;
	    tbl += `<td><a href=./delete?username=\${id}>삭제</a></td>`;
	    tbl += '</tr>';
	}
	tbl += '</table>';

	// 결과를 DOM에 추가
	//afterbegin: 요소의 첫 번째 자식 요소 앞에 삽입.
	document.getElementById('result').insertAdjacentHTML('beforeend', tbl);
</script>
</body>
</html>