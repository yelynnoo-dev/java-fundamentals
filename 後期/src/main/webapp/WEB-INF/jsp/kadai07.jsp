<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="styles/kadai09_2_1.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=close" />
</head>
<body>
	<jsp:include page="header.jsp" />
	<main>
		<h2>
			<img src="images/grand_menu.jpg" alt="グランドメニュー">
		</h2>
		<h3>
			<c:out value="ピザ" />
		</h3>
		<div class="menu-container">
			<c:forEach var="pizza" items="${pizzaList}">
				<div class="item">
					<img class="item-image"
						src="./images/<c:out value="${pizza.photo}" />"
						alt="<c:out value="${pizza.pname}" />">
					<div class="item-info">
						<a href="ProductDetail?pname=${pizza.pname}"><c:out value="${pizza.pname}" /></a> <span
							class="price">¥<fmt:formatNumber value="${pizza.price}" /></span>
					</div>
				</div>
			</c:forEach>
		</div>
		<h3>
			<c:out value="パスタ" />
		</h3>
		<div class="menu-container">
			<c:forEach var="pasta" items="${pastaList}">
				<div class="item">
					<img class="item-image"
						src="./images/<c:out value="${pasta.photo}" />"
						alt="<c:out value="${pasta.pname}" />">
					<div class="item-info">
						<a href="ProductDetail?pname=${pasta.pname}"><c:out value="${pasta.pname}" /></a> <span
							class="price">¥<fmt:formatNumber value="${pasta.price}" /></span>
					</div>
				</div>
			</c:forEach>
		</div>
		<dialog id=imgDialog>
		<div>
			<img alt="" src=""> <span class="material-symbols-outlined">
				close </span> toast </span>
		</div>
		</dialog>
		<div class="scroll-top">
			<p>
				<a href="#"><img src="images/top_button.png" width="50"
					height="50" alt="TOPへ戻る"></a>
			</p>
		</div>
	</main>
	<jsp:include page="footer.jsp" />
	<script src="js/kadai07.js"></script>
</body>
</html>