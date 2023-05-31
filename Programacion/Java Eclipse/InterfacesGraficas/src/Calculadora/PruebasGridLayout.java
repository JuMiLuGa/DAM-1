package Calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebasGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VentanaCalculadora();
	}

}

class VentanaCalculadora extends JFrame {
	public VentanaCalculadora() {
		setTitle("Calculadora");
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelCalculadora());
        pack();
		setVisible(true);
	}
}

class PanelCalculadora extends JPanel {
	private JTextField txtPantalla;
	private JPanel pnlBotones;

	public PanelCalculadora() {
		txtPantalla = new JTextField("0");

		setLayout(new BorderLayout());
		add(txtPantalla, BorderLayout.NORTH);
		txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
		txtPantalla.setFont(new Font("Arial", 0, 25));
		pnlBotones = new JPanel();
		pnlBotones.setLayout(new GridLayout(4, 4));
		add(pnlBotones, BorderLayout.CENTER);
		agregarBoton("7", new InsertarNumero());
		agregarBoton("8", new InsertarNumero());
		agregarBoton("9", new InsertarNumero());
		agregarBoton("/", null);
		agregarBoton("4", new InsertarNumero());
		agregarBoton("5", new InsertarNumero());
		agregarBoton("6", new InsertarNumero());
		agregarBoton("*", null);
		agregarBoton("1", new InsertarNumero());
		agregarBoton("2", new InsertarNumero());
		agregarBoton("3", new InsertarNumero());
		agregarBoton("-", null);
		agregarBoton("0", new InsertarNumero());
		agregarBoton(".", new InsertarPuntoDecimal());
		agregarBoton("=", null);
		agregarBoton("+", null);

	}

	private void agregarBoton(String texto, ActionListener escuchador) {
		JButton btn = new JButton(texto);
		btn.addActionListener(escuchador);
		pnlBotones.add(btn);
	}

	private class InsertarNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String valor = e.getActionCommand();

			String textoActual = txtPantalla.getText();
			if (textoActual.equals("0"))
				txtPantalla.setText(valor);
			else
				txtPantalla.setText(txtPantalla.getText() + valor);
		}
	}
	private class InsertarPuntoDecimal implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String valor = e.getActionCommand();

			String textoActual = txtPantalla.getText();
			if (textoActual.contains("."))
				agregarBoton(".", null);

			else
				txtPantalla.setText(txtPantalla.getText() + valor);
		}
	}
}
