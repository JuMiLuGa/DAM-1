package interfaces3;

public class Boli implements Escribir{

	public void escribirAlgo() {
		System.out.println("Hola, soy un boli");
	}
	
	@Override
	public void escribirDoble(String cadena) {
		System.out.println(cadena + " | " + cadena);
	}
}
