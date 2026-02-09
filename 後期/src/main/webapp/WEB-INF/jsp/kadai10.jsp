<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./styles/kadai09_1_1.css">
<title>ECC Pizza</title>
</head>
<body>

	<c:forEach var="product" items="${productList}">
		<%@ include file="header.jsp"%>
		<main>
			<div class="img-wrap">
				<img class="item-image" src="./images/${product.photo}"
					alt="${product.pname}">
			</div>

			<div class="desc-wrap">
				<div class="description">
					<h2 class="item-name">${product.pname}</h2>
					<p>${product.explanations}</p>

					<div class="price">
						<span>¥${product.price}</span>
						<button>デリバリーで注文</button>
					</div>
				</div>

				<div class="materials">
					<h3>使用素材</h3>
					<ul>
						<c:forEach var="i" items="${product.materials}">
							<li>${i}</li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</main>
		<%@ include file="footer.jsp"%>
	</c:forEach>

</body>
</html>