import java.util.Scanner;
import matematicas.Varias;
import matematicas.Geometria;
/**
* Prueba varias funciones
*
* @author Luis José Sánchez
*/
public class PruebaFunciones {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Ingresa un número entero: ");
      int n = scanner.nextInt();
      System.out.println("Has ingresado el número " + n);
   // Prueba esPrimo()
      if (matematicas.Varias.esPrimo(n)) {
    	  System.out.println("El " + n + " es primo.");
    	  } else {
    	  System.out.println("El " + n + " no es primo.");
    	  }
   // Prueba digitos()
      System.out.print("Introduzca un número entero positivo: ");
      int n1 = scanner.nextInt();
      System.out.println(n1 + " tiene " + matematicas.Varias.digitos(n1) + " dígitos.");
   // Prueba volumenCilindro()
      double r, h;
      System.out.println("Cálculo del volumen de un cilindro");
      System.out.print("Introduzca el radio en metros: ");
      int n2 = scanner.nextInt();
      System.out.print("Introduzca la altura en metros: ");
      int n3 = scanner.nextInt();
      System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilindro(n3
      , n3) + " m3");  
}
}
