
public class EjercicioBucles4b {

		public static void main(String[] args) {
		
		int sumap = 0;
		int sumai = 0;
		
			for(int p = 1 ; p <= 1000; p++ ) {
				if(p%2 == 0) {
					sumap=sumap+p;
			}
				
			for(int i = 1 ; i <= 1000; i++ ) {
				if(i%2 != 0) {
					sumai=sumai+i;
				}
			}
		}
			System.out.println("La suma de los impares es: " + sumai);
			System.out.println("La suma de lo pares es: " + sumap);
	}
		
}