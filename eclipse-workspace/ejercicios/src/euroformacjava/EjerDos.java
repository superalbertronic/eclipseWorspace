package euroformacjava;

import java.util.*;

public class EjerDos {
    public static void main(String[] args) {
        //variables
        int num=0;
        int list = 10;
        int x,i;

        //Scanner
        Scanner s = new Scanner(System.in);

        //array
        int[] listaNum = new int[list];

        System.out.println("Introduce numeros enteros-->");
        for (i = 0; i < listaNum.length; i++) {
            System.out.print("Numeros [" + i + "]= ");
            listaNum[i]=s.nextInt();
        }

        System.out.println("Los numeros leidos son: ");
        for (x = 0; x < listaNum.length; x++){
            System.out.print(listaNum[x] + " ");
        }

    }
}
