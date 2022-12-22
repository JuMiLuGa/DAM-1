package sobrecarga_de_metodos;

public class Ejemplo {

	public void saludar() {
		System.out.println("Hola");
	}
	
	public void saludar(String nombre) {
		System.out.println("Hola " + nombre);
	}
	
	public void saludar(String saludo, String nombre) {
		System.out.println(saludo + " " + nombre);
	}
	
	public void saludar(int numVeces) {
		for(int i = 0 ; i < numVeces ; i++) {
			System.out.println("Hola");
		}
	}
	
	public void saludar(String saludo, int numVeces) {
		for(int i = 0 ; i < numVeces ; i++) {
			System.out.println("Hola" + numVeces);
		}
	}
	
	public static void main(String[] args) {
		Ejemplo ej = new Ejemplo();
		
		ej.saludar();
		System.out.println();
		

		ej.saludar("Julio");
		System.out.println();
		
		ej.saludar("Hola", "Miguel");
		System.out.println();
		
		ej.saludar(5);
		System.out.println();
		
		ej.saludar("Hola", 4);
		System.out.println();
		
	}

}
