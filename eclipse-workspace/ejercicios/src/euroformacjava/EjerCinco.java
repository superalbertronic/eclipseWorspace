package euroformacjava;

import java.util.Scanner;

public class EjerCinco{
    public static void main(String[] args) {
        //variables
        int list = 100;
        int sum = 0;
        int media = 0;
        int x,i,z;

        //array
        int[] listaNum = new int[list];
        int search = listaNum[0];

        //introduce los num aleatorio
        for (i = 0; i < listaNum.length; i++) {
            Aleatorio a = new Aleatorio();
            listaNum[i] = a.aleatorio;
        }

        //Lee los num
        System.out.println("\nLos numeros leidos son: ");
        for (x = 0; x < listaNum.length; x++){
            System.out.println("Numeros [" + x + "]= " + listaNum[x] + " ");
        }

        //suma los num
        for(z = 0; z < listaNum.length; z++){
            sum += listaNum[z];
        }
        System.out.print("\nLas suma de los num es: " + sum + " y la media es: ");

        //media
        sum = sum / listaNum.length;
        System.out.println(sum);

    }
}
