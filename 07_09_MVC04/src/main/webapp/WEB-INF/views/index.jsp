<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	width: 500px;
	margin: 10% auto;
	border-collapse: collapse;
}

fieldset {
	width: 500px;
	text-align: center;
}

table, th, td {
	border: 1px solid black;
	text-align: center;
}

div {
	margin: auto;
}

input {
	padding: 5px
}
</style>
</head>
<body>
	<div>
		<form action="grades.do">
			<fieldset>
				<label> 성적입력 </label>
				<table>
					<tbody>
						<tr>
							<th>이름</th>
							<td><input type="text" name="name" placeholder="이름을 입력하세요."
								required="required"></td>
						</tr>
						<tr>
							<th>국어</th>
							<td><input type="number" name="kor" placeholder="국어점수"
								required="required"></td>
						</tr>
						<tr>
							<th>영어</th>
							<td><input type="number" name="eng" placeholder="영어점수"
								required="required"></td>
						</tr>
						<tr>
							<th>수학</th>
							<td><input type="number" name="math" placeholder="수학점수"
								required="required"></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2"><input type="submit" value="성적확인">
							<input type="hidden" name="cPage" value="3">
							</td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>