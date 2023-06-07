package Ejercicio2b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ejercicio2b {

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

    JButton boton1 = new JButton(" Boton 1 ");
    JButton boton2 = new JButton(" Boton 2 ");
    JButton boton3 = new JButton(" Boton 3 ");
    JTextField texto1 = new JTextField(20);
    JLabel labelB = new JLabel("");

    public PanelBoton() {

        add(boton1);
        add(boton2);
        add(boton3);
        add(texto1);
        add(labelB);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        texto1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();

        if (botonPulsado == boton1) {
            labelB.setText("El botón pulsado fue el Boton 1");
        } else if (botonPulsado == boton2) {
            labelB.setText("El botón pulsado fue el Boton 2");
        } else if (botonPulsado == boton3) {
            labelB.setText("El botón pulsado fue el Boton 3");
        } else if (botonPulsado == texto1) {
            labelB.setText("El texto es: " + texto1.getText());
        }
    }
}

