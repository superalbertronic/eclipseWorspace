package euroformacjava;

import java.util.Random;
import java.util.Scanner;

public class EjerTres {
    public static void main(String[] args) {
        //variables
        int list = 0;
        int sum = 0;
        int x,i,z;

        //Scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Indica el tamaño del array: ");
        list = s.nextInt();

        //array
        int[] listaNum = new int[list];

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
        System.out.println("\nLas suma de los num es: " + sum);


    }
}
