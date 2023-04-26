package ejercicios;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// Crea un programa con una interfaz gráfica como la de la siguiente imagen. 
// Al pulsar sobre el botón debe añadir al combobox la marca de coches introducida en el campo de texto.
// Al pulsar intro sobre al escribir una marca de coches debe hacer exactamente lo mismo que al pulsar el botón, es decir, añadir la marca al combo.
// Si la marca está vacía o compuesta simplemente por espacios, ésta no se debe introducir en el combo.
// Cada vez que se añada una marca al combo, hay que vaciar el campo de texto y posicionar el cursor en el mismo por si se quiere introducir otra marca.
// Al seleccionar una marca del combo, ésta debe mostrarse por consola pero en mayúsculas y, a continuación, el nº de letras de la misma.
// Al desplegar el combo, se verán como máximo 3 marcas.

public class Ejercicio3 {

	public static void main(String[] args) {
		new VentanaEj3();
	}

}

class VentanaEj3 extends JFrame {

	private JSpinner spnVentanaRojo;
	private JSpinner spnVentanaVerde;
	private JSpinner spnVentanaAzul;
	private JSpinner spnVentanaPaso;

	private JSpinner spnSuperiorRojo;
	private JSpinner spnSuperiorVerde;
	private JSpinner spnSuperiorAzul;
	private JSpinner spnSuperiorAlpha;

	public VentanaEj3() {
		setTitle("Ejercicio 3");
		setBounds(10, 10, 800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlColorVentana = new JPanel(new GridLayout(4, 2));
		pnlColorVentana.add(new JLabel("Rojo: "));
		spnVentanaRojo = new JSpinner(new SpinnerNumberModel(255, 0, 255, 1));
		pnlColorVentana.add(spnVentanaRojo);
		pnlColorVentana.add(new JLabel("Verde: "));
		spnVentanaVerde = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
		pnlColorVentana.add(spnVentanaVerde);
		pnlColorVentana.add(new JLabel("Azul: "));
		spnVentanaAzul = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
		pnlColorVentana.add(spnVentanaAzul);
		pnlColorVentana.add(new JLabel("Paso: "));
		spnVentanaPaso = new JSpinner(new SpinnerNumberModel(1, 1, 255, 1));
		pnlColorVentana.add(spnVentanaPaso);
		spnVentanaPaso.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
//				spnVentanaPaso.commitEdit();
				SpinnerNumberModel spnModel;
				spnModel = (SpinnerNumberModel) spnVentanaRojo.getModel();
				spnModel.setStepSize((int) spnVentanaPaso.getValue());
				spnModel = (SpinnerNumberModel) spnVentanaVerde.getModel();
				spnModel.setStepSize((int) spnVentanaPaso.getValue());
				spnModel = (SpinnerNumberModel) spnVentanaAzul.getModel();
				spnModel.setStepSize((int) spnVentanaPaso.getValue());

			}
		});

		JPanel pnlIzquierdo = new JPanel();
		pnlIzquierdo.setLayout(new BoxLayout(pnlIzquierdo, BoxLayout.Y_AXIS));
		pnlIzquierdo.add(new JLabel("Color ventana: "));
		pnlIzquierdo.add(pnlColorVentana);

		JPanel pnlColorSuperior = new JPanel(new GridLayout(4, 2));
		pnlColorSuperior.add(new JLabel("Rojo: "));
		spnSuperiorRojo = new JSpinner(new SpinnerNumberModel(0, 0, 255, 10));
		pnlColorSuperior.add(spnSuperiorRojo);
		pnlColorSuperior.add(new JLabel("Verde: "));
		spnSuperiorVerde = new JSpinner(new SpinnerNumberModel(0, 0, 255, 10));
		pnlColorSuperior.add(spnSuperiorVerde);
		pnlColorSuperior.add(new JLabel("Azul: "));
		spnSuperiorAzul = new JSpinner(new SpinnerNumberModel(255, 0, 255, 10));
		pnlColorSuperior.add(spnSuperiorAzul);
		pnlColorSuperior.add(new JLabel("Alpha: "));
		spnSuperiorAlpha = new JSpinner(new SpinnerNumberModel(255, 0, 255, 10));
		pnlColorSuperior.add(spnSuperiorAlpha);

		JPanel pnlDerecho = new JPanel();
		pnlDerecho.setLayout(new BoxLayout(pnlDerecho, BoxLayout.Y_AXIS));
		pnlDerecho.add(new JLabel("Color panel: "));
		pnlDerecho.add(pnlColorSuperior);

		getContentPane().add(pnlIzquierdo, BorderLayout.WEST);
		getContentPane().add(pnlDerecho, BorderLayout.EAST);

//		this.setBackground(new Color(255, 0, 0, 255));
//		this.getContentPane().setBackground(new Color(0, 0, 255, 255));

		establecerColorPaneles();

		CambiarValorColor cvc = new CambiarValorColor();
		spnVentanaRojo.addChangeListener(cvc);
		spnVentanaVerde.addChangeListener(cvc);
		spnVentanaAzul.addChangeListener(cvc);
		spnVentanaPaso.addChangeListener(cvc);
		spnSuperiorRojo.addChangeListener(cvc);
		spnSuperiorVerde.addChangeListener(cvc);
		spnSuperiorAzul.addChangeListener(cvc);
		spnSuperiorAlpha.addChangeListener(cvc);
		setVisible(true);
	}

	private void establecerColorPaneles() {
		int rojo = 0;
		int verde = 0;
		int azul = 0;
		int alpha = 0;

		rojo = (int) spnVentanaRojo.getValue();
		verde = (int) spnVentanaVerde.getValue();
		azul = (int) spnVentanaAzul.getValue();
		alpha = (int) spnVentanaPaso.getValue();
		setBackground(new Color(rojo, verde, azul));

		rojo = (int) spnSuperiorRojo.getValue();
		verde = (int) spnSuperiorVerde.getValue();
		azul = (int) spnSuperiorAzul.getValue();
		alpha = (int) spnSuperiorAlpha.getValue();
		getContentPane().setBackground(new Color(rojo, verde, azul, alpha));
		repaint(); // Para que funcione mejor al poner transparencia la transparencia

	}

	private class CambiarValorColor implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			establecerColorPaneles();
		}

	}
}

