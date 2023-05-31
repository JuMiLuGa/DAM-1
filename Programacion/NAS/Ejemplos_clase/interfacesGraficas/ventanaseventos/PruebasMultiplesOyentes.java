package ventanaseventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebasMultiplesOyentes {

	public static void main(String[] args) {
		new VentanaPrincipal();
	}

}
class VentanaPrincipal extends JFrame{
	public VentanaPrincipal() {
		setTitle("Ventana principal");
		setBounds(2800, 10, 300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PanelPrincipal());
		
		setVisible(true);
	}
}

class PanelPrincipal extends JPanel{
	JButton btnCerrarVentanas;
	public PanelPrincipal() {
		JButton btnNuevo = new JButton("Nueva ventana");
		btnCerrarVentanas = new JButton("Cerrar ventanas");
		
		add(btnNuevo);
		add(btnCerrarVentanas);
		
		btnNuevo.addActionListener(new OyenteNuevaVentana());
	}
	class OyenteNuevaVentana implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new VentanaSecundaria(btnCerrarVentanas);
		}
	}
}
class VentanaSecundaria extends JFrame{
	private static int contador = 0;
	
	public VentanaSecundaria(JButton boton) {
		setTitle("Ventana secundaria " + (++contador));
		setBounds(1930 + contador*30,contador*30,300,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		boton.addActionListener(new OyenteCerrarVentana());
		
		setVisible(true);
	}
	private class OyenteCerrarVentana implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			contador = 0;
		}
	}
}

