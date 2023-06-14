package ejercicioA;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class VentanaMetadatos extends JFrame{
	private String driver;
	private String sgbd;
	private String servidor;
	private String puerto;
	private String urlMysql;
	private String usuario;
	private String clave;
	
	private JLabel lblDriver;
	private JLabel lblSGBD;
	private JLabel lblServidor;
	private JLabel lblPuerto;
	private JLabel lblUsuario;
	
	private JComboBox<String> cmbBDs;
	private JButton btnMostrar;
	
	private JLabel lblNumRegistros;
	private JTextArea txaResultados;
	
	private void quitarNegrita(JLabel lbl) {
		Font fuenteOriginal = lbl.getFont();
		lbl.setFont(new Font(fuenteOriginal.getFamily(), Font.PLAIN, fuenteOriginal.getSize()));
	}
	
	public VentanaMetadatos() {
		setTitle("Metadatos");
		setBounds(2100, 100, 600, 435);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		driver="jdbc";
		sgbd="mysql";
		servidor="192.168.56.21";
		puerto="3306";
		usuario="progjava";
		clave="J#v#Prog2023";
		
		lblDriver = new JLabel();
//		Font fuenteOriginal = lblDriver.getFont();
////		System.out.println(fuenteOriginal.getSize());
//		lblDriver.setFont(new Font(fuenteOriginal.getFamily(), Font.PLAIN, fuenteOriginal.getSize()));
		quitarNegrita(lblDriver);
		lblSGBD = new JLabel();
		quitarNegrita(lblSGBD);
		lblServidor = new JLabel();
		quitarNegrita(lblServidor);
		lblPuerto = new JLabel();
		quitarNegrita(lblPuerto);
		lblUsuario = new JLabel();
		quitarNegrita(lblUsuario);
		
		JButton btnEditar = new JButton("Editar");
		
		JPanel pnlGridEtiquetas = new JPanel(new GridLayout(6,2));
		pnlGridEtiquetas.add(new JLabel("Driver: ", JLabel.RIGHT));
		pnlGridEtiquetas.add(lblDriver);
		pnlGridEtiquetas.add(new JLabel("SGBD: ", JLabel.RIGHT));
		pnlGridEtiquetas.add(lblSGBD);
		pnlGridEtiquetas.add(new JLabel("Servidor: ", JLabel.RIGHT));
		pnlGridEtiquetas.add(lblServidor);
		pnlGridEtiquetas.add(new JLabel("Puerto: ", JLabel.RIGHT));
		pnlGridEtiquetas.add(lblPuerto);
		pnlGridEtiquetas.add(new JLabel("Usuario: ", JLabel.RIGHT));
		pnlGridEtiquetas.add(lblUsuario);
		pnlGridEtiquetas.add(new JLabel(""));
		pnlGridEtiquetas.add(btnEditar);
		pnlGridEtiquetas.setBorder(BorderFactory.createTitledBorder("Datos conexión"));
		
		JPanel pnlDatosConexion = new JPanel();
		pnlDatosConexion.add(pnlGridEtiquetas);
		
		
		cmbBDs = new JComboBox<>();
		
		JRadioButton rbtTablas = new JRadioButton("Tablas",true);
		JRadioButton rbtVistas = new JRadioButton("Vistas");
		JRadioButton rbtProcedimientosAlmacenados = new JRadioButton("Proc. almacenados");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtTablas);
		bg.add(rbtVistas);
		bg.add(rbtProcedimientosAlmacenados);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setEnabled(false);
		
		JPanel pnlGridControl = new JPanel(new GridLayout(6,1));
		pnlGridControl.add(new JLabel("Bases de datos:"));
		pnlGridControl.add(cmbBDs);
		pnlGridControl.add(rbtTablas);
		pnlGridControl.add(rbtVistas);
		pnlGridControl.add(rbtProcedimientosAlmacenados);
		pnlGridControl.add(btnMostrar);
		pnlGridControl.setBorder(BorderFactory.createTitledBorder("Control"));
		
		JPanel pnlControl = new JPanel();
		pnlControl.add(pnlGridControl);
		
		JPanel pnlGridIzquierdo = new JPanel(new GridLayout(2,1));
		pnlGridIzquierdo.add(pnlDatosConexion);
		pnlGridIzquierdo.add(pnlControl);
		
		JPanel pnlIzquierdo = new JPanel();
		pnlIzquierdo.add(pnlGridIzquierdo);
		
		lblNumRegistros = new JLabel("Nº registros: 0", JLabel.CENTER);
		
		txaResultados = new JTextArea();
		txaResultados.setEditable(false);
		txaResultados.setEnabled(false);
//		JPanel pnlResultados = new JPanel(new BorderLayout());
		JScrollPane scpResultados = new JScrollPane(txaResultados);
		scpResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));
		
		
		
		
		getContentPane().add(pnlIzquierdo, BorderLayout.WEST);
		getContentPane().add(scpResultados, BorderLayout.CENTER);
		getContentPane().add(lblNumRegistros, BorderLayout.SOUTH);
		
		
		btnEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cambiarDatosConexion();
				cargarComboBD();
				
			}
		});
		
		btnMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tipo = "TABLE";
				if(rbtVistas.isSelected())
					tipo="VIEW";
				else if(rbtProcedimientosAlmacenados.isSelected())
					tipo="PROCEDURE";
				String resultado = obtenerMetadatos(cmbBDs.getSelectedItem().toString(), tipo);
				txaResultados.setText(resultado);
				
			}
		});
		
		// Menú contextual
		JPopupMenu pupHabilitarTxa = new JPopupMenu();
		JCheckBoxMenuItem mniHabilitarTxa = new JCheckBoxMenuItem("Habilitar", new ImageIcon("recursos/editar16.png"));
		pupHabilitarTxa.add(mniHabilitarTxa);
		txaResultados.setComponentPopupMenu(pupHabilitarTxa);
		
		mniHabilitarTxa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txaResultados.setEnabled(mniHabilitarTxa.isSelected());
			}
		});
		
		setVisible(true);
	}
	
	private void cambiarDatosConexion() {
		JTextField txtDriver = new JTextField();
		JTextField txtSGBD = new JTextField();
		JTextField txtServidor = new JTextField();
		JTextField txtPuerto = new JTextField();
		JTextField txtUsuario = new JTextField();
		JTextField txtClave = new JTextField();
		
		txtDriver.setText(driver);
		txtSGBD.setText(sgbd);
		txtServidor.setText(servidor);
		txtPuerto.setText(puerto);
		txtUsuario.setText(usuario);
		txtClave.setText(clave);
		
		Object[] mensaje = {"Driver:", txtDriver, "SGBD:", txtSGBD, "Servidor:", txtServidor, "Puerto:",txtPuerto,
				"Usuario:",txtUsuario, "Contraseña:",txtClave};
		int opcion = JOptionPane.showConfirmDialog(VentanaMetadatos.this, mensaje, "Datos conexión", JOptionPane.YES_NO_OPTION);
		if(opcion == JOptionPane.YES_OPTION) {
			driver = txtDriver.getText();
			sgbd = txtSGBD.getText();
			servidor = txtServidor.getText();
			puerto = txtPuerto.getText();
			urlMysql = driver + ":" + sgbd + "://" + servidor + ":" + puerto;
			usuario = txtUsuario.getText();
			clave = txtClave.getText();
			
			lblDriver.setText(driver);
			lblSGBD.setText(sgbd);
			lblServidor.setText(servidor);
			lblPuerto.setText(puerto);
			lblUsuario.setText(usuario);
		}
	}
	
	private void cargarComboBD() {
		cmbBDs.removeAllItems();
		btnMostrar.setEnabled(false);
		try(Connection con = DriverManager.getConnection(urlMysql, usuario, clave);){
			DatabaseMetaData metadatos = con.getMetaData();
			
			try(ResultSet rs = metadatos.getCatalogs();){
				while(rs.next()) {
					cmbBDs.addItem(rs.getString("TABLE_CAT"));
				}
			}
			
			btnMostrar.setEnabled(true);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR, BD inaccesible o dtos de conexión no válidos: " 
					+ e.getMessage(), "Error de conexión a BD", JOptionPane.ERROR_MESSAGE, null);
		}
	}
	
	
	private String obtenerMetadatos(String nombreBD, String tipoContenido) {
		StringBuilder sb = new StringBuilder();
		
		try(Connection con = DriverManager.getConnection(urlMysql,usuario,clave)){
			DatabaseMetaData metadatos = con.getMetaData();
			int numRegistros = 0;
			switch(tipoContenido) {
			case "TABLE", "VIEW":
				try(ResultSet rs = metadatos.getTables(nombreBD, null, null,new String[] {tipoContenido})){
					while(rs.next()) {
					sb.append(String.format("BD: %s NOMBRE: %s TIPO: %s\n", rs.getString("TABLE_CAT"), 
							rs.getString("TABLE_NAME"), rs.getString("TABLE_TYPE")));
					numRegistros++;
					}
				}
			break;
			
			case "PROCEDURE":
				try(ResultSet rs = metadatos.getProcedures(nombreBD, null, "%")){
					while(rs.next()) {
						sb.append(String.format("BD: %s NOMBRE: %s TIPO: %s\n", rs.getString("PROCEDURE_CAT"), 
							rs.getString("PROCEDURE_NAME"), rs.getString("PROCEDURE_TYPE")));
						numRegistros++;
					}
				}
			}
			lblNumRegistros.setText("Nº registros: " + numRegistros);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(VentanaMetadatos.this, "Se ha producido un error al intentar obtener los metadatos: " + e.getMessage());
//			e.printStackTrace();
		}
		
		return sb.toString();
	}
		
}