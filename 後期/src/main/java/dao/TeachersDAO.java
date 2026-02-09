package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Teacher;

public class TeachersDAO {
	String DB_URL = "jdbc:mysql://localhost:3306/ECC";
	String DB_USR = "ecc";
	String DB_PASS = "S@kae144";

	public List<Teacher> findAll() {

		List<Teacher> techList = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USR, DB_PASS)) {
			String sql = "select id,name,age from TEACHERS";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				Teacher teacher = new Teacher(id, name, age);
				techList.add(teacher);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

		return techList;
	}
}
