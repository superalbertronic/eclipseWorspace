package euroformacjava;

import java.util.Scanner;

public class EjerTen {

    public void Adcensor(int piso){
        for(int x=0; x <= piso; x++){
            System.out.println("Sube al piso " + x);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EjerTen subir = new EjerTen();
        int piso = 0;

        System.out.print("introduce el numero de piso: ");
        piso = s.nextInt();

        subir.Adcensor(piso);


    }
}
