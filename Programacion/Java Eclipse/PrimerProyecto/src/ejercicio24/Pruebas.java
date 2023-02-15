package ejercicio24;

public class Pruebas {

	public static void main(String[] args) {
		ImpresionNormal p1 = new Negativa();
		ImpresionNormal p2 = new Positiva();
		Neutra p3 = new Neutra();
		ImpresionNormal p4 = new Neutra();
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		p3.imprimirBonito();
		p4.imprimirBonito();
	}
	
}
