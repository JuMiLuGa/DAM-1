package ejercicio23;

public class EmpleadoProduccion extends Asalariado {
	private String turno;

	public EmpleadoProduccion(String nombre, long nif, int diasVacaciones, double salarioBase, String turno) {
		super(nombre, nif, diasVacaciones, salarioBase);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalario() {
		return getSalarioBase() * 1.15;
	}
}
