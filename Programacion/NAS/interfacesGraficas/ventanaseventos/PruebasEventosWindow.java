package ventanaseventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class PruebasEventosWindow {

	public static void main(String[] args) {
		new VentanaEventos();
		
		VentanaEventos segundaVentana = new VentanaEventos();
		segundaVentana.setTitle("Segunda ventana");
		segundaVentana.setLocation(segundaVentana.getX()+segundaVentana.getWidth(), segundaVentana.getY());
		segundaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class VentanaEventos extends JFrame {
	public VentanaEventos() {
		setTitle("Probando eventos Window");
		setBounds(10, 10, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addWindowListener(new EscuchadorEventosVentana());
		
		setVisible(true);
	}
}

class EscuchadorEventosVentana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha abierto la ventana por primera vez");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se está intentando cerrar la ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha cerrado la ventana");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha minimizado la ventana");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha restaurado la ventana");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha activado la ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		JFrame v = (JFrame)e.getWindow();
		System.out.print(v.getTitle().toUpperCase() + ": ");
		System.out.println("Se ha desactivado la ventana");
	}
	
}


