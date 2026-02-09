<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 取得するインスタンスのクラスをインポート --%>
<%@ page import="beans.*" %>
<%
//リクエストスコープに保存するインスタンスの生成
Human human = new Human("sakae",25);
//リクエストスコープにインスタンスを保存
request.setAttribute("human", human);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beansテスト</title>
</head>
<body>
<%
//リクエストスコープからインスタンスを取得
Human h = (Human)request.getAttribute("human");
%>
名前：<%= h.getName() %><br>
年齢：<%= h.getAge() %>
</body>
</html>