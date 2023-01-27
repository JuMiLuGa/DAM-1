package ejercicio22;

public final class Diputado extends Legislador {

	private int asientoCamara;

	public Diputado(String nombre, String apellidos, int edad, boolean estadoCivil, String provincia, String partido,
			int numDespacho, int asientoCamara) {
		super(nombre, apellidos, edad, estadoCivil, provincia, partido, numDespacho);
		this.asientoCamara = asientoCamara;
	}

	@Override
	public String toString(){
		return super.toString() + " baja " + "es el " + this.asientoCamara;
	}
	
	@Override
	public void mostrarCamaraEnQueTrabaja() {
		System.out.println("Congreso");
	}
}
