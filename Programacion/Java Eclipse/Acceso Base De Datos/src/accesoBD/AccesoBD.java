package accesoBD;

import java.sql.*;

public class AccesoBD {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://192.168.56.21:3306/classicmodels", "progjava",
					"J#v#Prog2023");

			stmt = con.createStatement();

			rs = stmt.executeQuery("SELECT * FROM offices;");

			while (rs.next()) {
				System.out.println(rs.getString("city"));
			}

		} catch (SQLException e) {
			System.err.println("Error al conectar con la BD.");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
