package segundaEv;

import java.util.Scanner;

public class millares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Introduce un numero: ");
        StringBuilder num = new StringBuilder(entrada.next());
        entrada.close();
        
        if(num.length() <= 3) {
        	System.out.println(num.toString());
        }else {
        	num.reverse();
        	for(int i = 3 ; i < num.length() ; i += 4 ) {
        		num.insert(i, ".");
        	}
        	num.reverse();
        	System.out.println(num.toString());
        }
	}

}
