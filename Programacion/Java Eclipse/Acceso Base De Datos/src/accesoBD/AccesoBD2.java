package accesoBD;

import java.sql.*;

public class AccesoBD2 {

	public static void main(String[] args) {

		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String sentenciaSQL = "SELECT orderDate, status, shippedDate, status, comments, customerNumber FROM orders WHERE orderNumber=10167;";
		try (Connection con = DriverManager.getConnection(urlMysql, "progjava", "J#v#Prog2023");
				Statement stmt = con.createStatement();) {

			try (ResultSet rs = stmt.executeQuery(sentenciaSQL)) {
				while (rs.next()) {
					System.out.println("Nº Cliente: " + rs.getString("customerNumber"));
					System.out.println("Estado: " + rs.getString("customerNumber"));
					System.out.println("Fecha pedido: " + rs.getString("orderDate"));
					System.out.println("Fecha Envío: " + rs.getString("shippedDate"));
					System.out.println("Comentarios: " + rs.getString("comments"));
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
