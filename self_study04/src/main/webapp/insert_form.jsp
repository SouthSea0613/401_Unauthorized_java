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
			<h2>제품조회</h2>
			<form action="./insert" name="insertform">
				<table border="1">
					<tr>
						<td>작업지시번호</td>
						<td><input type="text" name="w_workno" value="${w_workno}"></td>
					</tr>
					<tr>
						<td>재료준비</td>
						<td><input type="radio" name="p_p1" value="Y" checked="checked">완료<input type="radio" name="P_P1" value="N">작업중</td>
					</tr>
					<tr>
						<td>인쇄공정</td>
						<td><input type="radio" name="p_p2" value="Y" checked="checked">완료<input type="radio" name="P_P2" value="N">작업중</td>
					</tr>
					<tr>
						<td>코팅공정</td>
						<td><input type="radio" name="p_p3" value="Y" checked="checked">완료<input type="radio" name="P_P3" value="N">작업중</td>
					</tr>
					<tr>
						<td>합지공정</td>
						<td><input type="radio" name="p_p4" value="Y" checked="checked">완료<input type="radio" name="P_P4" value="N">작업중</td>
					</tr>
					<tr>
						<td>접합공정</td>
						<td><input type="radio" name="p_p5" value="Y" checked="checked">완료<input type="radio" name="P_P5" value="N">작업중</td>
					</tr>
					<tr>
						<td>포장적재</td>
						<td><input type="radio" name="p_p6" value="Y" checked="checked">완료<input type="radio" name="P_P6" value="N">작업중</td>
					</tr>
					<tr>
						<td>최종작업일자</td>
						<td><input type="text" name="w_lastdate"></td>
					</tr>
					<tr>
						<td>최종작업시간</td>
						<td><input type="text" name="w_lasttime"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" value="공정등록" onclick="insert()"><input type="button" value="공정수정" onclick="update()"><input type="reset" value="다시쓰기"></td>
					</tr>
				</table>
			</form>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
		
		<script type="text/javascript">
			function check() {
				let form = document.insertform;
				for (let i = 0; i < form.length - 3; i++) {
					alert(form[i].name + "이(가) 비어있습니다. 입력해주세요.");
					form[i].focus();
					return false;
				}
			}
			
			function insert(){
				check();
				document.insertform.submit();
			}
			
			function insert(){
				check();
				location.href="./update";
			}
		</script>
	</body>
</html>