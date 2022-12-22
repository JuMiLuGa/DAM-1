package sobrecarga_de_metodos;

public class Ordenador {

	// Datos de la memoria
	private int tamañoMemoria;

	public int getTamañoMemoria() {
		return tamañoMemoria;
	}

	public void setTamañoMemoria(int tamañoMemoria) {
		this.tamañoMemoria = tamañoMemoria;
	}

	private String tipoMemoria;
	
	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
	
	private int velocidadMemoria;

	// Datos del disco duro
	private int tamañoDiscoDuro;
	private int numeroRevolucionesDisco;

	// Datos del procesador
	private String modeloProcesador;
	private float velocidadProcesador;

	public int getVelocidadMemoria() {
		return velocidadMemoria;
	}

	public void setVelocidadMemoria(int velocidadMemoria) {
		this.velocidadMemoria = velocidadMemoria;
	}

	public int getTamañoDiscoDuro() {
		return tamañoDiscoDuro;
	}

	public void setTamañoDiscoDuro(int tamañoDiscoDuro) {
		this.tamañoDiscoDuro = tamañoDiscoDuro;
	}

	public int getNumeroRevolucionesDisco() {
		return numeroRevolucionesDisco;
	}

	public void setNumeroRevolucionesDisco(int numeroRevolucionesDisco) {
		this.numeroRevolucionesDisco = numeroRevolucionesDisco;
	}

	public String getModeloProcesador() {
		return modeloProcesador;
	}

	public void setModeloProcesador(String modeloProcesador) {
		this.modeloProcesador = modeloProcesador;
	}

	public float getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void setVelocidadProcesador(float velocidadProcesador) {
		this.velocidadProcesador = velocidadProcesador;

	}
	
	public void mostrar() {
		
		System.out.println("MEMORIA");
		System.out.println();
		System.out.println("Tamaño memoria: " + tamañoMemoria);
		System.out.println("Velocidad memoria: " + velocidadMemoria);
		System.out.println("Tipo de memoria:" + tipoMemoria);
		
		System.out.println();
		
		System.out.println("DISCO DURO");
		System.out.println();
		System.out.println("Tamaño disco duro: " + tamañoDiscoDuro);
		System.out.println("Revoluciones disco duro: " + numeroRevolucionesDisco);
		
		System.out.println();
		
		System.out.println("PROCESADOR");
		System.out.println();
		System.out.println("Modelo procesador: " + modeloProcesador);
		System.out.println("Velocidad procesador: " + velocidadProcesador);
		
	}
	
	
	
public void main(String[] args) {
	
}
	
}
