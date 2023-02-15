package depuracion;

public class Aleatorios {

	public static void main(String[] args) {
		
		int numElementos = 7;
		
		int[] numeros = new int[numElementos];
		
		for( int i = 0 ; i < numeros.length ; i++) {
			numeros[i]=100;
		}
		for( int i = 0 ; i < numeros.length ; i++) {
			numeros[i]=(int)Math.random()*100;
			System.out.print("El numero es: ");
			System.out.println(numeros[i]);
		}
		for( int numero : numeros ) {
			System.out.println(numero);
		}

	}

}
