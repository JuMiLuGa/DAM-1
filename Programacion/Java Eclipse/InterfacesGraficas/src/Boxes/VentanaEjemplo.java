package Boxes;

import javax.swing.*;
import java.awt.*;

public class VentanaEjemplo {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame ventana = new JFrame("Ejemplo de Ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(10, 10, 300, 150);

        // Crear las cajas horizontales
        JPanel cajaHorizontal1 = new JPanel(new FlowLayout());
        JPanel cajaHorizontal2 = new JPanel(new FlowLayout());
        JPanel cajaHorizontal3 = new JPanel(new FlowLayout());
        JPanel cajaHorizontal4 = new JPanel(new BorderLayout());

        // Crear los componentes para la primera caja horizontal
        JLabel label1 = new JLabel("Nombre");
        JTextField textField1 = new JTextField(10);
        cajaHorizontal1.add(label1);
        cajaHorizontal1.add(textField1);

        // Crear los componentes para la segunda caja horizontal
        JLabel label2 = new JLabel("Apellido 1");
        JTextField textField2 = new JTextField(10);
        cajaHorizontal2.add(label2);
        cajaHorizontal2.add(textField2);

        // Crear los componentes para la tercera caja horizontal
        JLabel label3 = new JLabel("Apellido 2");
        JTextField textField3 = new JTextField(10);
        cajaHorizontal3.add(label3);
        cajaHorizontal3.add(textField3);

        // Crear los botones para la cuarta caja horizontal
        JButton botonIzquierda = new JButton("Registrar");
        JButton botonDerecha = new JButton("Vaciar");
        botonIzquierda.setPreferredSize(new Dimension(botonIzquierda.getPreferredSize().width, 10));
        botonDerecha.setPreferredSize(new Dimension(botonDerecha.getPreferredSize().width, 10));
        cajaHorizontal4.add(botonIzquierda, BorderLayout.WEST);
        cajaHorizontal4.add(botonDerecha, BorderLayout.EAST);

        // Crear la caja vertical y agregar las cajas horizontales
        JPanel cajaVertical = new JPanel();
        cajaVertical.setLayout(new BoxLayout(cajaVertical, BoxLayout.Y_AXIS));
        cajaVertical.add(cajaHorizontal1);
        cajaVertical.add(cajaHorizontal2);
        cajaVertical.add(cajaHorizontal3);
        cajaVertical.add(cajaHorizontal4);

        // Agregar la caja vertical a la ventana
        ventana.getContentPane().add(cajaVertical);

        // Mostrar la ventana
        ventana.setVisible(true);
    }
}

