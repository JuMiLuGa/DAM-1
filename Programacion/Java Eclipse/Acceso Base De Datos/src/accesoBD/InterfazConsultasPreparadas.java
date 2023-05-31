package accesoBD;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class InterfazConsultasPreparadas extends JFrame {
    private JLabel lblCategoria;
    private JComboBox<String> cmbCategoria;
    private JLabel lblStockMinimo;
    private JTextField txtStockMinimo;
    private JButton btnConsultar;
    private JTextArea txtAreaResultados;

    private String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
    private String usuario = "progjava";
    private String clave = "J#v#Prog2023";

    public InterfazConsultasPreparadas() {
        // Configuración de la ventana
        setTitle("Consulta Preparada");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear componentes
        lblCategoria = new JLabel("Categoría:");
        cmbCategoria = new JComboBox<>();
        lblStockMinimo = new JLabel("Stock mínimo:");
        txtStockMinimo = new JTextField();
        btnConsultar = new JButton("Consultar");
        txtAreaResultados = new JTextArea();

        // Posicionar componentes
        lblCategoria.setBounds(20, 20, 80, 25);
        cmbCategoria.setBounds(110, 20, 150, 25);
        lblStockMinimo.setBounds(20, 50, 80, 25);
        txtStockMinimo.setBounds(110, 50, 150, 25);
        btnConsultar.setBounds(20, 90, 240, 25);
        txtAreaResultados.setBounds(20, 130, 360, 120);

        // Agregar componentes a la ventana
        add(lblCategoria);
        add(cmbCategoria);
        add(lblStockMinimo);
        add(txtStockMinimo);
        add(btnConsultar);
        add(txtAreaResultados);

        // Cargar categorías en el JComboBox
        cargarCategorias();

        // Agregar acción al botón de consultar
        btnConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultar();
            }
        });
    }

    private void cargarCategorias() {
        // Aquí puedes obtener las categorías desde la base de datos
        // y cargarlas en el JComboBox cmbCategoria
        // Por simplicidad, en este ejemplo se agregarán categorías de ejemplo
        cmbCategoria.addItem("Motorcycles");
        cmbCategoria.addItem("Cars");
        cmbCategoria.addItem("Planes");
        cmbCategoria.addItem("Ships");
    }

    private void consultar() {
        String categoria = cmbCategoria.getSelectedItem().toString();
        int stockMinimo = Integer.parseInt(txtStockMinimo.getText());

        String sentenciaSQL = "SELECT productCode, productName, quantityInStock FROM products WHERE productLine = ? AND quantityInStock < ?;";

        try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
                PreparedStatement ps = con.prepareStatement(sentenciaSQL);) {
            ps.setString(1, categoria);
            ps.setInt(2, stockMinimo);

            StringBuilder resultados = new StringBuilder();
            resultados.append(categoria + " with stock less than " + stockMinimo + ": \n");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                resultados.append(rs.getString("productName") + "(" + rs.getString("productCode") + "): " + rs.getString("quantityInStock") + "\n");
            }

            txtAreaResultados.setText(resultados.toString());
        } catch (Exception e) {
            System.err.println("Error al intentar acceder a la BD");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazConsultasPreparadas().setVisible(true);
            }
        });
    }
}
