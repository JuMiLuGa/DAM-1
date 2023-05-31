package accesoBD;

import java.sql.*;
import java.util.Scanner;

public class ProcedimientosAlmacenados3 {

	private static String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	private static String usuario = "javadmin";
	private static String clave = "20J@v@23";
	private static Double total = 0.0;

	public static void main(String[] args) {
		
		System.out.println("10 ULTIMOS PAGOS");
		
		mostrar10ultimospagos();
	}

	private static void mostrar10ultimospagos() {
		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				CallableStatement cs = con.prepareCall("{call mostrar10ultimospagos}");) {

			try (ResultSet rs = cs.executeQuery();) {
				double total = 0;
				while (rs.next()) {
					System.out.printf("(%3s) %12s\t\t [%s]:\t%.2f\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
					total += rs.getDouble(4);
					 
				}
				System.out.println("Total = " + Math.round(total));
			}

		} catch (SQLException e) {

			e.printStackTrace();
}
	}
}