import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		Scanner entrada = new Scanner(System.in);
		int numero = -1;
		int numintentos = 0;
		
		while(numero != aleatorio && numintentos<5) {
			numintentos++;
			System.out.print("Introduzca un numero: ");
			numero = entrada.nextInt();
			if (aleatorio < numero) {
				System.out.println("Menor");
			} else if(aleatorio>numero) {
				System.out.println("Mayor");
			}
		}
		entrada.close();
		if(numintentos < 5) {
			System.out.println("Enhorabuena has acertado en " + numintentos + " intentos");
		}else {		
			System.out.println("has superado el limite de intentos, el numero era " + aleatorio);
			System.out.println("Suerte en la proxima");
		}
	}
}
