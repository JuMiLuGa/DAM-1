package accesoBD;

import java.sql.*;

public class ProcedimientosAlmacenados {
	private static String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	private static String usuarioBD = "javadmin";
	private static String claveBD = "20J@v@23";
	
	public static void main(String[] args) {
		System.out.println("\nEMAILS EMPLEADOS EMEA:");
		mostrarEmailsEmpleadosEMEA();
		System.out.println("\nDATOS EMPLEADOS EMEA:");
		mostrarEmailsEmpleadosDeTerritorio("EMEA");
		System.out.println("\nÚLTIMOS 10 PAGOS:");
		mostrarUltimosPagos();
		
		
	}

	private static void mostrarEmailsEmpleadosEMEA() {
		try(Connection con = DriverManager.getConnection(urlMysql, usuarioBD,claveBD);
				CallableStatement cs = con.prepareCall("{call ObtenerEmailsEmpleadosEMEA()};");){
			try(ResultSet rs = cs.executeQuery();){
				while(rs.next()) {
					System.out.println(rs.getString(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void mostrarEmailsEmpleadosDeTerritorio(String territorio) {
		try(Connection con = DriverManager.getConnection(urlMysql, usuarioBD,claveBD);
				CallableStatement cs = con.prepareCall("{call ObtenerEmailsEmpleadosDeTerritorio(?)}");){
			cs.setString(1, territorio);
			try(ResultSet rs = cs.executeQuery();){
				while(rs.next()) {
					System.out.println(rs.getString("Nombre") + " " + rs.getString("Apellidos") + ": " + rs.getString("email"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void mostrarUltimosPagos() {
		double importeTotal = 0;

		try(Connection con = DriverManager.getConnection(urlMysql, usuarioBD,claveBD);
				CallableStatement cs = con.prepareCall("{call ObtenerUltimosPagos()}");){
			try(ResultSet rs = cs.executeQuery();){
				while(rs.next()) {
					int numCliente = rs.getInt("customerNumber");
					String numComprobacion = rs.getString("checkNumber");
					Date fechaPago = rs.getDate("paymentDate");
					double importe = rs.getDouble("amount");
					
					importeTotal += importe;
					String fechaFormateada = String.format("[%1$tA de %1$tB de %1$tY]", fechaPago);
					System.out.println(String.format("(%1$3d) %2$-12s %3$30s: %4$10.2f", numCliente, numComprobacion, fechaFormateada, importe));

			
				}
				System.out.println("-".repeat(43));
				System.out.println(String.format("%32s %10.2f", "TOTAL:", importeTotal));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
