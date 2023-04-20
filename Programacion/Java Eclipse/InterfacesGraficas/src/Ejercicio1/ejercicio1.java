package Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class ejercicio1 {

	public static void main(String[] args) {
		new VentanaBoton();
	}

}

class VentanaBoton extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaBoton() {
		setTitle("Fecha Actual");
		setBounds(10, 10, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelBoton());

		setVisible(true);
	}
}

class PanelBoton extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton botonFecha = new JButton("Obtener fecha y hora actual");
	JLabel labelFecha = new JLabel("");

	public PanelBoton() {

		add(botonFecha);
		add(labelFecha);

		botonFecha.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();

		if (botonPulsado == botonFecha) {
			labelFecha.setText("Fecha y Hora: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY "))
					+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("H:mm:ss")));
		}
	}

}
