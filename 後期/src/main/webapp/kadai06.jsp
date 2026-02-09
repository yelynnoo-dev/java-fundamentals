<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.Cart"%>
<%
String pname = "マルゲリータ";
String contents = "定番のマルゲリータピザです。<br>素材は国産にこだわっており、安全にお召し上がりいただけます。<br>";
int price = 1200;
String photo = "margherita_big.jpg";
String[] materials = { "北海道産モッツァレラチーズ", "国産バジル", "熊本県産トマト", "国産トマトソース" };

int count = 1;
List<Cart> cartList = (List<Cart>) session.getAttribute("cartList");
if (cartList == null) {
	cartList = new ArrayList<>();
} else {
	Cart cart = cartList.get(0);
	count = (int) cart.getPnumber();
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="Stylesheet" href="./styles/kadai09_1_1.css">
<title>ECC Pizza | マルゲリータ</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<main>
		<div class="img-wrap">
			<img class="item-image" src="./images/<%=photo%>" alt="マルゲリータ">
		</div>
		<div class="desc-wrap">
			<div class="description">
				<h2 class="item-name"><%=pname%></h2>
				<p>
					<%=contents%><br>
				</p>
				<div class="price">
					<span>¥<%=price%></span>
					<form action="Kadai06" method="get">
						個数：<input type="number" name="number" value="<%=count%>" min="1"
							style="width: 40px;" /> <input type="hidden" name="pname"
							value="<%=pname%>" /> <input type="submit" value="デリバリーで注文"
							name="submit" />
					</form>
				</div>
			</div>
			<div class="materials">
				<h3>使用素材</h3>
				<ul>
					<%
					for (int i = 0; i < materials.length; i++) {
					%>
					<li><%=materials[i]%></li>
					<%
					}
					%>
				</ul>
			</div>
		</div>
	</main>
	<jsp:include page="footer.jsp"/>
</body>
</html>