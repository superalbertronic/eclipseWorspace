package euroformacjava;

import java.util.Scanner;

public class EjerFourteen {

    public void parOimpar(int num){
        if( num % 2 == 0 ){
            System.out.println("Es par, el doble es: " + 2* num);
        } else {
            System.out.println("Es impar, el triple es: " + 3* num);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aleatorio ale = new Aleatorio();
        EjerFourteen com = new EjerFourteen();

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
                com.parOimpar(numAle);
                break;

            case 2:
                System.out.print("Introducir un num: ");
                num = s.nextInt();
                com.parOimpar(num);
                break;
        }

    }

}
