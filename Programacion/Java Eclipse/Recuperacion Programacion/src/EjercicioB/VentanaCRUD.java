package EjercicioB;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VentanaCRUD extends JFrame{

	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCategoria;
	private JTextField txtEscala;
	private JTextField txtProveedor;
	private JTextField txtStock;
	private JTextField txtPrecioCompra;
	private JTextField txtPvp;


	
	public VentanaCRUD() {
		setTitle("CRUD");
		setBounds(100,100,1500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		txtCodigo = new JTextField();
		txtNombre = new JTextField();
		txtCategoria = new JTextField();
		txtEscala = new JTextField();
		txtProveedor = new JTextField();
		txtStock = new JTextField();
		txtPrecioCompra = new JTextField();
		txtPvp = new JTextField();
		
		JPanel pnlGridCampos = new JPanel(new GridLayout(8,2));
		
		pnlGridCampos.add(new JLabel("Codigo: ", JLabel.RIGHT));
		pnlGridCampos.add(txtCodigo);
		
		pnlGridCampos.add(new JLabel("Nombre: ", JLabel.RIGHT));
		pnlGridCampos.add(txtNombre);
		
		pnlGridCampos.add(new JLabel("Categoria: ", JLabel.RIGHT));
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
		
		
		getContentPane().add(pnlCampos,BorderLayout.WEST);
		
		setVisible(true);
	}
}
