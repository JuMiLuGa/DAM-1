package ordenar;

public class Ordenamiento {

	static void manipular(int[] numeros, int cantidad) {
		if (cantidad > 1) {
			for (int i = 0; i < cantidad - 1; i++)
				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
				}
			 manipular(numeros, cantidad - 1);
		}
	}
	
	static void manipularInv(int[] numeros, int cantidad) {
	    if (cantidad > 1) {
	        for (int i = 0; i < cantidad - 1; i++) {
	            for (int j = i + 1; j < cantidad; j++) {
	                if (numeros[j] > numeros[i]) {
	                    int aux = numeros[i];
	                    numeros[i] = numeros[j];
	                    numeros[j] = aux;
	                }
	            }
	        }
	    }
	}



	public static void main(String[] args) {
		int[] numeros = { 1, 5, 9, 7, 8, 4, 2, 3, 6};
		int cantidad = numeros.length;
		manipular(numeros, cantidad);
		System.out.print("Arreglo ordenado:");
		for (int i = 0; i < cantidad; i++)
			System.out.print(" " + numeros[i] + ", ");
		
		System.out.println();
		System.out.println();
		
		int[] numeros1 = { 1, 5, 9, 7, 8, 4, 2, 3, 6};
		int cantidad1 = numeros1.length;
		manipularInv(numeros1, cantidad1);
		System.out.print("Arreglo inverso:");
		for (int i = 0; i < cantidad1; i++)
			System.out.print(" " + numeros1[i] + ", ");
	}
}
