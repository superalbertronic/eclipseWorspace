package euroformacjava;

import java.util.Scanner;

public class Usuario {

    Scanner s = new Scanner(System.in);

    String nombre;
    String apellido;
    int edad;

    public void datos(String nombre,String apellido,int edad){
        System.out.print("Ingrese el nombre: ");
        nombre = s.next();
        System.out.print("Ingrese el apellido: ");
        apellido = s.next();
        System.out.print("Ingrese su edad: ");
        edad = s.nextInt();
        System.out.print("Los datos del usuario son "+nombre+" "+apellido+" y su edad es "+edad);

        if(edad >= 18){
            System.out.print(" Mayor de edad");
        }else{
            System.out.print(" Eres menor de edad");
        }
    }

}
