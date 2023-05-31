package prueba4_dam_dual;

import java.io.Serializable;

public class CargadorMovil implements Serializable{
	private static final long serialVersionUID = 353L;
	private String marca;
	private int año;
	private double potencia;
	private boolean permiteCargaRapida;
	
	
	public CargadorMovil(String marca, int año, double potencia, boolean permiteCargaRapida) {
		super();
		this.marca = marca;
		this.año = año;
		this.potencia = potencia;
		this.permiteCargaRapida = permiteCargaRapida;
	}


	@Override
	public String toString() {
		return marca + " (" + año + ") " + potencia + "W, "
				+ ((permiteCargaRapida) ? "sí" : "no") + " permite carga rápida.";
	}
	
	
}
