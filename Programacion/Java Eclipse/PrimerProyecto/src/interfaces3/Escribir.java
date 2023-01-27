package interfaces3;

public interface Escribir {
	void escribirAlgo();
	
	default void escribirDoble(String cadena) {
		escribirLinea(cadena.length());
		System.out.println(cadena);
		escribirLinea(cadena.length());
		System.out.println(cadena);
		escribirLinea(cadena.length());

	}
	
	static void mostrarDescripcion(){
		escribirLinea();
		System.out.println("Soy una herramienta que sirve para escribir");
		escribirLinea();
	}
	
	private void   escribirLinea(int longitud) {
		for(int i = 0 ; i < longitud ; i++ ) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	private static void escribirLinea() {
		for(int i=0 ;i<44; i++) {
			System.out.print("·");
		}
		System.out.println();
	}
}
