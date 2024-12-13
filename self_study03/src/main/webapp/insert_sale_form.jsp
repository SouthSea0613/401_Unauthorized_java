<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
			if('${msg}' != ''){
				alert('${msg}');
			}
		</script>
	</head>

	<body> 
		<jsp:include page="./header.jsp"></jsp:include>
		<jsp:include page="./nav.jsp"></jsp:include>
	
		<section>
			<form action="./insert_sale" name="insertSale">
				<table border="1">
					<tr>
						<td>전표번호</td>
						<td><input type="text" name="saleno" value="${nextSaleNo}" readonly="readonly"></td>
					</tr>
					<tr>
						<td>판매일자</td>
						<td><input type="text" name="saledate"></td>
					</tr>
					<tr>
						<td>도서코드</td>
						<td>
							<select name="bcode">
								<option value="" selected>도서선택</option>
								<c:forEach var="book" items="${bList}">
									<option value="${book.bcode}">[${book.bcode}]${book.bname}</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>판매수량</td>
						<td><input type="text" name="amount"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="button" value="매출등록" onclick="check()"><input type="reset" value="다시쓰기"></td>
					</tr>
				</table>
			</form>
		</section>
		
		<jsp:include page="./footer.jsp"></jsp:include>
		
		<script type="text/javascript">
			function check() {
				let form = document.insertSale;
				
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