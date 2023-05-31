package EjerciciosInterfacesGraficas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

	public static void main(String[] args) {
		new Ventana();
	}

}

class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

	public Ventana() {
		
		setTitle("Ejercicio 1");
		setBounds(10, 10, 500, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new panelVentana());

		setLocationRelativeTo(null);
		pack();
		
		setVisible(true);
	}

}

class panelVentana extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
		JLabel lblTexto = new JLabel("Escribe un nombre para saludar:");
		JTextField txtTexto = new JTextField(10);
		JButton btnSaludar = new JButton("Saludar");
		
	public panelVentana () {
		
//		setLayout( new GridLayout( 1,3 ) ); Añadir el grid
		
		add(lblTexto);
		add(txtTexto);
		add(btnSaludar);
		btnSaludar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object Saludar = e.getSource();
		
		if(Saludar == btnSaludar) {
			JOptionPane.showMessageDialog(btnSaludar, "¡Hola " + txtTexto.getText() + "!");
		}
	}
}
