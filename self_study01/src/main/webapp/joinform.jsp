<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<jsp:include page="./header_nav.jsp"></jsp:include>
		<section>
			<h1>홈쇼핑 회원 등록</h1>
			<form action="<%= request.getParameter("action") %>" name="joinform" method="post">
				<table border="1">
					<tr>
						<td>회원번호(자동발생)</td>
						<td><input type="text" id="회원번호" name="custno" value="<%= request.getParameter("custno") %>" readonly="readonly"></td>
					</tr>
					<tr>
						<td>회원성명</td>
						<td><input type="text" id="회원성명" name="custname"></td>
					</tr>
					<tr>
						<td>회원전화</td>
						<td><input type="text" id="회원전화" name="phone"></td>
					</tr>
					<tr>
						<td>회원주소</td>
						<td><input type="text" id="회원주소" name="address"></td>
					</tr>
					<tr>
						<td>가입일자</td>
						<td><input type="text" id="가입일자" name="joindate"></td>
					</tr>
					<tr>
						<td>고객등급[A:VIP, B:일반, C:직원]</td>
						<td><input type="text" id="고객등급" name="grade"></td>
					</tr>
					<tr>
						<td>도시코드</td>
						<td><input type="text" id="도시코드" name="city"></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="button" onclick="check()" value="<%= request.getParameter("buttontext") %>">
							<input type="button" onclick="move()" value="조회">
						</td>
					</tr>
				</table>
			</form>
		</section>
		<jsp:include page="./footer.jsp"></jsp:include>
	</body>
	<script type="text/javascript">
	function check(){
        const form = document.joinform;
    
        for(let i = 1; i < form.length - 2; i++){	// -2를 한 이유는 마지막 input:button 2개
           if(form[i].value==='' || form[i].value===null){
              alert(form[i].id + "이(가) 입력되지 않았습니다.");
              form[i].focus();
              return false;
           }
        }
        form.submit();
     }
	
     function move(){
        location.href="./memberlist";
     }
	</script>
</html>