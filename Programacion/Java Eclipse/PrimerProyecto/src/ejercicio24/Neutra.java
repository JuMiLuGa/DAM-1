package ejercicio24;

public class Neutra implements ImpresionNormal, ImpresionAvanzada {

	@Override

	public void imprimir() {
		System.out.println("Las olas del mar");
	}

	@Override

	public void imprimirBonito() {
		System.out.println("~~~~~ Las olas del mar ~~~~~");
	}
}
