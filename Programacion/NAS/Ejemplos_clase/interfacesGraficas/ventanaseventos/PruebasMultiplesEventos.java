package ventanaseventos;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class PruebasMultiplesEventos {

	public static void main(String[] args) {
		new VentanaAction();
	}

}
class VentanaAction extends JFrame{
	public	VentanaAction() {
		setTitle("Múltiples fuentes de eventos con Action");
		setBounds(2100,100,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PanelAction());
		
		setVisible(true);
	}
}
class PanelAction extends JPanel{
	public PanelAction() {
		AccionColor accionRojo = new AccionColor("rojo", Color.RED, new ImageIcon("recursos/hex16rojo.png"));
		AccionColor accionVerde = new AccionColor("verde", Color.GREEN, new ImageIcon("recursos/hex16verde.png"));
		AccionColor accionAzul = new AccionColor("azul", Color.BLUE, new ImageIcon("recursos/hex16azul.png"));
		
		add(new JButton(accionRojo));
		add(new JButton(accionVerde));
		add(new JButton(accionAzul));
		
		accionVerde.setEnabled(false);
		System.out.println(accionVerde.isEnabled());
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke atajoRojo = KeyStroke.getKeyStroke("ctrl R");
		mapaEntrada.put(atajoRojo, "fondo rojo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl V"), "fondo verde");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl G"), "fondo verde");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo azul");
		
		ActionMap mapaAcciones = getActionMap();
		mapaAcciones.put("fondo rojo", accionRojo);
		mapaAcciones.put("fondo verde", accionVerde);
		mapaAcciones.put("fondo azul", accionAzul);
		
	}
	
	private class AccionColor extends AbstractAction{
		public AccionColor(String texto, Color color, Icon icono) {
			putValue(Action.NAME, texto);
			putValue(Action.LARGE_ICON_KEY, icono);
			putValue(Action.SHORT_DESCRIPTION, "Cambia el fondo a color " + texto);
			putValue("colorFondo", color);		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c= (Color)getValue("colorFondo");
			setBackground(c);
		}
		
	}
}