<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="beans.*"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%
Human human = new Human("オー", 24);
application.setAttribute("sample", human);

int n1 = 2;
int n2 = 5;
application.setAttribute("n1", n1);
application.setAttribute("n2", n2);

String[] array = {"さかえ", "たなか", "いそざき", "もり"};
pageContext.setAttribute("teachers", array);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="タグで表示しています。" />
	<br>
	<c:out value="${sample.name }" />
	<br>

	<c:if test="${n1%2==0 }">
		<c:out value="${n1 }は偶数です。" />
	</c:if>
	<br>

	<c:choose>
		<c:when test="${n2%2==0 }">
			<c:out value="${n2 }は偶数です。" />
		</c:when>
		<c:otherwise>
			<c:out value="${n2 }は奇数です。" />
		</c:otherwise>
	</c:choose>
	<br>
	
	<c:forEach var="teacher" items="${teachers }">
		<c:out value="${teacher }"/>先生<br>
	</c:forEach>
</body>
</html>