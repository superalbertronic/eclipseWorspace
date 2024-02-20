package arrayejerciciosobligatorios;


import java.util.Arrays;

public class Array2{
  public static void main(String[] args) {
	  String[] array1 = {"12", "13", "14"};
	  int[] array2 = new int[array1.length];
	  for (int i=0; i<array2.length;i++) {
		  array2[i]=Integer.parseInt(array1[i]);
		  
	  }
	    
	  
	  System.out.println("Array 1 "+ Arrays.toString(array1));  // Imprime 
	  System.out.println("Array 2 "+Arrays.toString(array2));  // Imprime 
    
    
  }
}
