package euroformacjava;

import java.util.Scanner;

public class EjerFifteen {

    public void digito(int num){

            if(num >= 0 && num <= 9){
                System.out.println("El numero "+ num + " tiene 1 digitos");
            }else if (num >= 10 && num <= 99){
                System.out.println("El numero "+ num + " tiene 2 digitos");
            }else if (num >= 100 && num <= 999){
                System.out.println("El numero "+ num + " tiene 3 digitos");
            }
        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aleatorio ale = new Aleatorio();
        EjerFifteen com = new EjerFifteen();

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
                com.digito(numAle);
                break;

            case 2:
                System.out.print("Introducir un num: ");
                num = s.nextInt();
                com.digito(num);
                break;

            default:
                System.out.print("Error numero introducido");
                break;
        }

    }

}
