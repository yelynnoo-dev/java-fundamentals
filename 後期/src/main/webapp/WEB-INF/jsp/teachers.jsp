<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page import="model.*"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher List</title>
</head>
<body>
	<h1>SE1の先生一覧</h1>
	<c:forEach var="teacher" items="${techList}">
		<p>
			名前：
			<c:out value="${teacher.name}" />
			先生、 年齢：
			<c:out value="${teacher.age}" />
			歳
		</p>
	</c:forEach>
</body>
</html>