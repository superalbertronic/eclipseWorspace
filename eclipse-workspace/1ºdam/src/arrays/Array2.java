package arrays;

import java.util.Arrays;
public class Array2 {

	public static void main (String[] args) {
		int index=0;
		String[] datos = {"Eva", "Ana", "Alberto"};
		index = Arrays.asList(datos).indexOf("Ana"); //busca el indice de este nombre


		if (index!=0) {
			System.out.println("encontrado el indices es " );
		} else {
			System.out.println("no encontrado " );
		}
		
		System.out.println(Arrays.toString(datos)); // muestra por pantalla el array

		Arrays.sort(datos);
	    System.out.println(Arrays.toString(datos));  // Imprime "[Alberto, Eva, Laura]"
	    
	    System.out.println(Arrays.toString(datos));  // Imprime "[Laura, Eva, Alberto]"
	    
	    String[] names2 = Arrays.copyOf(datos, datos.length); //copia los datos en otro array
	    System.out.println(Arrays.toString(names2));  // Imprime "[Alberto, Eva, Laura]"
	  
  }

}


