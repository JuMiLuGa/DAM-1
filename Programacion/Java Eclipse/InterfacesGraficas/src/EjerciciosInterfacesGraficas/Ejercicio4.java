package EjerciciosInterfacesGraficas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio4 extends JFrame {
    
    
	private static final long serialVersionUID = 1L;
	
	private JPanel[][] pixels;
    
    public Ejercicio4() {
        super("Pixel Panel");
        
        // configurar el panel principal
        JPanel mainPanel = new JPanel(new GridLayout(50, 50));
        pixels = new JPanel[50][50];
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                JPanel pixel = new JPanel();
                pixel.setBackground(Color.WHITE);
                pixel.addMouseListener(new PixelClickListener(pixel));
                mainPanel.add(pixel);
                pixels[i][j] = pixel;
            }
        }
        add(mainPanel);
        
        // configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
    
    private class PixelClickListener extends MouseAdapter {
        
        private JPanel pixel;
        
        public PixelClickListener(JPanel pixel) {
            this.pixel = pixel;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) { // clic izquierdo
                Color color = pixel.getBackground();
                if (color.equals(Color.RED)) {
                    pixel.setBackground(Color.GREEN);
                } else if (color.equals(Color.GREEN)) {
                    pixel.setBackground(Color.BLUE);
                } else {
                    pixel.setBackground(Color.RED);
                }
            } else if (e.getButton() == MouseEvent.BUTTON3) { // clic derecho
                Color color = pixel.getBackground();
                if (color.equals(Color.BLACK)) {
                    pixel.setBackground(Color.WHITE);
                } else {
                    pixel.setBackground(Color.BLACK);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Ejercicio4();
    }
}
