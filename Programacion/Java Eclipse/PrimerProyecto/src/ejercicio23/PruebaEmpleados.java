package ejercicio23;

public class PruebaEmpleados {

	public static void main(String[] args ) {
		EmpleadoProduccion ep = new EmpleadoProduccion("Juan", 78965415, 30, 1300, "tarde");
		
		System.out.println(ep.getNombre() + " con NIF " + ep.getNif() + " es un empleado de produccion");
		System.out.println("Tiene " + ep.getDiasVacaciones() + " dias de vacaciones y un salario de " + ep.getSalario() + " €");
		System.out.println("Trabaja en el turno de " + ep.getTurno());
		
		
EmpleadoDistribucion ed = new EmpleadoDistribucion("Juan", 78965415, 30, 1300, "tarde");
		
		System.out.println(ep.getNombre() + " con NIF " + ep.getNif() + " es un empleado de produccion");
		System.out.println("Tiene " + ep.getDiasVacaciones() + " dias de vacaciones y un salario de " + ep.getSalario() + " €");
		System.out.println("Trabaja en el turno de " + ep.getTurno());
	}
}
