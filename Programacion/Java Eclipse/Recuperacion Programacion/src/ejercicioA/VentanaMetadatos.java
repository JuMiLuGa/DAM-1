package ejercicioA;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class VentanaMetadatos extends JFrame {

	private static final long serialVersionUID = 1L;

	private void quitarNegrita(JLabel lbl) {

		Font fuenteOriginal = lbl.getFont();

		lbl.setFont(new Font(fuenteOriginal.getFamily(), Font.PLAIN, fuenteOriginal.getSize()));
	}

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

	public VentanaMetadatos() {

		setTitle("Metadatos");
		setBounds(100, 100, 600, 435);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		lblDriver = new JLabel();
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

		JPanel pnlGridEtiquetas = new JPanel(new GridLayout(6, 2));

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

		pnlGridEtiquetas.setBorder(BorderFactory.createTitledBorder("Datos Conexion"));

		JPanel pnlDatosConexion = new JPanel();
		pnlDatosConexion.add(pnlGridEtiquetas);

		cmbBDs = new JComboBox<>();

		JRadioButton rbtTablas = new JRadioButton("Tablas", true);
		JRadioButton rbtVistas = new JRadioButton("Vistas");
		JRadioButton rtbProcedimientosAlmacenados = new JRadioButton("Proc. Almacenados");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rbtTablas);
		bg.add(rbtVistas);
		bg.add(rtbProcedimientosAlmacenados);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.setEnabled(false);

		JPanel pnlGridControl = new JPanel(new GridLayout(6, 1));

		pnlGridControl.add(new JLabel("Bases de datos: "));
		pnlGridControl.add(cmbBDs);
		pnlGridControl.add(rbtTablas);
		pnlGridControl.add(rbtVistas);
		pnlGridControl.add(rtbProcedimientosAlmacenados);
		pnlGridControl.add(btnMostrar);

		pnlGridControl.setBorder(BorderFactory.createTitledBorder("Control"));

		JPanel pnlControl = new JPanel();
		pnlControl.add(pnlGridControl);

		JPanel pnlGridIzquierdo = new JPanel(new GridLayout(2, 1));
		pnlGridIzquierdo.add(pnlDatosConexion);
		pnlGridIzquierdo.add(pnlControl);

		JPanel pnlIzquierdo = new JPanel();
		pnlIzquierdo.add(pnlGridIzquierdo);

		lblNumRegistros = new JLabel("Nº registros: 0", JLabel.CENTER);

		txaResultados = new JTextArea();
		txaResultados.setEditable(false);
		txaResultados.setEnabled(false);

//		JPanel pnlResultados = new JPanel(new BorderLayout());
//		pnlResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));

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

		Object[] mensaje = { "Driver: ", txtDriver, "SGBD: ", txtSGBD, "Servidor: ", txtServidor, "Puerto: ", txtPuerto,
				"Usuario: ", txtUsuario, "Clave: ", txtClave };

		int opcion = JOptionPane.showConfirmDialog(VentanaMetadatos.this, mensaje, "Datos conexion",
				JOptionPane.YES_NO_OPTION);

		if (opcion == JOptionPane.YES_OPTION) {

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

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);) {
			DatabaseMetaData metadatos = con.getMetaData();
			try(ResultSet rs = metadatos.getCatalogs();){
				while (rs.next()) {
					cmbBDs.addItem(rs.getString("TABLE_CAT"));
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"ERROR, BD inaccesible o datos de conexion no válidos: " + e.getMessage(), "Error de conexion a BD",
					JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
}
