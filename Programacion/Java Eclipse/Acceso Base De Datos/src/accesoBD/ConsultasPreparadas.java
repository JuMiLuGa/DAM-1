package accesoBD;

import java.sql.*;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";

		String sentenciaSQL = "SELECT productCode, productName, quantityInStock FROM products WHERE productLine = ? AND quantityInStock < ?;";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL);) {
				ps.setString(1, "Motorcycles");
				ps.setInt(2, 1000);
				
				System.out.println("MOTOS con stock menos a 1000: ");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("productName") + "(" + rs.getString("productCode") + "): " + rs.getString("quantityInStock"));
			}
			
		} catch (Exception e) {
			System.err.println("Error al intentar acceder a la BD");
			e.printStackTrace();
		}
	}

}
