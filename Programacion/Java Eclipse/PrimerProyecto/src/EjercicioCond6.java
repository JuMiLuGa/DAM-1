import java.util.*;
public class EjercicioCond6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca la hora");
		int hora = entrada.nextInt();
				
		System.out.print("Introduzca los minutos");
		int minuto = entrada.nextInt();

		int horaseg = ((24-hora)*120);
		int minseg = ((60-minuto)*60);
		
		System.out.println("Quedan " + (horaseg+minseg) + " segundos para medianoche");
		
		entrada.close();
	}

}
