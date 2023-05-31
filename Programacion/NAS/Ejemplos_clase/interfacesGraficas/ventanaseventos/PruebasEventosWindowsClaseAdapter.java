package ventanaseventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebasEventosWindowsClaseAdapter {

	public static void main(String[] args) {
		new VentanaEventosConAdaptador();
	}

}
class VentanaEventosConAdaptador extends JFrame{
	public VentanaEventosConAdaptador() {
		setTitle("Probando clase adaptadora");
		setBounds(10,10,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowListener(new EscuchadorVentanaEventosConAdaptador());
		setVisible(true);
	}
}
class EscuchadorVentanaEventosConAdaptador extends WindowAdapter{
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Se ha activado la ventana.");
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Se ha desactivado la ventana.");
	}
}
