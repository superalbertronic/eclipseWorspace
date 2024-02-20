package arrayejerciciosobligatorios;

import java.util.Arrays;

//insertar numeros en un array se realiza una copia del array

public class Array4{
  public static void main(String[] args) {
    int[] array1 = {12, 15, 20};
    int[] array2 = new int[array1.length + 1];
    for (int i = 0; i < array1.length; i++) {
      if (i == 0) {
        array2[i] = 5;
      }
      array2[i + 1] = array1[i];
    }
    System.out.println(Arrays.toString(array2)); 
    
    // Imprime "el array"
  }
}
