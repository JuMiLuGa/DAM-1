package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreasDeTexo {

	public static void main(String[] args) {
		new VentanaAreaTexto();
	}

}
class VentanaAreaTexto extends JFrame{
	public VentanaAreaTexto() {
		setTitle("Área de texto");
		setBounds(2010,10,200,220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PanelAreaTexto());
		
		setVisible(true);
	}
}
class PanelAreaTexto extends JPanel{
	public PanelAreaTexto() {
		JTextArea txaTexto = new JTextArea(8,15);
		txaTexto.setLineWrap(true);
		
		JScrollPane scpTexto = new JScrollPane(txaTexto);
		setLayout(new BorderLayout());
		add(scpTexto, BorderLayout.CENTER);
		
		JButton btnConvertirEnMayusculas = new JButton("Pasar a mayúsculas");
		add(btnConvertirEnMayusculas, BorderLayout.SOUTH);
		
		btnConvertirEnMayusculas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txaTexto.getSelectedText() != null)
					txaTexto.replaceSelection(txaTexto.getSelectedText().toUpperCase());
			}
		});
		
	}
}