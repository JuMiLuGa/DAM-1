package EjercicioB;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaCRUD extends JFrame {

	private static final long serialVersionUID = 1L;

	private String urlMysql;
	private String usuario;
	private String clave;

	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCategoria;
	private JTextField txtEscala;
	private JTextField txtProveedor;
	private JTextField txtStock;
	private JTextField txtPrecioCompra;
	private JTextField txtPvp;

	private JList<Producto> lstProductos;
	private List<Producto> productos;

	private enum Operaciones {AGREGAR, EDITAR};
	private Operaciones operacion;
	
	public VentanaCRUD() {
		setTitle("CRUD");
		setBounds(100, 100, 1500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		usuario = "progjava";
		clave = "J#v#Prog2023";

		txtCodigo = new JTextField();
		txtNombre = new JTextField();
		txtCategoria = new JTextField();
		txtEscala = new JTextField();
		txtProveedor = new JTextField();
		txtStock = new JTextField();
		txtPrecioCompra = new JTextField();
		txtPvp = new JTextField();

		JPanel pnlGridCampos = new JPanel(new GridLayout(8, 2));
		pnlGridCampos.add(new JLabel("Código: ", JLabel.RIGHT));
		pnlGridCampos.add(txtCodigo);
		pnlGridCampos.add(new JLabel("Nombre: ", JLabel.RIGHT));
		pnlGridCampos.add(txtNombre);
		pnlGridCampos.add(new JLabel("Categoría: ", JLabel.RIGHT));
		pnlGridCampos.add(txtCategoria);
		pnlGridCampos.add(new JLabel("Escala: ", JLabel.RIGHT));
		pnlGridCampos.add(txtEscala);
		pnlGridCampos.add(new JLabel("Proveedor: ", JLabel.RIGHT));
		pnlGridCampos.add(txtProveedor);
		pnlGridCampos.add(new JLabel("Stock: ", JLabel.RIGHT));
		pnlGridCampos.add(txtStock);
		pnlGridCampos.add(new JLabel("Precio compra: ", JLabel.RIGHT));
		pnlGridCampos.add(txtPrecioCompra);
		pnlGridCampos.add(new JLabel("PVP: ", JLabel.RIGHT));
		pnlGridCampos.add(txtPvp);
		pnlGridCampos.setBorder(BorderFactory.createTitledBorder("Datos producto"));

		JPanel pnlCampos = new JPanel();
		pnlCampos.add(pnlGridCampos);

		lstProductos = new JList<>(new DefaultListModel<Producto>());
		lstProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		productos = obtenerListaProductos();
		rellenarListaProductos();

		JScrollPane scpListProductos = new JScrollPane(lstProductos);
		scpListProductos.setBorder(BorderFactory.createTitledBorder("Listado productos"));

		lstProductos.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				cargarValoresProductoSeleccionado();
			}
		});

		JToolBar tlb = new JToolBar("CRUD");
		JButton btnAgregar = new JButton(new ImageIcon("recursos/agregar24.png"));
		JButton btnEditar = new JButton(new ImageIcon("recursos/editar24.png"));
		JButton btnEliminar = new JButton(new ImageIcon("recursos/eliminar24.png"));
		JButton btnConfirmar = new JButton(new ImageIcon("recursos/confirmar24.png"));
		JButton btnCancelar = new JButton(new ImageIcon("recursos/cancelar24.png"));

		tlb.add(btnAgregar);
		tlb.add(btnEditar);
		tlb.add(btnEliminar);
		tlb.add(btnConfirmar);
		btnConfirmar.setEnabled(false);
		tlb.add(btnCancelar);
		btnCancelar.setEnabled(false);

		tlb.setOrientation(JToolBar.VERTICAL);

		btnAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				operacion = Operaciones.AGREGAR;
				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnEditar.setEnabled(false);

				btnConfirmar.setEnabled(true);
				btnCancelar.setEnabled(true);

				lstProductos.setEnabled(false);
				limpiarCampos();
				habilitarEdicionCampos(true);

				txtCodigo.requestFocusInWindow();
			}
		});

		btnConfirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch (operacion) {
				case AGREGAR: 
						insertarEnBD();
						break;
				case EDITAR:
						actualizarEnBD();
						break;
				}

				productos = obtenerListaProductos();

				rellenarListaProductos();

				btnAgregar.setEnabled(true);
				btnEliminar.setEnabled(true);
				btnEditar.setEnabled(true);

				btnConfirmar.setEnabled(false);
				btnCancelar.setEnabled(false);

				lstProductos.setEnabled(true);

				habilitarEdicionCampos(false);

			}
		});

		btnEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operacion = Operaciones.EDITAR;
				
				actualizarEnBD();

				btnAgregar.setEnabled(false);
				btnEliminar.setEnabled(false);
				btnEditar.setEnabled(false);

				btnConfirmar.setEnabled(true);
				btnCancelar.setEnabled(true);

				lstProductos.setEnabled(false);
				
				habilitarEdicionCampos(true);
				txtCodigo.setEditable(false);
				txtNombre.requestFocusInWindow();
				txtNombre.selectAll();

			}
		});

		getContentPane().add(pnlCampos, BorderLayout.WEST);
		getContentPane().add(scpListProductos, BorderLayout.CENTER);
		getContentPane().add(tlb, BorderLayout.EAST);

		habilitarEdicionCampos(false);

		setVisible(true);
	}

	private List<Producto> obtenerListaProductos() {
		List<Producto> lstProductos = new ArrayList<>();
		String sentenciaSql = "SELECT * FROM products ORDER BY productCode DESC;";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				Statement stmt = con.createStatement();) {

			try (ResultSet rs = stmt.executeQuery(sentenciaSql)) {
				while (rs.next()) {
					Producto p = new Producto(rs.getString("productCode"), rs.getString("productName"),
							rs.getString("productLine"), rs.getString("productScale"), rs.getString("productVendor"),
							rs.getInt("quantityInStock"), rs.getDouble("buyPrice"), rs.getDouble("MSRP"));
					lstProductos.add(p);
				}
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al intentar obtener los productos de la BD: " + e.getMessage());
			e.printStackTrace();
		}

		return lstProductos;
	}

	private void rellenarListaProductos() {
		DefaultListModel<Producto> modelo = (DefaultListModel<Producto>) lstProductos.getModel();
		modelo.clear();
		for (Producto p : productos) {
			modelo.addElement(p);
		}
	}

	private void cargarValoresProductoSeleccionado() {
		Producto p = lstProductos.getSelectedValue();
		
		if(p != null) {
			
		txtCodigo.setText(p.getCodigo());
		txtNombre.setText(p.getNombre());
		txtCategoria.setText(p.getCategoria());
		txtEscala.setText(p.getEscala());
		txtProveedor.setText(p.getProveedor());
		txtStock.setText(String.valueOf(p.getStock()));
		txtPrecioCompra.setText(String.valueOf(p.getPrecioCompra()));
		txtPvp.setText(String.valueOf(p.getPvp()));
		
		}
		
		
	}

	private void habilitarEdicionCampos(boolean habilitar) {
		txtCodigo.setEditable(habilitar);
		txtNombre.setEditable(habilitar);
		txtCategoria.setEditable(habilitar);
		txtEscala.setEditable(habilitar);
		txtProveedor.setEditable(habilitar);
		txtStock.setEditable(habilitar);
		txtPrecioCompra.setEditable(habilitar);
		txtPvp.setEditable(habilitar);
	}

	private void limpiarCampos() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtCategoria.setText("");
		txtEscala.setText("");
		txtProveedor.setText("");
		txtStock.setText("");
		txtPrecioCompra.setText("");
		txtPvp.setText("");
	}

	private void insertarEnBD() {
		String sentenciaSQL = "INSERT INTO products values (?, ?, ?, ?, ?, '', ?, ?, ?)";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL);) {
			ps.setString(1, txtCodigo.getText());
			ps.setString(2, txtNombre.getText());
			ps.setString(3, txtCategoria.getText());
			ps.setString(4, txtEscala.getText());
			ps.setString(5, txtProveedor.getText());
			ps.setInt(6, Integer.parseInt(txtStock.getText()));
			ps.setDouble(7, Double.parseDouble(txtPrecioCompra.getText()));
			ps.setDouble(8, Double.parseDouble(txtPvp.getText()));

			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	private void actualizarEnBD() {
		String sentenciaSQL = "UPDATE products SET values "
				+ "productName=?, "
				+ "productLine=?, "
				+ "productScale=?, "
				+ "productVendor=?, "
				+ "quantityInStock=?, "
				+ "buyPrice=?, "
				+ "MSRP=? "
				+ "WHERE productCode=?;";

		try (Connection con = DriverManager.getConnection(urlMysql, usuario, clave);
				PreparedStatement ps = con.prepareStatement(sentenciaSQL);) {
			ps.setString(1, txtNombre.getText());
			ps.setString(2, txtCategoria.getText());
			ps.setString(3, txtEscala.getText());
			ps.setString(4, txtProveedor.getText());
			ps.setInt(5, Integer.parseInt(txtStock.getText()));
			ps.setDouble(6, Double.parseDouble(txtPrecioCompra.getText()));
			ps.setDouble(7, Double.parseDouble(txtPvp.getText()));
			ps.setString(8, txtCodigo.getText());

			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
