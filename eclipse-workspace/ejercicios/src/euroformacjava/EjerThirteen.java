package euroformacjava;

import java.awt.*;
import java.util.Scanner;

public class EjerThirteen {

    public void Zuprimo(int num){

        int x = 1;
        int i = 0;
        int z = 0;

        do{
            if(x%2==0) {
                System.out.print(x + ",");
                x++;
                i++;
            }else {
                x++;
            }
        }while( i != num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aleatorio ale = new Aleatorio();
        EjerThirteen elprimito = new EjerThirteen();

        int num = 0;
        int op = 0;
        int numAle = 0;

        System.out.println("############ Menu ############");
        System.out.println("1. Numero Aleatorio");
        System.out.println("2. Manual");
        System.out.print("OP: ");
        op = s.nextInt();

        switch (op){
            case 1:
                numAle = ale.numAleario();
                System.out.print("El numero es: " + numAle + "\n");
                elprimito.Zuprimo(numAle);
                break;

            case 2:
                System.out.print("Introducir un num: ");
                num = s.nextInt();
                elprimito.Zuprimo(num);
                break;
        }






    }

}
