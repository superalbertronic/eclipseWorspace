package euroformacjava;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int aleatorio = 0 ;


    public Aleatorio(){
        aleatorio = r.nextInt((10 - 1) + 1) + 1;;
    }

    public void multiplicar(int numMulti){

        for(int a=1;a<=12;a++){
            int resul=a*numMulti;
            System.out.println(" º "+ a + " x " +numMulti+ " = " +resul);
        }
    }
    public int numAleario(){
        return aleatorio;
    }


}
