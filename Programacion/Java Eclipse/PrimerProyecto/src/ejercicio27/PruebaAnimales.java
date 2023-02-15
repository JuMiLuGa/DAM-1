package ejercicio27;

public class PruebaAnimales {
	
	public static void main(String[] args) {
		Perro laika = new Perro();
		Loro pepe = new Loro();
		Ballena mobyDick = new Ballena();
		
		laika.caminar();
		laika.nadar();
		pepe.caminar();
		mobyDick.nadar();
	}
}
