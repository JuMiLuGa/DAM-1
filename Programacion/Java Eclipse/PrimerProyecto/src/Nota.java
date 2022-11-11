import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Que nota as sacado? ");
		double nota = entrada.nextDouble();
		System.out.println("Esta nota vale un 30%");
		System.out.println("Para aprobar, en el siguiente examen tienes que sacar: ");
		entrada.close();
		double notaP = ((nota*30)/100);
		double notaApP = ((10 - notaP)-5);
		double notaApF = ((notaApP/70)*100);
		
		System.out.print(notaApF);
	}

}
