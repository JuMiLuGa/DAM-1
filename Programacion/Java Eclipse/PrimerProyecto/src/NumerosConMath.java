
public class NumerosConMath {

	public static void main(String[] args) {
		// REDONDEAR
		double num = 9.85;
		int resultado = (int)Math.round(num);
		
		System.out.println(num + " viene siendo " + resultado + " si lo redondeamos");
				
		//ELEVAR
		double base = 2;
		double exponente = 32;
		int res = (int)Math.pow(base, exponente);
		System.out.println(base + " elevado a " + exponente + " es igual a " + res);
	}

}
