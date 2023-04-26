package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class RegistrarUsuario {

	public static void main(String[] args) {
		new VentanaRegistro();
	}

}
class VentanaRegistro extends JFrame{
	private final int LONGITUD_MIN_CLAVE = 8;
	private final int LONGITUD_MAX_CLAVE = 12;
	JPasswordField pwdClave;
	private boolean claveConLongitudCorrecta = false;
	
	public VentanaRegistro() {
		setTitle("Registrar usuario");
		setBounds(2010,10,500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel lblUsuario = new JLabel("Usuario: ", JLabel.RIGHT);
		JLabel lblClave = new JLabel("Contraseña: ", JLabel.RIGHT);
		JTextField txtUsuario = new JTextField(10);
		pwdClave = new JPasswordField(10);
		
		JPanel pnlCampos = new JPanel();
		pnlCampos.setLayout(new GridLayout(2,2));
		pnlCampos.add(lblUsuario);
		pnlCampos.add(txtUsuario);
		pnlCampos.add(lblClave);
		pnlCampos.add(pwdClave);
		
		getContentPane().add(pnlCampos,BorderLayout.NORTH);
		
		JButton btnRegistro = new JButton("Registro");
		JPanel pnlSur = new JPanel();
		pnlSur.add(btnRegistro);
		getContentPane().add(pnlSur, BorderLayout.SOUTH);
		
		pwdClave.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				comprobarLongitudClave();				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				comprobarLongitudClave();				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
			}
		});
		
		btnRegistro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mensaje = "";
				if(txtUsuario.getText().length() == 0) {
					mensaje = "El campo usuario no puede quedar vacío.";
					txtUsuario.requestFocusInWindow();
				} else if (!claveConLongitudCorrecta) {
					mensaje = "La longitud de la contraseña no es válida, debe estar entre " 
				+ LONGITUD_MIN_CLAVE + " y " + LONGITUD_MAX_CLAVE + " caracteres.";
					pwdClave.requestFocusInWindow();
				} else {
					mensaje = "Registro completado correctamente.";
					txtUsuario.setText("");
					pwdClave.setText("");
					pwdClave.setBackground(Color.WHITE);
					txtUsuario.requestFocusInWindow();
				}
				JOptionPane.showMessageDialog(VentanaRegistro.this, mensaje);
			}
		});
		
		lblClave.setToolTipText("La contraseña debe tener entre " + LONGITUD_MIN_CLAVE 
				+ " y " + LONGITUD_MAX_CLAVE + " caracteres");
		pwdClave.setToolTipText("La contraseña debe tener entre " + LONGITUD_MIN_CLAVE 
				+ " y " + LONGITUD_MAX_CLAVE + " caracteres");
		
		setVisible(true);
	}
	
	private void comprobarLongitudClave() {
		claveConLongitudCorrecta = pwdClave.getPassword().length >= LONGITUD_MIN_CLAVE && pwdClave.getPassword().length <= LONGITUD_MAX_CLAVE;
		if(!claveConLongitudCorrecta)
			pwdClave.setBackground(Color.RED);
		else
			pwdClave.setBackground(Color.WHITE);
	}
}