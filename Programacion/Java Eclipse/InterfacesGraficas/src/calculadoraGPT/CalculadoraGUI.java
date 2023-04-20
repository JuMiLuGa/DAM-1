package calculadoraGPT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculadoraGUI extends JFrame {
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JLabel lblResultado;

    public CalculadoraGUI() {
        // Configurar la ventana
        setTitle("Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Crear los componentes de la GUI
        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();
        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        lblResultado = new JLabel();

        // Agregar los componentes a la ventana
        add(new JLabel("Número 1:"));
        add(txtNumero1);
        add(new JLabel("Número 2:"));
        add(txtNumero2);
        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
        add(new JLabel("Resultado:"));
        add(lblResultado);

        // Agregar listeners de acción a los botones
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("+");
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("-");
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("*");
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular("/");
            }
        });
    }

    private void calcular(String operacion) {
        try {
            double numero1 = Double.parseDouble(txtNumero1.getText());
            double numero2 = Double.parseDouble(txtNumero2.getText());

            if (operacion.equals("/") && numero2 == 0) {
                lblResultado.setText("Error: División por cero no permitida");
                return;
            }

            double resultado = 0;
            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    break;
            }

            lblResultado.setText("Resultado: " + String.format("%.2f", resultado));
        } catch (NumberFormatException ex) {
            lblResultado.setText("Error: Ingrese números válidos");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculadoraGUI calculadora = new CalculadoraGUI();
                calculadora.setVisible(true);
            }
        });
    }
}
