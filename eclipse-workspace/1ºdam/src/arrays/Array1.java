package arrays;

import java.util.Arrays;
public class Array1 {

	public static void main (String[] args) {
		Object[] array = { 1, "dos", 3, "cuatro", 5, "seis" };
		

		for (Object elem : array) {
		    if (elem instanceof Integer) {
		        int num = (int) elem;
		        System.out.println("Entero: " + num);
		    } else if (elem instanceof String) {
		        String texto = (String) elem;
		        System.out.println("Cadena de texto: " + texto);
		    }
		}

  }

}


