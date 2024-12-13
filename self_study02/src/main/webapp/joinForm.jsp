<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
			<h1>홈쇼핑 회원 등록</h1>
			<form action="./join" id="form" name="form" method="post">
				<table border="1">
					<tr>
						<td>회원번호(자동발생)</td>
						<td><input type="text" id="custNo" name="custNo"></td>
					</tr>
					<tr>
						<td>회원성명</td>
						<td><input type="text" id="custName" name="custName"></td>
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
						<td><input type="text" id="joinDate" name="joinDate"></td>
					</tr>
					<tr>
						<td>고객등급(A:VIP, B:일반, C:직원)</td>
						<td><input type="text" id="grade" name="grade"></td>
					</tr>
					<tr>
						<td>도시코드</td>
						<td><input type="text" id="city" name="city"></td>
					</tr>
					<tr>
						<td><input type="button" onclick="check()" value="등록"><input type="button" onclick="check()" value="조회"></td>
					</tr>
				</table>
			</form>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
		
		<script type="text/javascript">
			function check() {
				let form = document.form;
				
				for(let i = 1; i < form.length - 2; i++) {
					if(form[i].value === "") {
						alert(form[i].name + "이(가) 비어있습니다. 입력해주세요.");
						form[i].focus();
						return false;
					}
				}
				
				form.submit();
			} 
		</script>
	</body>
</html>