package ventanas_emergentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class CuadroDialogo {

    public static void main(String[] args) {
        new VentanaCuadroDialogo();
    }
}

class VentanaCuadroDialogo extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JLabel lblTexto;

    public VentanaCuadroDialogo() {
        setTitle("Cuadros de diálogo");
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        JPanel pnlNorte = new JPanel();
        JButton btnNombre = new JButton("Nombre");
        pnlNorte.add(btnNombre);

        lblTexto = new JLabel("Etiqueta");
        lblTexto.setFont(lblTexto.getFont().deriveFont(50f));

        getContentPane().add(pnlNorte, BorderLayout.NORTH);
        getContentPane().add(lblTexto, BorderLayout.SOUTH);

        btnNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] nombres = {"Carlos", "Paco", "Alma", "Juanca", "Nano"};
                String texto = (String) JOptionPane.showInputDialog(VentanaCuadroDialogo.this, "¿Cómo te llamas?",
                        "Nombre", JOptionPane.QUESTION_MESSAGE, null, nombres, nombres[0]);
                lblTexto.setText(texto);
            }
        });

        JButton btnConfirmacion = new JButton("Confirmación");
        pnlNorte.add(btnConfirmacion);
        int[] tiposOpcion = {JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.OK_CANCEL_OPTION};
        btnConfirmacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i : tiposOpcion) {
                    int valorElegido = JOptionPane.showConfirmDialog(VentanaCuadroDialogo.this, "Elija una opción",
                            "Confirmación", i);
                    lblTexto.setText("Valor elegido: " + valorElegido);
                }
            }
        });

        JButton btnOpcion = new JButton("Opciones");
        pnlNorte.add(btnOpcion);
        btnOpcion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] arrayObjetos = {btnNombre, new JLabel("Etiqueta de prueba"), 2023};

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
                String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
                JComboBox<String> comboDias = new JComboBox<>(dias);
                JButton btnAleatorio = new JButton("Aleatorio");
                JButton btnCancelar = new JButton("Cancelar");
                JPanel pnlCentro = new JPanel();
                pnlCentro.add(comboDias);
                pnlCentro.add(btnAleatorio);
                pnlCentro.add(btnCancelar);
                
                btnCancelar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						lblTexto.setText("Día favorito: No seleccionado");
					}
				});
                		
                		
                btnAleatorio.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int index = new Random().nextInt(dias.length);
                        String diaAleatorio = (String) comboDias.getItemAt(index);
                        lblTexto.setText("Día favorito: " + diaAleatorio);
                    }
                });

                JOptionPane.showOptionDialog(VentanaCuadroDialogo.this, pnlCentro, "Días", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE, null, null, null);
            }
        });
        
        
        JButton btnSalir = new JButton("Salir");
        pnlNorte.add(btnSalir);
        btnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				mostrarDialogoSalir();
			}
		});

        pnlNorte.setBorder(BorderFactory.createEtchedBorder());
        pnlNorte.setBorder(BorderFactory.createLineBorder(Color.RED));
        pnlNorte.setBorder(BorderFactory.createLineBorder(Color.RED, 6, true));
        pnlNorte.setBorder(BorderFactory.createMatteBorder(5, 10, 15, 20, Color.BLUE));
        pnlNorte.setBorder(BorderFactory.createMatteBorder(5, 10, 15, 20, new ImageIcon("recursos/cerrar16.png")));
        pnlNorte.setBorder(BorderFactory.createTitledBorder("Botones"));
        CompoundBorder bordeCompuesto = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.RED),
                BorderFactory.createLineBorder(Color.BLUE));
        pnlNorte.setBorder(BorderFactory.createTitledBorder(bordeCompuesto, "Botones", TitledBorder.CENTER,
                TitledBorder.ABOVE_BOTTOM, new Font("Verdana", Font.ITALIC, 21), Color.GREEN));

        addWindowListener((WindowListener) new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mostrarDialogoSalir();
            }
        });

        setVisible(true);
    }

    private void mostrarDialogoSalir() {
        JDialog dialogo = new JDialog(this, "Salir", true);
        dialogo.setSize(300, 150);
        dialogo.setLocationRelativeTo(this);

        JLabel lblMensaje = new JLabel("¿Realmente quieres salir?");
        lblMensaje.setFont(lblMensaje.getFont().deriveFont(20f));
        JPanel panel = new JPanel();
        panel.add(lblMensaje);
        dialogo.getContentPane().add(panel, BorderLayout.CENTER);

        JButton btnSi = new JButton("Sí");
        JButton btnNo = new JButton("No");
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnSi);
        panelBotones.add(btnNo);
        dialogo.getContentPane().add(panelBotones, BorderLayout.SOUTH);

        btnSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        dialogo.setVisible(true);
    }
}
 
