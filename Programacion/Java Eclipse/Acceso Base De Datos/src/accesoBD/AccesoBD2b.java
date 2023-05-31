package accesoBD;

import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;

public class AccesoBD2b {

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

		// JNDI (Java Naming and Directory Interface)
		MysqlDataSource dataSource = new MysqlDataSource();

		dataSource.setServerName("192.168.56.21");
		dataSource.setPort(3306);
		dataSource.setDatabaseName("classicmodels");
		dataSource.setUser("progjava");
		dataSource.setPassword("J#v#Prog2023");

		if (dataSource != null) {
			String sql = "SELECT CURRENT_DATE;";
			try (Connection con = dataSource.getConnection(); Statement stmt = con.createStatement();) {
				try (ResultSet rs = stmt.executeQuery(sql);) {
					if (rs.next()) {
						System.out.println("La fecha actual es: " + rs.getDate(1));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}