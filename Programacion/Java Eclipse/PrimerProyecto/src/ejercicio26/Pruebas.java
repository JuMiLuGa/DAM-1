package ejercicio26;

public class Pruebas {

	public static void main(String[] args) {
		Cantor piolin = new Canario();
		Cantor claudio = new Gallo();
		Cantor pavarotti = new Persona();
		
		Escenario.hacerCantar(piolin);
	    Escenario.hacerCantar(claudio);
	    Escenario.hacerCantar(pavarotti);
	}
}
