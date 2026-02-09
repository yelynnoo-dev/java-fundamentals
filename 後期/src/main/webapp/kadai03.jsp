<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String pname = "マルゲリータ";
String contents = "定番のマルゲリータピザです。<br>素材は国産にこだわっており、安全にお召し上がりいただけます。<br>";
int price = 1200;
String photo = "margherita_big.jpg";
String[] materials = { "北海道産モッツァレラチーズ", "国産バジル", "熊本県産トマト", "国産トマトソース" };
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="Stylesheet" href="../styles/kadai09_1_1.css">
<title>kadai03</title>
</head>
<body>
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
					<button>デリバリーで注文</button>
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
</body>
</html>