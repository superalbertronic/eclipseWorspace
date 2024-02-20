package calculadora;
import calculadora.funciones.FuncionesMath;

import java.util.Scanner;


public class Calculo implements Suma {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("indica el primer número; ");     
    int a=s.nextInt();
    System.out.print("indica el segundor número; ");   
    int b=s.nextInt();
    int suma = FuncionesMath.suma(a, b);
    int producto = FuncionesMath.producto(a, b);
    int diferencia = FuncionesMath.resta(a, b);
    int cociente = FuncionesMath.division(a, b);

    System.out.println("Suma: " + suma);
    System.out.println("Producto: " + producto);
    System.out.println("Diferencia: " + diferencia);
    System.out.println("Cociente: " + cociente);
    s.close();
  }
}
