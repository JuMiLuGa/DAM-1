package ejercicio19;

public class Camion extends Vehiculo{

	private byte numeroDeEjes;
	
	public Camion(String color, byte numeroRuedas, byte numeroDeEjes, short cilindrada, short potencia) {
		super(color, numeroRuedas, cilindrada,potencia);
		this.numeroDeEjes = numeroDeEjes;
	}

	public byte obtenerNumeroDeEjes() {
		return numeroDeEjes;
	}

	public void setNumeroDeEjes(byte numeroDeEjes) {
		this.numeroDeEjes = numeroDeEjes;
	}

	public static void main(String[] args) {

		
	}

	public float impuesto() {
		return (this.getCilindrada()/30 + this.getPotencia()*30 + this.getNumRuedas()*20 + this.obtenerNumeroDeEjes()*50);
	}
}
