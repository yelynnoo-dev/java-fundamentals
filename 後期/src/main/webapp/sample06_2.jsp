<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.*" %>
<%
	Human human = new Human("さかえ",27);
	session = request.getSession();
	session.setAttribute("sakae", human);
	Human h = (Human)session.getAttribute("sakae");
	//session.removeAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッションスコープ</title>
</head>
<body>
名前：<%= h.getName() %><br>
年齢：<%= h.getAge() %>
</body>
</html>