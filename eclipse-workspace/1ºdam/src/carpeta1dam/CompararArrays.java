package carpeta1dam;

import java.util.Arrays;

public class CompararArrays {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    boolean areEqual = Arrays.equals(array1, array2);
    System.out.println(areEqual);  // Imprime "true"
  }
}
