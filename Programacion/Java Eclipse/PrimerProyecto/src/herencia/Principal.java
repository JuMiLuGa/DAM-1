package herencia;

public class Principal {

	public static void main(String[] args) {
		Segunda s = new Segunda();
	}
	
}

class Segunda extends Primera{
	public Segunda(){
		System.out.println("Constructor de la subclase");
	}
}
class Primera{
	public Primera(){
		System.out.println("Constructor de la superclase");
	}
}