package accesoBD;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class EjemploBDconGUI {

	public static void main(String[] args) {
		new VentanaConsultas();
	}

}

class VentanaConsultas extends JFrame{
	private JComboBox<String> cmbCategoria;
	private JTextField txtStockMinimo;
	private JButton btnConsultar;
	private JTextArea txaResultado;
	private JLabel lblEstado;

	private String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	private String usuarioBD = "progjava";
	private String claveBD = "J#v#Prog2023";

	public VentanaConsultas() {
		setTitle("Consultas BD");
		setBounds(2100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cmbCategoria = new JComboBox<>();
		cmbCategoria.setEditable(false);
		
		txtStockMinimo = new JTextField("1000", 4);
		txtStockMinimo.setHorizontalAlignment(JTextField.RIGHT);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String categoriaSeleccionada = (String)cmbCategoria.getSelectedItem();
				int stockMinimoIntroducido = 0;
				
				try {
					stockMinimoIntroducido = Integer.parseInt(txtStockMinimo.getText());
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(VentanaConsultas.this, "El stock mínimo introducido no es un entero válido.");
					txtStockMinimo.selectAll();
					txtStockMinimo.requestFocusInWindow();
				}
				txaResultado.setText(ejecutarConsulta(categoriaSeleccionada,stockMinimoIntroducido));
			}
		});
		
		JPanel pnlSuperior = new JPanel();
		pnlSuperior.add(new JLabel("Categoría"));
		pnlSuperior.add(cmbCategoria);
		pnlSuperior.add(new JLabel("Stock mínimo"));
		pnlSuperior.add(txtStockMinimo);
		pnlSuperior.add(btnConsultar);
		
		getContentPane().add(pnlSuperior, BorderLayout.NORTH);
		
		txaResultado=new JTextArea();
		JScrollPane scp = new JScrollPane(txaResultado);
		getContentPane().add(scp);
		
		lblEstado = new JLabel();
		getContentPane().add(lblEstado, BorderLayout.SOUTH);
		
		// Cargar comboBox con las categorías de la BD
		try(Connection con = DriverManager.getConnection(urlMysql,usuarioBD,claveBD);
				Statement stmt = con.createStatement();){
			cmbCategoria.addItem("Todas");
			try (ResultSet rs = stmt.executeQuery("SELECT productLine FROM productlines;");) {
				while (rs.next()) {
					cmbCategoria.addItem(rs.getString("productLine"));
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		setVisible(true);
	}
	
	private String ejecutarConsulta(String categoria, int stockMinimo) {
		StringBuilder sb = new StringBuilder();
		String sentenciaSql = "SELECT * FROM products WHERE productLine LIKE ? AND quantityInStock < ?;";

		try (Connection con = DriverManager.getConnection(urlMysql, usuarioBD, claveBD);
				PreparedStatement ps = con.prepareStatement(sentenciaSql);) {
			if(categoria.equals("Todas")) categoria = "%";
			ps.setString(1, categoria);
			ps.setInt(2, stockMinimo);
			
			try(ResultSet rs = ps.executeQuery()){
				int numRegistros = 0;
				while(rs.next()) {
					sb.append("Códido: " + rs.getString("productCode") + " Nombre: " + rs.getString("productName")
					+ " Categoría: " + rs.getString("productLine") + " Cantidad: " + rs.getInt("quantityInStock") + "\n");
					numRegistros++;
				}
				lblEstado.setText("Nº registros: " + numRegistros);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}












