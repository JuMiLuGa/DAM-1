package ventanaseventos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebasEventosAction {

	public static void main(String[] args) {
		new VentanaBoton();
	}

}

class VentanaBoton extends JFrame {
	public VentanaBoton() {
		setTitle("Pobando eventos Action");
		setBounds(10, 10, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		add(new PanelBoton());
//		add(new PanelBotones());
		add(new PanelBotonesSinListener());

		setVisible(true);
	}
}

class PanelBoton extends JPanel implements ActionListener {
	JButton botonRojo = new JButton("rojo");

	public PanelBoton() {
		add(botonRojo);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (getBackground() == Color.RED)
			setBackground(Color.GREEN);
		else
			setBackground(Color.RED);
	}
}

class PanelBotones extends JPanel implements ActionListener {
	JButton botonRojo = new JButton("rojo");
	JButton botonVerde = new JButton("verde");
	JButton botonAzul = new JButton("azul");

	public PanelBotones() {
		add(botonRojo);
		add(botonVerde);
		add(botonAzul);
		botonRojo.addActionListener(this);
		botonVerde.addActionListener(this);
		botonAzul.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();
		
//		if (botonPulsado == botonRojo)
//			setBackground(Color.RED);
//		else if (botonPulsado == botonVerde)
//			setBackground(Color.GREEN);
//		else
//			setBackground(Color.BLUE);
		
		switch(e.getActionCommand()) {
		case "rojo":
			setBackground(Color.RED);
			break;
		case "verde":
			setBackground(Color.GREEN);
			break;
		case "azul":
			setBackground(Color.BLUE);
			break;
		}
	}
}


class PanelBotonesSinListener extends JPanel {
	JButton botonRojo = new JButton("rojo");
	JButton botonVerde = new JButton("verde");
	JButton botonAzul = new JButton("azul");

	public PanelBotonesSinListener() {
		add(botonRojo);
		add(botonVerde);
		add(botonAzul);
		
		ColorFondo rojo = new ColorFondo(Color.RED);
		ColorFondo verde = new ColorFondo(Color.GREEN);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		
		botonRojo.addActionListener(rojo);
		botonVerde.addActionListener(verde);
		botonAzul.addActionListener(azul);
	}
	
	private class ColorFondo implements ActionListener{
		private Color colorDelFondo;
		
		public ColorFondo(Color c) {
			colorDelFondo=c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDelFondo);
		}
	}
}





