package ejercicio22;

public class Senador extends Legislador {
	

	private int asientoCamara;
	
	public Senador(String nombre, String apellidos, int edad, boolean estadoCivil, String provincia, String partido, int numDespacho, int asientoCamara) {
		super(nombre, apellidos, edad, estadoCivil, provincia, partido, numDespacho);
	this.asientoCamara = asientoCamara;
	}
	
	@Override
	public String toString(){
		return super.toString() + " alta " + "es el " + this.asientoCamara;
	}
	
	@Override
	public void mostrarCamaraEnQueTrabaja() {
		System.out.println("Senado");
	}

}
