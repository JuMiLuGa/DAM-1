package segundaEv;

public class Atleta {

	public String nombre;
	public int edad;
	public double altura;
	public double peso;
	public String nif;
	
	public void visualizar() {
		
		System.out.println("Nombre: " + nombre);
		//System.out.println("Edad: " + edad + " años");
		System.out.println("Estatura: " + altura + " m");
		System.out.println("Peso: " + peso + " Kg");
		System.out.println("DNI: " + nif);
		
	}
	
	public void edad() {
		if(edad < 18) {
			System.out.println("Menor de edad");
		}else {
			System.out.println("Mayor de edad");
		}
	}

	public static void main(String[] args) {
		Atleta a1 = new Atleta();
		Atleta a2 = new Atleta();
		
		a1.nombre = "Jose";
		a2.nombre = "Ernesto";
		
		a1.edad = 15;
		a2.edad = 25;
		
		a1.altura = 1.65;
		a2.altura = 1.76;
		
		a1.peso = 65.4;
		a2.peso = 78.7;
		
		a1.nif = "87954621V";
		a2.nif = "25436852P";
		
		System.out.println("--------------------");
		
		a1.visualizar();
		a1.edad();
		
		System.out.println("--------------------");
		
		a2.visualizar();
		a2.edad();

		System.out.println("--------------------");
		
		
		
	}
}
