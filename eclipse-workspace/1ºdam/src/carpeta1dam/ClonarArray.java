package carpeta1dam;

import java.util.Arrays;

public class ClonarArray{
  public static void main(String[] args) {
    String[] array1 = {"Alberto", "Eva", "Laura"};
    String[] array2 = array1.clone();
    System.out.println(Arrays.toString(array2));  // Imprime "[Alberto, Eva, Laura]"
    //array multidimensional
    int[][] array3 = {{2, 5, 23, 15, 4}, {36, 1, 87, 0, 12}};
    int[][] array4 = array3.clone();
    array4[1][1] = 44;
    System.out.println(Arrays.deepToString(array3));  // Imprime "[[2, 5, 23, 15, 4], [36, 44, 87, 0, 12]]"
    System.out.println(Arrays.deepToString(array4));  // Imprime "[[2, 5, 23, 15, 4], [36, 44, 87, 0, 12]]"
 
    
  }
}
