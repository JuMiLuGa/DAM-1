package ventanaseventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebasEventosTeclado {

	public static void main(String[] args) {
		new VentanaTeclas();
	}

}

class VentanaTeclas extends JFrame {
	public VentanaTeclas() {
		setTitle("Eventos de teclado");
		setBounds(10,10,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addKeyListener(new TeclasPulsadas());
		
		setVisible(true);
	}
}

class TeclasPulsadas implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		char caracter = e.getKeyChar();
//		System.out.println("Caracter introducido: " + caracter);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigoTecla = e.getKeyCode();
		System.out.println("Código de tecla pulsada: " + codigoTecla);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int codigoTecla = e.getKeyCode();
		System.out.println("Código de tecla liberada: " + codigoTecla);
	}
	
}