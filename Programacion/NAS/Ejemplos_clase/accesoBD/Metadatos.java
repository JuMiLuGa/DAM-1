package accesoBD;

import java.sql.*;

public class Metadatos {

	public static void main(String[] args) {

		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";
//		usuario = "javadmin";
//		clave = "20J@v@23";
		
		try(Connection con = DriverManager.getConnection(urlMysql,usuario,clave);){
			DatabaseMetaData metadatos = con.getMetaData();
			
			System.out.println("SGBD: " + metadatos.getDatabaseProductName());
			System.out.println("Versión SGBD: " + metadatos.getDatabaseProductVersion());
			System.out.println("Driver: " + metadatos.getDriverName());
			System.out.println("Versión Driver: " + metadatos.getDriverVersion());
			
			System.out.println("\nTABLAS BD:");
			try(ResultSet rs = metadatos.getTables("classicmodels", null, "o%", null);){
				while(rs.next()) {
					System.out.println("BD: " + rs.getString("TABLE_CAT") + " NOMBRE: " + rs.getString("TABLE_NAME")
							+ " TIPO: " + rs.getString("TABLE_TYPE"));
				}
			}
		
			System.out.println("\nPROCEDIMIENTOS ALMACENADOS:");
			try(ResultSet rs = metadatos.getProcedures(null, null, null);){
				while(rs.next()) {
					System.out.println("BD: " + rs.getString("PROCEDURE_CAT") + " NOMBRE: " + rs.getString("PROCEDURE_NAME")
							+ " TIPO: " + rs.getString("PROCEDURE_TYPE"));
				}
			}
		
			System.out.println("\nCOLUMNAS TABLA pedidos:");
			try (ResultSet rs = metadatos.getColumns(null, null, "orders", null);) {
				while (rs.next()) {
					System.out.printf("%s: %s(%s)\n",rs.getString("COLUMN_NAME"), rs.getString("TYPE_NAME"), rs.getString("COLUMN_SIZE"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
