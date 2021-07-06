<%@page import="com.ict.edu.Service"%>
<%@page
	import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		applicationContext.xml을 읽기 위해서 리스너를 만들어야한다.
		리스너는 프로젝트 당 하나만 있어도 된다.
		만드는 방법은 두가진이다.
		1) 자바에서 만드는 방법 (리스너)
		2) web.xml에서 만들기
	 -->
	<!-- Web.xml에서 applicationContext.xml의 이름과 위치를 바꿀 수 있다. -->
	<%
		WebApplicationContext context =
		WebApplicationContextUtils.getWebApplicationContext(application);

		Service service = (Service) context.getBean("service");
		String msg = service.biz();
		out.println("<h2>" + msg + "</h2>");
	%>
</body>
</html>