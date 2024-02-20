package calculadora.funciones;

public class FuncionesMath {	   
		   // métodos static, no necesitan instanciar una clase.
		    public  static int suma(int a, int b) {
		        return a + b;
		    }

		    public static int resta(int a, int b) {
		        return a - b;
		    }

		    public static int producto(int a, int b) {
		        return a * b;
		    }

		    public static int division(int a, int b) {
		        return a / b;
		    }
		    //sobrecarga de método, podemos crear un método en este caso, para instanciar esta clase
		    // con otro criterio
		    public int suma(int a) {
				return a+a;
		    	
		    	
		    }
		}

