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
			<h1>투표하기</h1>
			<form action="./vote" name="voteform">
				<table border="1">
					<tr>
						<td>주민번호</td>
						<td><input type="text" name="v_jumin" id="주민번호"></td>
					</tr>
					<tr>
						<td>성명</td>
						<td><input type="text" name="v_name" id="성명"></td>
					</tr>
					<tr>
						<td>투표번호</td>
						<td>
							<select name="m_no" id="투표번호">
								<option value="" selected>후보자선택</option>
								<c:forEach var="member" items="${memberList}">
									<option value="${member.m_no}">${member.m_no}.${member.m_name}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>투표시간</td>
						<td><input type="text" name="v_time" id="투표시간"></td>
					</tr>
					<tr>
						<td>투표장소</td>
						<td><input type="text" name="v_area" id="투표장소"></td>
					</tr>
					<tr>
						<td>유권자확인</td>
						<td><input type="radio" name="v_confirm" value="Y" checked="checked">확인<input type="radio" name="v_confirm" value="N">미확인</td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" value="투표하기" onclick="vote()"><input type="button" value="다시하기" onclick="cancel()"></td>
					</tr>
				</table>
			</form>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
		
		<script type="text/javascript">
			function vote() {
				let form = document.voteform;
				
				for(let i = 0; i < form.length - 2; i++) {
					if(form[i].value === "" || form[i].value === null) {
						alert(form[i].id + "(이)가 입력(선택)되지 않았습니다.");
						form[i].focus();
						return false;
					}
				}
				
				form.submit();
			}
			
			function cancel() {
				let form = document.voteform;
				alert("처음부터 다시 입력합니다.")
				form.reset();
				form[0].focus();
			}
		</script>
	</body>
</html>