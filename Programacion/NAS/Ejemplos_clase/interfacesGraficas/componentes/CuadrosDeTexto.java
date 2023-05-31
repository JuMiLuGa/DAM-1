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
class VentanaTexto extends JFrame{
	public VentanaTexto() {
		setTitle("Ventana texto");
		setBounds(2010,10,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new PanelTexto());
		
		setVisible(true);
	}
}

class PanelTexto extends JPanel{
	
	public PanelTexto() {
		JLabel lblTexto = new JLabel("Texto: ");
		add(lblTexto);
		
		JTextField txtTexto = new JTextField("texto", 15);
		add(txtTexto);
		
		JButton btnCapturarTexto = new JButton("Capturar texto");
		add(btnCapturarTexto);
		
		btnCapturarTexto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoCapturado = txtTexto.getText().trim().toUpperCase();
				
				System.out.println("Texto capturado: " + textoCapturado);
			}
		});
		
		Document documento = txtTexto.getDocument();
		documento.addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("Borrando texto");
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("Añadiento texto");
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("Modificando texto");
			}
		});
	}
}