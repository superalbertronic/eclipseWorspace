package euroformacjava;

import java.util.Scanner;

public class EjerCuatro {
    public static void main(String[] args) {
        //variables
        int list = 0;
        int x,i,z;

        //Scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Indica el tamaño del array: ");
        list = s.nextInt();

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

        //dice el mayor
        for (z = 1; z < listaNum.length; z++) {
            if (listaNum[z] > search) {
                search = listaNum[z];
            }
        }
        System.out.println("\nEl mayor es: " + search);

        //dice el menor
        for (z = 1; z < listaNum.length; z++) {
            if (listaNum[z] < search) {
                search = listaNum[z];
            }
        }
        System.out.println("El menor es: " + search);
    }
}
