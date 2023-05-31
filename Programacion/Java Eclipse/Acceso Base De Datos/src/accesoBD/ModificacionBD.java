package accesoBD;

import java.sql.*;

public class ModificacionBD {

	public static void main(String[] args) {

		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";

		/*  INSERTAR DATOS  */
		
		String sentenciaSQL = "INSERT INTO offices VALUES ('8', 'Pontevedra', '+34 685 235 981', 'Av. Lugo, 25', null, null, 'Spain', '36982', 'EMEA');";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				Statement stmt = con.createStatement();) {
			int res = stmt.executeUpdate(sentenciaSQL);
			System.out.println("Cantidad de registros insertados: " + res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
