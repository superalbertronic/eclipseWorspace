package euroformacjava;

import java.util.Scanner;
// http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-control-del-nif-nie

public class EjerSix {

    public static void main(String[] args) {
        //variables
        String dni;
        int resto = 0;
        int count = 0;

        String[] listaNum = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        //Scanner
        Scanner s = new Scanner(System.in);
        Aleatorio a = new Aleatorio();

        do{
            System.out.print("Intoduce tu dni sin letra: ");
            dni = s.nextLine();

            count = dni.length();

        }while(8 != count);



        resto = Integer.parseInt(dni) % 23;

        System.out.println("tu letra es: " + listaNum[resto]);

        System.out.println("resto: " + resto);

    }

}
