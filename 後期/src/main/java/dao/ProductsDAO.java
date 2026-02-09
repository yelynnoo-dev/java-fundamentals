package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductsDAO {

	String DB_URL = "jdbc:mysql://localhost:3306/ECCPIZZA_DB";
	String DB_USR = "se1b";
	String DB_PASS = "S@kae144";

	public List<Product> findAll() {

		//ArrayListの作成（戻り値として返す）
		List<Product> productList = new ArrayList<>();

		//データベースのドライバ読み込み
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//データベースに接続
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PASS)) {

			//SQL
			String sql = "select product_no, pname, category, photo, explanation, price, materials from products";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SQLを実行して、結果を取得
			ResultSet rs = pStmt.executeQuery();

			//取得したデータをリストに格納する
			while (rs.next()) {
				String product_no = rs.getString("product_no");
				String prname = rs.getString("pname");
				String category = rs.getString("category");
				String photo = rs.getString("photo");
				String explanation = rs.getString("explanation");
				int price = rs.getInt("price");
				String materials = rs.getString("materials");

				//インスタンスに格納
				Product product = new Product(product_no, prname, category, photo, price, explanation, materials);
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return productList;
	}

	public List<Product> findProduct(String pname) {

		List<Product> productList = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PASS)) {

			String sql = "select product_no, pname, category, photo, explanation, price, materials from products where pname = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, pname);
			ResultSet rs = pStmt.executeQuery();

			while(rs.next()) {
				String product_no = rs.getString("product_no");
				String prname = rs.getString("pname");
				String category = rs.getString("category");
				String photo = rs.getString("photo");
				String explanation = rs.getString("explanation");
				int price = rs.getInt("price");
				String materials = rs.getString("materials");

				Product product = new Product(product_no, prname, category, photo, price, explanation, materials);
				productList.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return productList;

	}
}
