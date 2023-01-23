package ejercicio16;

public class PruebaPeriodico {
	
	public static void main (String[] args) {
		
		Periodico p1 = new Periodico();
		
		Periodico p2 = new Periodico(58, 1.5f);
		
		Periodico p3 = new Periodico("La voz de galicia", "12/01/2023");
				
		Periodico p4 = new Periodico(58, 1.5f, "La voz de galicia", "12/01/2023");
		
		
		
		p1.imprimir();
		
		System.out.println("---------------------------");
		
		p2.imprimir();
		
		System.out.println("---------------------------");
		
		p3.imprimir();
		
		System.out.println("---------------------------");
		
		p4.imprimir();
		
	}
}
