package ejercicio22;

public abstract class Legislador extends Persona{
	private String provincia;
	private String partido;
	private int numDespacho;

	
	public Legislador(String nombre, String apellidos, int edad, boolean estadoCivil, String provincia, String partido, int numDespacho) {
		super(nombre, apellidos, edad, estadoCivil);
		this.provincia = provincia;
		this.partido = partido;
		this.numDespacho = numDespacho;
		
	}
	
	public abstract void mostrarCamaraEnQueTrabaja();

	@Override
	public String toString() {
		
			return super.toString() + "\nRepresenta a la provincia de " + this.provincia + " para el " + this.partido +
		"\nSu numero de despacho es el " + this.numDespacho + "\nSu numero de asiento en la camara";
		
		
		
		
	}
	
}
