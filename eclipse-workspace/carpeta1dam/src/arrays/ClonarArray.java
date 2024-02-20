package arrays;

import java.util.Arrays;

public class ClonarArray{
  public static void main(String[] args) {
	  // son independientes
    String[] array1 = {"Alberto", "Eva", "Laura"};
    String[] array2 = array1.clone();
    array1[1]="Cristina";
    System.out.println(Arrays.toString(array1)); 
    System.out.println(Arrays.toString(array2));  // Imprime "[Alberto, Eva, Laura]"
    
    //array multidimensional si cambia un numero cambia otro
    int[][] array3 = {{2, 5, 23, 15, 4}, {36, 1, 87, 0, 12}};
    int[][] array4 = array3.clone();
    array3[0][0] = 44;
    array4[0][1]=33;
    System.out.println(Arrays.deepToString(array3));  // Imprime "[[44, 33, 23, 15, 4], [36, 44, 87, 0, 12]]"
    System.out.println(Arrays.deepToString(array4));  // Imprime "[[44, 33, 23, 15, 4], [36, 44, 87, 0, 12]]"
 
    
  }
}
