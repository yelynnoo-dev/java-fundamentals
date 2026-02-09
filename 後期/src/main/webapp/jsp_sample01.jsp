<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String name="イェリンオー";
int age=24;
int sum=0;

for(int i=1;i<=100;i++){
	sum+=i;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPサンプル01</title>
</head>
<body>
名前：<%= name %> <br>
年齢：<%= age %> <br>
合計：<%= sum %>
</body>
</html>