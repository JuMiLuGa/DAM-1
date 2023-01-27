package ejercicio23;

public class EmpleadoDistribucion extends Asalariado {
	private String region;

	public EmpleadoDistribucion(String nombre, long nif, int diasVacaciones, double salarioBase, String region) {
		super(nombre, nif, diasVacaciones, salarioBase);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSalario() {
		return getSalarioBase() * 1.10;
	}
}
