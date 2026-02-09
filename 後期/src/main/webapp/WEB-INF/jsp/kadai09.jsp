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
<link rel="Stylesheet" href="styles/kadai10_1.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main>
		<h2>
			<img src="images/main.jpg" alt="ECCPizza_GrandOpen">
		</h2>
		<div class="about">
			<div class="about-info">
				<h3>ECC Pizzaについて</h3>
				<p>ECC Pizza は、大阪市北区に本店を構える地域密着型イタリアンです。</p>
				<p>
					<a href="kadai02_2.html">詳しくはこちら</a>
				</p>
			</div>
		</div>
		<div class="popular-items">
			<h3>人気メニュー</h3>
			<div class="item-wrap">
					<c:forEach var="menu" items="${menuList}">
					<div class="popular-item">
							<img class="item-image"
								src="./images/<c:out value="${menu.photo}" />"
								alt="<c:out value="${menu.pname}" />">
							<div class="item-info">
								<a href="ProductDetail?pname=${menu.pname}"><c:out value="${menu.pname}" /></a> <span
									class="price">¥<fmt:formatNumber value="${menu.price}" /></span>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<div class="scroll-top">
				<a href="#"><img src="images/top_button.png" alt="pageup"
					width="50" height="50"></a>
			</div>
	</main>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>