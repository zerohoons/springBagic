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
	<form action="calc.do">
		<table>
			<thead>
				<tr>
					<th colspan="4">계산기</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="4"><input type="number" name="num1"></td>
				</tr>
				<tr style="border: none;">
					<td><input type="radio" value="plus" name="calc">+</td>
					<td><input type="radio" value="minus" name="calc">-</td>
					<td><input type="radio" value="multi" name="calc">*</td>
					<td><input type="radio" value="devid" name="calc">/</td>
				</tr>
				<tr>
					<td colspan="4"><input type="number" name="num2"></td>
				</tr>
			</tbody>
		</table>
		<p>취미 :
		<input type="checkbox" name="hobby" value="축구">축구
		<input type="checkbox" name="hobby" value="야구">야구
		<input type="checkbox" name="hobby" value="배구">배구
		<input type="checkbox" name="hobby" value="농구">농구
		</p>
		<input type="hidden" name="memberNO" value="asd123">
		<input type="submit" value="보내기">
	</form>
</body>
</html>