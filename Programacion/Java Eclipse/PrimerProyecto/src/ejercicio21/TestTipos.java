package ejercicio21;

public class TestTipos {
	public static void main(String[] Args) {

		Profesor profesor1 = new Profesor("Juan", "Hernández García", 33);
		ProfesorInterino interino1 = new ProfesorInterino("Lucía", "Morales Pérez", 54);
		Profesor profesor73 = interino1;

		if (profesor73 instanceof ProfesorInterino) {
			System.out.println("profesor73 es un objeto de tipo ProfesorInterino");
		}

		if (profesor73 instanceof Profesor) {
			System.out.println("profesor73 es un objeto de tipo Profesor ¡es POLIMÓRFICO!");
		}

		if (interino1 instanceof Profesor) {
			System.out.println("interino1 es un objeto de tipo Profesor ¡es POLIMÓRFICO TAMBIÉN!");

		} else {
			System.out.println("interino1 no apunta a un objeto de tipo Profesor");

		}

		if (profesor1 instanceof ProfesorInterino) {
			System.out.println("profesor1 es un objeto de tipo ProfesorInterino");

		} else {
			System.out.println("profesor1 no es un objeto de tipo ProfesorInterino. Nunca fue un interino.");

		}
	}
}