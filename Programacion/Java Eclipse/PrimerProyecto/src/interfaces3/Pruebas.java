package interfaces3;

public class Pruebas {
	public static void main(String[] args) {
		Lapiz l = new Lapiz();
		l.escribirAlgo();
		l.escribirDoble("Escribo con carbon");
		
		Boli b = new Boli();
		b.escribirAlgo();
		b.escribirDoble("Escribo con tinta");
		
		Escribir.mostrarDescripcion();
	}
}
