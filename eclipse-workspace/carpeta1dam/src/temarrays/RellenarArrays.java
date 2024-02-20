package carpeta1dam;

import java.util.Arrays;

public class RellenarArrays{
  public static void main(String[] args) {
    String[] array1 = new String[5];
    for (int i = 0; i < array1.length; i++) {
      Arrays.fill(array1, "Alberto");
    }
    System.out.println(Arrays.toString(array1));  // Imprime "[Alberto, Alberto, Alberto, Alberto, Alberto]"
  }
}
