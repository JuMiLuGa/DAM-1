package ventanaseventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class PruebasEventosWindowEstadosVentana {

	public static void main(String[] args) {
		new VentanaEstados();
	}

}
class VentanaEstados extends JFrame{
	public VentanaEstados() {
		setTitle("Estados ventana");
		setBounds(10, 10, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowStateListener(new CambioDeEstado());
		
		setVisible(true);
	}
}
class CambioDeEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		Map<Integer,String> estados = new HashMap<Integer,String>();
		estados.put(JFrame.NORMAL, "NORMAL");
		estados.put(JFrame.ICONIFIED, "MINIMIZADA");
		estados.put(JFrame.MAXIMIZED_HORIZ, "MAXIMIZADA HORIZONTALMENTE");
		estados.put(JFrame.MAXIMIZED_VERT, "MAXIMIZADA VERTICALMENTE");
		estados.put(JFrame.MAXIMIZED_BOTH, "MAXIMIZADA");
		estados.put(7, "MINIMIZADA");
		
		System.out.println("Ha cambiado el estado de " +
		estados.get( e.getOldState()) + " a " + estados.get( e.getNewState()));
	}
	
}

