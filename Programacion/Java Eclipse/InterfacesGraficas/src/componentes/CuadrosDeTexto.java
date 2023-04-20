package componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class CuadrosDeTexto {

	public static void main(String[] args) {
		new VentanaTexto();

	}

}

class VentanaTexto extends JFrame {

	private static final long serialVersionUID = 1L;

	public VentanaTexto() {
		setTitle("Ventana Texto");
		setBounds(10, 10, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new PanelTexto());

		setVisible(true);
	}
}

class PanelTexto extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelTexto() {
		JLabel lblTexto = new JLabel("Texto: ");
		add(lblTexto);
		
		JTextField txtTexto = new JTextField("texto", 20);
		add(txtTexto);
		
		JButton btnCapturarTexto = new JButton("Capturar texto");
		add(btnCapturarTexto);
		btnCapturarTexto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoCapturado = txtTexto.getText().trim();
				
				System.out.println("Texto capturado: " + textoCapturado);
				
			}
		});
		
		Document documento = txtTexto.getDocument();
		documento.addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Apéndice de método generado automáticamente
				System.out.println("Borrando texto");
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Apéndice de método generado automáticamente
				System.out.println("Añadiendo texto");
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Apéndice de método generado automáticamente
				System.out.println("Modificando texto");
			}
		});
	}
}