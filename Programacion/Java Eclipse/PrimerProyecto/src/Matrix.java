

	
	import java.awt.*;
	import java.util.*;
	import javax.swing.*;

	@SuppressWarnings("serial")
	public class MainFrame extends JFrame { 

	private static final int FONT_SIZE = 20;
	private static final int NUMBER_OF_REPEATS = 5;
	private static final String TEXT = new String("0123456789/*-+/<>?;:[]~!@#$%^&*()+=abcdefghijklmnopqrstuvwxyz");
	private static JPanel panel = new JPanel(null);
	private static Random random = new Random();
	private static JLabel label[] = new JLabel[NUMBER_OF_REPEATS];

	public MainFrame() {        
	    this.add(panel);
	    panel.setBackground(Color.BLACK);
	}

	public void scroll() {
	    for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
	        int character_initial = random.nextInt(TEXT.length());
	        int random_x = random.nextInt(panel.getWidth() / FONT_SIZE) - 1;
	        int colour = 255;
	        label[i] = new JLabel(""+TEXT.charAt(character_initial));
	        panel.add(label[i]);
	        label[i].setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
	        label[i].setForeground(new Color(0, 255, 0));

	        //change the text of the labels and their position
	        for (int j = 0; j < (panel.getHeight() / FONT_SIZE)*2; j++) {
	            int character = random.nextInt(TEXT.length());
	            label[i].setBounds(random_x*FONT_SIZE, j*(FONT_SIZE / 2), FONT_SIZE, FONT_SIZE);
	            label[i].setText(""+TEXT.charAt(character));

	            //if foreground colour < 255 catch exception
	            try {
	                //when text reaches a certain colour remove it
	                label[i].setForeground(new Color(0, 255-(j*5), 0));
	                colour = 255-(j*5);
	                if (colour <= 80) {
	                    panel.remove(label[i]);
	                    repaint();
	                    colour = 255;
	                    j = (panel.getHeight() / FONT_SIZE)*2;
	                }
	            } catch (Exception e) {}

	            //pause between each character
	            try {
	                Thread.sleep(75);
	            } catch (Exception e) {}
	        }

	        //create an infinite loop
	        if (i == NUMBER_OF_REPEATS - 1) {
	            i = 0;
	        }
	    }
	}

	public static void main(String[] args) {
	    MainFrame frame = new MainFrame();
	    frame.setVisible(true);
	    frame.setSize(600, 400);
	    frame.setResizable(false);
	    frame.setMinimumSize(new Dimension(300, 200));
	    frame.setLocationRelativeTo(null);
	    frame.setTitle("Matrix Code Emulator by Ricco");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    frame.scroll();
	}
	}

