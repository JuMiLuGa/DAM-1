package accesoBD;

import java.sql.*;

public class ModificacionBD2 {

	public static void main(String[] args) {

		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";

		/*  ACTUALIZAR DATOS  */
		
		String sentenciaSQL = "UPDATE offices SET phone = '+34 658 451 289' WHERE officeCode = 8;";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				Statement stmt = con.createStatement();) {
			int res = stmt.executeUpdate(sentenciaSQL);
			System.out.println("Cantidad de registros actualizados: " + res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
