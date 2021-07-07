<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="result.jsp" method="post">
		<select name="search">
			<option value="0">::선택하세요::</option>
			<option value="1">번호로 찾기</option>
			<option value="2">아이디로 찾기</option>
			<option value="3">연락처로 찾기</option>
			<option value="4">나이로 찾기</option>			
		</select>
		<input type="text" name="keyword" required="required">
		<input type="submit" value="찾기">
	</form>
</body>
</html>