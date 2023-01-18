package documentos;

import documentos.gestion_economica.Recibo;

public class PruebaRecibo {

	public static void main(String[] args) {
        Recibo nuevoRecibo = new Recibo("Impartición curso Java", 19, 12, 2022);
        nuevoRecibo.imprimirInfo();
    }
}
