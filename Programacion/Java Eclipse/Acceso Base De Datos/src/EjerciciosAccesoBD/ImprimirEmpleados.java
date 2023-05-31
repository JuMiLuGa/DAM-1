package EjerciciosAccesoBD;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class ImprimirEmpleados {

    public static void main(String[] args) {
        new VentanaEmpleados();
    }

}

class VentanaEmpleados extends JFrame {
    
	private static final long serialVersionUID = 1L;

	int valorOficina = 0;

    String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
    String usuarioBD = "progjava";
    String claveBD = "J#v#Prog2023";
//usuarioBD = "javadmin";
//claveBD = "20J@v@23";

    String consultaDatosEmpleados = "SELECT concat('Nº: ',employeeNumber,' Nombre: ',firstName,' ',lastName,' Extensión: ',extension,' Email: ',email,' Puesto: ',jobTitle) FROM employees WHERE ;";

    public VentanaEmpleados() {
        setTitle("Empleados");
        setBounds(10, 100, 300, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlSur = new JPanel();
        JLabel lblOficina = new JLabel("Oficina: ");
        JTextField txfOficina = new JTextField("0");
        JLabel lblEmpleados = new JLabel("Empleados: ");
        JComboBox<String> cmbEmpleados = new JComboBox<>();

        valorOficina = Integer.parseInt(txfOficina.getText());

        pnlSur.add(lblOficina);
        pnlSur.add(txfOficina);
        pnlSur.add(lblEmpleados);
        pnlSur.add(cmbEmpleados);

        getContentPane().add(pnlSur, BorderLayout.NORTH);

        JPanel pnlNorte = new JPanel();
        JButton btnImprimir = new JButton("Imprimir");

        pnlNorte.add(btnImprimir);

        getContentPane().add(pnlNorte, BorderLayout.SOUTH);

        JTextArea txaEmpleado = new JTextArea();

        getContentPane().add(txaEmpleado);
        
        txfOficina.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyPressed(KeyEvent e) {
                int codigoTecla = e.getKeyCode();
    //            System.out.println(codigoTecla);
                if(codigoTecla == 10) {
               
                String consultaEmpleados = "SELECT concat(firstName,' ',lastName) FROM employees WHERE officeCode = ?;";                
                try(Connection con = DriverManager.getConnection(urlMysql, usuarioBD, claveBD);) {
                    PreparedStatement ps = con.prepareStatement(consultaDatosEmpleados);
                    ps.setString(1, txfOficina.getText());
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()) {
                    	cmbEmpleados.addItem(rs.getString("firstname") + "  " + rs.getString("lastname"));
                    	
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                }
            }
        });
        
        

        setVisible(true);
    }
}