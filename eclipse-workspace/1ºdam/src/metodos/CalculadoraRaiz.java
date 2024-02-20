package metodos;

import java.lang.Math;

// al definir objeto no se pone void

public class CalculadoraRaiz {

	  public static void main(String[] args) {

      CalculadoraRaiz calculator= new CalculadoraRaiz();
       int a =10, b=5;
       System.out.println("Suma: " + calculator.Suma(a,b));
       System.out.println("Resta: " + calculator.Resta(a,b));
       System.out.println("Producto: " + calculator.Producto(a,b));
       System.out.println("Division: " + calculator.Division(a,b));
       System.out.println("Raiz a: " + calculator.Ra(a));
       System.out.println("Raiz: " + calculator.Rb(b));
       System.out.println("Potencia:"+ calculator.Potencia(a,b));
   }
public int Suma(int a, int b) {
 return a + b;
}
 public int Resta(int a, int b) {

    return a - b;

    }

    public int Producto(int a, int b) {

    return a * b;

    }

    public int Division(int a, int b) {

    return a / b;

    }

   

    public double Ra(int a) {
    	
       return (int) Math.sqrt(a);

    }

    public double Rb(int b) {

       return (int) Math.sqrt(b);

    }

    public double Potencia(int a, int b) {

        return (int) Math.pow(a,b);

   

   

    }

}