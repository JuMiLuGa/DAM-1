
public class EjercicioBucles4 {

	public static void main(String[] args) {
	
	int sumap = 0;
	int sumai = 0;
		for(int i = 1 ; i <= 1000; i++ ) {
			if(i%2 == 0) {
				sumap=sumap+i;
			}else {
				sumai=sumai+i;
			}
		}
System.out.println("La suma de los impares es: " + sumai);
System.out.println("La suma de lo pares es: " + sumap);
	}

}
