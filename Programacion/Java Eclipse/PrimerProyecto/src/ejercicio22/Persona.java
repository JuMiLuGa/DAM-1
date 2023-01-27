package ejercicio22;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean estadoCivil;
	
	public boolean getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public Persona(String nombre, String apellidos, int edad, boolean estadoCivil) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
	}
	
	
	@Override
	public String toString() {
		if (this.getEstadoCivil()) {
			return "La persona " + this.nombre + " " + this.apellidos + " tinene " + this.edad + " años y está casada";
		}else {
			return "La persona " + this.nombre + " " + this.apellidos + " tinene " + this.edad + " años y no está casada";

		}
		
	}
}
