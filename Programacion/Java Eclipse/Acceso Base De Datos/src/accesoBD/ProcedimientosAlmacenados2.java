package accesoBD;

import java.sql.*;
import java.util.Scanner;

public class ProcedimientosAlmacenados2 {

	private static String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	private static String usuario = "javadmin";
	private static String clave = "20J@v@23";
	private static String ter;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
		
		System.out.println("¿Que territorio quiere mostrar?");
		ter = scn.next();
		mostrarEmailsEmpleados();
	}

	private static void mostrarEmailsEmpleados() {
		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				CallableStatement cs = con.prepareCall("{call mostrarEmailsEmpleados('" + ter + "')}");) {

			try (ResultSet rs = cs.executeQuery();) {
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

}