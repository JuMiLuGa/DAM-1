package ejercicio25;

public class ArrayReales implements Estadisticas {

	private double[] valores;

	public ArrayReales(int numElementos) {
		this.valores = new double[numElementos];
	}

	public void rellenar() {
		for (int i = 0; i < valores.length; i++) {
			valores[i] = Math.random() * 100;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (double valor : valores) {
			sb.append(valor);
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public double minimo() {
		double min = 0;
		for (int i = 0; i < valores.length; i++) {
			if (min > valores[i]) {
				min = valores[i];
			}
		}
		return min;
	}

	@Override
	public double maximo() {
		double max = 0;
		for (int i = 0; i < valores.length; i++) {
			if (max < valores[i]) {
				max = valores[i];
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		double suma = 0;
		for (int i=0; i<valores.length; i++) {
			if(suma> valores[i]) {
				suma = valores[i];
			}
	}
		return suma;
	}

}
