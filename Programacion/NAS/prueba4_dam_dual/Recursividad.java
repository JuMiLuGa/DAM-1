package prueba4_dam_dual;

public class Recursividad {
	
	public static boolean metodoRecursivo(String s) {
	      if (s.length() <= 1)
	         return true;
	      else if (s.charAt(0) != s.charAt(s.length() - 1))
	         return false;
	      else
	         return metodoRecursivo(s.substring(1, s.length() - 1));
	    }

	public static void main(String[] args) {
		

	}

}
