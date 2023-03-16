package prueba4_dam_dual;

public class EjercicioB {
//	Explica qué es lo que hace el siguiente método recursivo.
//  ¿Cuántos casos base tiene este método recursivo? 
//	Descríbelos con tus palabras.
	public static boolean metodoRecursivo(String s) {

	      if (s.length() <= 1)

	         return true;

	      else if (s.charAt(0) != s.charAt(s.length() - 1))

	         return false;

	      else

	         return metodoRecursivo(s.substring(1, s.length() - 1));

	    }
}

/**/
