package arrays;

import java.util.Arrays;

public class CompararArrays {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {2, 1, 3};
    Arrays.sort(array2);
    boolean areEqual = Arrays.equals(array1, array2);
    System.out.println(areEqual);  // Imprime "true"
  }
}
