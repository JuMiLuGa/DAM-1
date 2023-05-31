package accesoBD;

import java.sql.*;

public class Transacciones {

	public static void main(String[] args) {

		String sentenciaInsertarPedido = "INSERT INTO orders ("
				+ "orderNumber, orderDate, requiredDate, status, customerNumber"
				+ ") VALUES (10600, '2023-05-25', '2023-05-31', 'Procesando',2044);";
		String sentenciaInsertarCliente = "INSERT INTO customers (customerNumber, "
				+ "customerName, contactLastName, contactFirstName, phone, addressLine1, "
				+ "city, country) VALUES(2044, 'Rastrillo, s.l.', 'Chosco', 'Pedro', "
				+ "'+34666444333', 'Avda. Sanabria, 32', 'A Estrada', 'Spain');";
		
		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";
		
		
		try (Connection con = DriverManager.getConnection(urlMysql,usuario,clave);
				Statement stmt = con.createStatement();){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}






