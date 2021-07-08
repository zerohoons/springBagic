<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send_go() {
		location.href="say.do";
	}
</script>
</head>
<body>
	<h2>첫번째 Spring MVC 예제</h2>
	<h3><a href="hello.do">hello</a></h3> <!-- .do 를 붙힘으로써 MVC 패턴을 활용 -->
	<h3><a href="hi.do">hi</a></h3> 
	<h3><a href="arr.do">arr</a></h3> 
	<h3><button onclick="send_go()">클릭</button></h3> 
</body>
</html>