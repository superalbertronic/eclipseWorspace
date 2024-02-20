package arrayejerciciosobligatorios;
//comparar un array entero con un string, es necesario crear otro array y con un bucle y parseint realizar
//una conversion.
import java.util.Arrays;

public class Array3 {
  public static void main(String[] args) {
	  int[] array1 = {1, 2, 3};
	  String[] array2 = {"1", "2", "3"};
	  int[] array2Int = new int[array2.length];

	  for (int i = 0; i < array2.length; i++) {
	      array2Int[i] = Integer.parseInt(array2[i]);
	  }

	  if (Arrays.equals(array1, array2Int)) {
	      System.out.println("Los arrays son iguales");
	  } else {
	      System.out.println("Los arrays son diferentes");
	  }
  }
}
