package ventanas_emergentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class CuadroDialogo {

	public static void main(String[] args) {
		new VentanaCuadroDialogo();
	}

}
class VentanaCuadroDialogo extends JFrame{
	public VentanaCuadroDialogo() {
		setTitle("Cuadros de diálogo");
		setBounds(2100,100,600,400);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
//		JOptionPane.showMessageDialog(this, "Espero que te guste el programa");
		
		JButton btnNombre = new JButton("Nombre");
		JPanel pnlNorte = new JPanel();
		pnlNorte.add(btnNombre);
		
		JLabel lblTexto = new JLabel("Etiqueta");
		lblTexto.setFont(new Font("Arial", Font.BOLD, 50));
		
		btnNombre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				String textoIntroducido = JOptionPane.showInputDialog("¿Cómo te llamas?");
//				lblTexto.setText(textoIntroducido);
				
				Object textoIntroducido = JOptionPane.showInputDialog(VentanaCuadroDialogo.this, "¿Cómo te llamas?", "Nombre", JOptionPane.QUESTION_MESSAGE, new ImageIcon("recursos/zoom16.png"),new Object[] {"Ana", "Pedro", "Lidia", "David"}, "Lidia");
				if (textoIntroducido != null)
					lblTexto.setText(textoIntroducido.toString());
			}
		});
		
		JButton btnConfirmacion = new JButton("Confirmación");
		pnlNorte.add(btnConfirmacion);
		
		int[] tiposOpcion = {JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION};
		btnConfirmacion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i : tiposOpcion) {
					int valorElegido = JOptionPane.showConfirmDialog(VentanaCuadroDialogo.this,
							"Elija una opción", "Confirmación" , i);
					lblTexto.setText("Valor elegido: " + valorElegido);
				}
			}
		});
		
		JButton btnOpcion = new JButton("Opciones");
		pnlNorte.add(btnOpcion);
		btnOpcion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				int valorElegido = JOptionPane.showOptionDialog(VentanaCuadroDialogo.this,
//						"¿Cómo te llamas?", "Nombre", 0, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Ana","Pedro", "Lidia", "David"}, 2);
//				lblTexto.setText("Valor elegido: " + valorElegido);
				
				Object[] arrayObjetos = {btnNombre, new ImageIcon("recursos/zoom16.png"), new JTextField("hola", 7), 2023};
				
				JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, arrayObjetos, "Array objetos", 
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				
				JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, "¿Qué objeto prefieres?", "Array de opciones",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, arrayObjetos, arrayObjetos[1]);
				
				
				
			}
		});
		
		JButton btnDias = new JButton("Días");
		pnlNorte.add(btnDias);
		btnDias.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
				JComboBox<String> cmbDias = new JComboBox<>(dias);
				cmbDias.setSelectedItem("Martes");
				String[] opciones = { "Aceptar", "Cancelar", "Cualquiera" };

				String titulo = "Días de la semana";
				int opcionSeleccionada = JOptionPane.showOptionDialog(null, cmbDias, titulo, JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);

				if (opcionSeleccionada >= 0) { // Porque si se cierra el cuadro de diálogo con la X devuelve -1
					System.out.println(
							"Opción seleccionada: " + opciones[opcionSeleccionada] + "(" + opcionSeleccionada + ")");
					if(opciones[opcionSeleccionada] == "Aceptar")
						lblTexto.setText("Día favorito: " + cmbDias.getSelectedItem());
					else if(opciones[opcionSeleccionada] == "Cualquiera")
						lblTexto.setText("Día favorito: cualquiera");
					else
						lblTexto.setText("No se ha elegido día favorito");
				} else
					lblTexto.setText("No se ha elegido día favorito");


			} 
		});
		
		pnlNorte.setBorder(BorderFactory.createEtchedBorder());
		pnlNorte.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnlNorte.setBorder(BorderFactory.createLineBorder(Color.RED, 6, true));
		pnlNorte.setBorder(BorderFactory.createMatteBorder(5,10,15,20,Color.BLUE));
		pnlNorte.setBorder(BorderFactory.createMatteBorder(5,10,15,20,new ImageIcon("recursos/zoom16.png")));
		pnlNorte.setBorder(BorderFactory.createTitledBorder("Botones"));
		CompoundBorder bordeCompuesto = BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.RED), BorderFactory.createLineBorder(Color.BLUE));
		pnlNorte.setBorder(BorderFactory.createTitledBorder(bordeCompuesto, "Botones", 
				TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, new Font("Verdana", Font.ITALIC, 21), Color.GREEN));
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				confirmarSalida();
			}
			
		});
		
		JButton btnSalir = new JButton("Salir");
		pnlNorte.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				confirmarSalida();
			}
		});
		
		getContentPane().add(pnlNorte, BorderLayout.NORTH);
		getContentPane().add(lblTexto, BorderLayout.SOUTH);
		
		
		
		
		
		
		setVisible(true);
		
//		JOptionPane.showMessageDialog(this, "Se ha finalizado la carga del programa", 
//				"Título del cuandro de diálogo", JOptionPane.PLAIN_MESSAGE);
		int[] tiposMensaje = {JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE,
				JOptionPane.QUESTION_MESSAGE, JOptionPane.PLAIN_MESSAGE}; 
		
//		for(int i : tiposMensaje)
//			JOptionPane.showMessageDialog(this, "Espero que te guste el programa", String.valueOf(i), i);
		
		
		
	}
	
	private void confirmarSalida() {
		int seleccion = JOptionPane.showConfirmDialog(VentanaCuadroDialogo.this,  "¿Desesa realmente salir?", "Salir del programa",
				JOptionPane.YES_NO_OPTION);
		if(seleccion == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}







