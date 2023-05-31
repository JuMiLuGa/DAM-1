package disposiciones_avanzdas;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.*;

public class DisposicionPropia {

	public static void main(String[] args) {
		new VentanaDisposicionPropia();
	}

}

class VentanaDisposicionPropia extends JFrame {
	public VentanaDisposicionPropia() {
		setTitle("Disposición propia");
		setBounds(2100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btnRojo = new JButton("Rojo");
		JButton btnVerde = new JButton("Verde");
		JButton btnAzul = new JButton("Azul");

		getContentPane().setLayout(new LayoutDiagonal());

		getContentPane().add(btnRojo);
		getContentPane().add(btnVerde);
		getContentPane().add(btnAzul);
		
//		getContentPane().add(new JButton("Blanco"));
//		getContentPane().add(new JButton("Negro"));
//		getContentPane().add(new JButton("Naranja"));

		setVisible(true);
	}
}

class LayoutDiagonal implements LayoutManager {
	private int x = 10;
	private int y = 10;

	private int ancho = 80; // Ancho de cada componente
	private int alto = 80; // Alto de cada componente
	private int separacionHorizontal = 150;
	private int separacionVertical = 150;

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		int numComponentes = parent.getComponentCount();

//		x = (parent.getWidth() - (numComponentes * (ancho + separacionHorizontal) - separacionHorizontal)) / 2;
//		y = (parent.getHeight() - (numComponentes * (alto + separacionVertical) - separacionVertical)) / 2;

		// Alternativa más reducida
		x = ((parent.getWidth() - numComponentes * ancho) / 2) - separacionHorizontal;
		y = ((parent.getHeight() - numComponentes * alto) / 2) - separacionVertical;

		
		for (int i = 0; i < numComponentes; i++) {
			Component c = parent.getComponent(i);
			System.out.println(c.getWidth());
			c.setBounds(x, y, ancho, alto);
			x += ancho + separacionHorizontal;
			y += alto + separacionVertical;
		}
	}

}
