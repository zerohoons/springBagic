<%@page import="com.ict.db.VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	VO vo = new VO();
	vo.setIdx(request.getParameter("idx"));
	vo.setName(request.getParameter("name"));
	vo.setSubject(request.getParameter("subject"));
	vo.setEmail(request.getParameter("email"));
	vo.setPwd(request.getParameter("pwd"));
	vo.setContent(request.getParameter("content"));
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>