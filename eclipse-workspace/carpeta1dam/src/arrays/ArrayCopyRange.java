package arrays;

import java.util.Arrays;

public class ArrayCopyRange {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = Arrays.copyOfRange(array1, 1, 3);
    System.out.println(Arrays.toString(array2));  // Imprime "[2, 3]"
  }
}
