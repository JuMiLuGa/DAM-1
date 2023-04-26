package ventanaseventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebasEventosRaton {

	public static void main(String[] args) {
		new VentanaRaton();
	}

}
class VentanaRaton extends JFrame{
	public VentanaRaton() {
		setTitle("Eventos de ratón");
		setBounds(10,10,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		EventosRaton eventosR= new EventosRaton();
		addMouseListener(eventosR);
		addMouseMotionListener(eventosR);
		
		setVisible(true);
	}
}

class EventosRaton implements MouseListener, MouseMotionListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click de ratón en (" + e.getX()+ "," + e.getY() + ") Absolutas: (" +
	e.getXOnScreen() + "," + e.getYOnScreen() + ")");
		System.out.println("Nº clicks: " + e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.print("Presionado botón ratón ");
		switch(e.getModifiersEx()) {
		case MouseEvent.BUTTON1_DOWN_MASK:
			System.out.println("izquierdo");
			break;
		case MouseEvent.BUTTON2_DOWN_MASK:
			System.out.println("central");
			break;
		case MouseEvent.BUTTON3_DOWN_MASK:
			System.out.println("derecho");
			break;
		case 7:
			System.out.println("izquierdo superior");
			break;
			default:
				System.out.println("otro");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Liberado botón ratón ");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Ratón dentro");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Ratón fuera");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Arrastrando el ratón... (" + e.getX() + "," + e.getY() + ")");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moviendo el ratón...");
	}
	
}