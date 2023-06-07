package componentes_avanzados;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Listas {

	public static void main(String[] args) {
		new VentanaPruebaListas();
	}
}

class VentanaPruebaListas extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado",
			"Domingo" };

	public VentanaPruebaListas() {
		setTitle("Probando Listas");
		setBounds(10, 10, 800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JList<String> lstDias = new JList<>(DIAS_SEMANA);

		lstDias.addListSelectionListener(new ListSelectionListener() {
			
			java.util.List<String> diasSeleccionados = lstDias.getSelectedValuesList();
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				
			}
		});
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.add(lstDias);

		JLabel lblDiasSeleccionados = new JLabel("Ningun dia seleccionado.");

		getContentPane().add(pnlPrincipal);
		getContentPane().add(lblDiasSeleccionados, BorderLayout.SOUTH);

		setVisible(true);
	}

}
