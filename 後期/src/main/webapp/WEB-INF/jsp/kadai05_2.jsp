<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ECC Pizza</title>
<link rel="Stylesheet" href="styles/kadai09_2_1.css">
</head>
<body>
	<jsp:include page="../../header.jsp" />
	<main>
		<aside class="side-menu">
			<nav>
				<ul class="shop-list">
					<li><a href="Shop?shop=nakazaki">中崎町店</a></li>
					<li><a href="Shop?shop=shinsaibashi">心斎橋店</a></li>
					<li><a href="Shop?shop=morinomiya">森ノ宮店</a></li>
				</ul>
			</nav>
		</aside>
		<h1>ECC Pizza 心斎橋店</h1>
		<img src="images/map.jpg" alt="">
		<table>
			<tr>
				<th rowspan="2">所在地</th>
				<td>〒123-4567</td>
			</tr>
			<tr>
				<td>大阪市北区中崎町1-23-4</td>
			</tr>
			<tr>
				<th>TEL</th>
				<td>06-1234-5678</td>
			</tr>
			<tr>
				<th>FAX</th>
				<td>06-1234-9876</td>
			</tr>
			<tr>
				<th rowspan="3">営業時間</th>
				<td>【月～土】10:00 - 23:00</td>
			</tr>
			<tr>
				<td>【日・祝日】12:00 - 23:00</td>
			</tr>
			<tr>
				<td>※L.O. 22:00</td>
			</tr>
			<tr>
				<th>定休日</th>
				<td>なし（不定休</td>
			</tr>
			<tr>
				<th>席数</th>
				<td>カウンター6席・テーブル20席</td>
			</tr>
			<tr>
				<th rowspan="2">アクセス</th>
				<td>大阪メトロ 谷町線「中崎町」駅より徒歩3分</td>
			</tr>
			<tr>
				<td>阪急線「阪急梅田」駅より徒歩10分</td>
			</tr>
		</table>
	</main>
	<jsp:include page="../../footer.jsp" />
</body>
</html>