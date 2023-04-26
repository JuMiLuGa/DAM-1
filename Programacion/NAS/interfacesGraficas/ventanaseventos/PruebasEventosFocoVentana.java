package ventanaseventos;

import java.awt.event.*;

import javax.swing.JFrame;

public class PruebasEventosFocoVentana extends JFrame implements WindowFocusListener {
	PruebasEventosFocoVentana ventana1;
	PruebasEventosFocoVentana ventana2;

	public static void main(String[] args) {
		PruebasEventosFocoVentana v = new PruebasEventosFocoVentana();
		v.inicializar();
	}

	public void inicializar() {
		ventana1 = new PruebasEventosFocoVentana();
		ventana2 = new PruebasEventosFocoVentana();

		ventana1.setBounds(2010, 10, 400, 300);
		ventana2.setBounds(2510, 10, 400, 300);

		ventana1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ventana1.addWindowFocusListener(this);
		ventana2.addWindowFocusListener(this);
		
		ventana1.setVisible(true);
		ventana2.setVisible(true);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		if (e.getSource() == ventana1)
			ventana1.setTitle("Foco adquirido");
		else
			ventana2.setTitle("Foco adquirido");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if (e.getSource() == ventana1)
			ventana1.setTitle("");
		else
			ventana2.setTitle("");
	}

}
