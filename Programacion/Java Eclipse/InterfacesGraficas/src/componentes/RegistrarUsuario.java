package componentes;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarUsuario {

    public static void main(String[] args) {
        new VentanaRegistro();
    }
}

class VentanaRegistro extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnRegistrar;

    public VentanaRegistro() {
        setTitle("Registrar usuario");
        setBounds(10, 10, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelCampos = new JPanel(new GridLayout(2, 2));
        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField(20);
        JLabel lblContraseña = new JLabel("Contraseña:");
        txtContraseña = new JPasswordField(20);
        panelCampos.add(lblUsuario);
        panelCampos.add(txtUsuario);
        panelCampos.add(lblContraseña);
        panelCampos.add(txtContraseña);
        add(panelCampos, BorderLayout.CENTER);

        JPanel panelBoton = new JPanel();
        btnRegistrar = new JButton("Registrar");

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	
                String usuario = txtUsuario.getText();
                String contraseña = String.valueOf(txtContraseña.getPassword());

                if(usuario.length() == 0) {
                	JOptionPane.showMessageDialog(lblUsuario, "El Usuario no puede quedar vacio");
                }else if(contraseña.length() < 8 || contraseña.length() > 12) {
                	JOptionPane.showMessageDialog(txtContraseña, "La contraseña no cumple los requisitos debe estar entre 8 y 10 caracteres");
                }else {
                    System.out.println("Usuario: " + usuario);
                    System.out.println("Contraseña: " + contraseña);
                }
            }
        });

        panelBoton.add(btnRegistrar);
        add(panelBoton, BorderLayout.SOUTH);

        txtContraseña.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarColorContraseña();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarColorContraseña();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarColorContraseña();
            }

            private void actualizarColorContraseña() {
                String contraseña = String.valueOf(txtContraseña.getPassword());
                if (contraseña.length() < 8 || contraseña.length() > 12) {
                    txtContraseña.setBackground(Color.RED);
                } else {
                    txtContraseña.setBackground(Color.WHITE);
                }
            }
        });

        pack();
        setVisible(true);
    }
}
