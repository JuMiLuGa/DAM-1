package ventanas;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;
public class PruebasFrames {

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
//		ventana.setBounds(50, 100, 400, 400);
//		ventana.setLocation(25, 100);
////		ventana.setResizable(false);
////		ventana.setExtendedState(6);
		
		
		
//		centrarVentana(ventana);
//		ventana.centrar();
		
		
	}
	
	public static void centrarVentana(JFrame ventana) {
		Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int anchoPantalla = dimensionesPantalla.width;
		int altoPantalla = dimensionesPantalla.height;
		int anchoVentana = ventana.getWidth();
		int altoVentana = ventana.getHeight();
		
		int coordenadaX = (anchoPantalla - anchoVentana) / 2;
		int coordenadaY = (altoPantalla - altoVentana) / 2;
		ventana.setLocation(coordenadaX, coordenadaY);
	}

}

class Ventana extends JFrame{
	public Ventana() {
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Primera ventana");
		Image icono = Toolkit.getDefaultToolkit().getImage("recursos/chucheria.png");
		setIconImage(icono);
		add(new PanelPrincipal());
		
		centrar();
		setVisible(true);
		
		getContentPane().setBackground(Color.DARK_GRAY);
	}
	
	public void centrar() {
		Dimension dimensionesPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (dimensionesPantalla.width - getWidth()) / 2;
		int y = (dimensionesPantalla.height - getHeight()) / 2;
		setLocation(x, y);
		
	}
}

class PanelPrincipal extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(15, 15, 75, 75);
		
		g.setColor(Color.RED);
		g.fillOval(25, 25, 30, 30);
		
	}
	
}
