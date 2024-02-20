package excepciones2;

import java.util.Scanner;

public class Validar {
    public static boolean VALIDO = true;

   private Validar() { //metodo constructor
  
	    }

    public static void esValido(boolean valido) throws MiError { //metodo que llama a la clase definida pra gestionar el error
    	System.out.println(valido); //me da false o true
        if (!valido==true) {
        	
            throw new MiError();
        }
    }
    }
