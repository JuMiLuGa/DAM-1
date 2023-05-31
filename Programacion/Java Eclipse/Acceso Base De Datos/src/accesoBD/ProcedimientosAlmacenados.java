package accesoBD;

import java.sql.*;

public class ProcedimientosAlmacenados {

	private static String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	private static String usuario = "javadmin";
	private static String clave = "20J@v@23";

	public static void main(String[] args) {
		mostrarEmailsEmpleadosEMEA();
	}

	private static void mostrarEmailsEmpleadosEMEA() {
		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				CallableStatement cs = con.prepareCall("{call mostrarEmailsEmpleadosEMEA}");) {

			try (ResultSet rs = cs.executeQuery();) {
				while (rs.next()) {
					System.out.println(rs.getString(1));
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

}