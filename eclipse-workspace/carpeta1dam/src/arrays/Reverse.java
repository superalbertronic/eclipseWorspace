package arrays;

import java.util.Arrays;
import java.util.Collections;
public class Reverse {
  public static void main(String[] args) {
   int[] names = {11,2,5};
   System.out.println(Arrays.toString(names)); 
    Arrays.sort(names);
    System.out.println(Arrays.toString(names)); 
    Collections.reverse(Arrays.asList(names));
    System.out.println(Arrays.toString(names));  // Imprime "[Laura, Eva, Alberto]"
   
  }
}
