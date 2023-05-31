package EjerciciosAccesoBD;

import java.sql.*;

public class Transacciones {

    public static void main(String[] args) {

        String sentenciaInsertarPedido = "INSERT INTO orders (orderNumber, orderDate, requiredDate, status, customerNumber) VALUES (10600, '2023-05-25', '2023-05-31', 'Procesando',2044);";
        String sentenciaInsertarCliente = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) VALUES (2054, 'Rastrillo, s.l', 'Chosco', 'Pedro', '+34666444333', 'Avda. Sanabria, 32', 'A Estrada', 'Spain');";

        String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
        String usuarioBD = "progjava";
        String claveBD = "J#v#Prog2023";

//        try (Connection con = DriverManager.getConnection(urlMysql, usuarioBD, claveBD);) {
//
//            con.setAutoCommit(false);
//            try (Statement stmt = con.createStatement();) {
//                stmt.executeUpdate(sentenciaInsertarCliente);
//                stmt.executeUpdate(sentenciaInsertarPedido);
//                con.commit();
//                System.out.println("Pedido introducido correctamente");
//            } catch (SQLException e) {
//                con.rollback();
//                System.err.println("Se ha producido un error al intentar introducir el pedido, por lo que se ha abortado el proceso");
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        int numRegistrosInsertados = 0;
        try(Connection con = DriverManager.getConnection(urlMysql,usuarioBD,claveBD);
                Statement stmt = con.createStatement();){
            for(int i = 2030; i<2050;i++) {
                numRegistrosInsertados += stmt.executeUpdate("INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) VALUES ("+i+", 'Rastrillo, s.l', 'Chosco', 'Pedro', '+34666444333', 'Avda. Sanabria, 32', 'A Estrada', 'Spain')");
            
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Cantidad de registro insertados: "+numRegistrosInsertados);
    
        try(Connection con = DriverManager.getConnection(urlMysql,usuarioBD,claveBD);) {
            con.setAutoCommit(false);
            try(Statement stmt = con.createStatement();) {
                for(int i = 2030; i<2050;i++) {
                    numRegistrosInsertados += stmt.executeUpdate("INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country) VALUES ("+i+", 'Rastrillo, s.l', 'Chosco', 'Pedro', '+34666444333', 'Avda. Sanabria, 32', 'A Estrada', 'Spain')");
                
                }
                con.rollback();
                numRegistrosInsertados=0;
                System.out.println("Registros insertados correctamente");
            }catch(SQLException e) {
                con.rollback();
                System.err.println("Se ha producido un error al intentar introducir el pedido, por lo que se ha abortado el proceso");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}