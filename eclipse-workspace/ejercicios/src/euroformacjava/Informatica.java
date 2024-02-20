package euroformacjava;

import java.awt.*;
import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Informatica {

    public String nombre;
    public String marca;
    public double precio;
    public int recargo;
    public double opera;

    Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    public Informatica(){
        nombre = "";
        marca = "";
        precio = 0.00;
        recargo = 1000;
    }

    public void hardware(String nombre, String marca, double precio) {
        System.out.print("Introduce el nombre del componente: ");
        nombre = s.next();

        System.out.print("Introduce el marca del componente: ");
        marca = s.next();

        System.out.print("Introduce el precio en €: ");
        precio = s.nextDouble();


        System.out.print(
                "Compraste " + nombre +
                " de la marca " + marca +
                " con un precio fina de ");
        if(precio > recargo){
            opera = precio - (precio * 0.16);
            System.out.print(df.format(opera)+ "€");
        }else{
            System.out.print(precio + "€");
        }



    }
}
