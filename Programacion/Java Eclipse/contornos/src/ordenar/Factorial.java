package ordenar;

public class Factorial {
	
	public static int[] sort(int[] numbers) {
		for (int i = 0; i < numbers.length -1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					if (numbers[i] > numbers[j]) {
						int auxiliar = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = auxiliar;
					}
				}
			}
		}
		return numbers;
	}
	
	public static int[] sort_while(int[] numbers) {
	
		boolean cambio = false;
		int i = 0;
		if(numbers.length >=2) {
			do {
				if (numbers[i] > numbers[i+1]) {
					int auxiliar = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = auxiliar;
				}
			}while(cambio && ((i + 1) <= numbers.length));
		}
		
		return numbers;
	
	}
	
    public int factorial_bucle(int n) throws Exception { 
        if (n < 0) { 
            throw new Exception("Erro. O número ten que ser >=0"); 
        }
        int resultado = 1; 
        for (int i = 2; i <= n; i++) { 
            resultado *= i; 
        } 
        return resultado; 
    }
    public int factorial_recursivo(int n) throws Exception {
        if (n < 0) { 
            throw new Exception("Erro. O número ten que ser >=0"); 
        }
        if(n == 0) {
            return 1;
        }
        else {
            return n*factorial_recursivo(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        // Recursivo
        try {
            System.out.println(f.factorial_recursivo(3));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Con bucle
        try {
            System.out.println(f.factorial_bucle(3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        f.sort(new int[]{12,5,2,0,30});
       
    }
} 
