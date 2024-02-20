package matematicas;

import java.util.Scanner;

/**
 * PruebaFunciones
 *
 * @author Alberto Ruiz
 */
public class PruebaFunciones {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Scanner s=new Scanner (System.in);
		
		
		// Prueba esPrimo()
		System.out.print("Introduzca un número entero positivo: ");
		int n = s.nextInt();
		if (matematicas.varias.Varias.esPrimo(n)) {
		System.out.println("El " + n + " es primo.");
		} else {
		System.out.println("El " + n + " no es primo.");
		}
		// Prueba digitos()	
		
		System.out.print("Introduzca un número entero positivo: ");
		n = s.nextInt();
		System.out.println(n + " tiene " + matematicas.varias.Varias.digitos(n) + " dígitos.");
		// Prueba volumenCilindro()
		
		double r, h;
		System.out.println("Cálculo del volumen de un cilindro");
		System.out.print("Introduzca el radio en metros: ");
		r = s.nextInt();
		System.out.print("Introduzca la altura en metros: ");
		h = s.nextInt();
		System.out.println("El volumen del cilindro es " + matematicas.geometria.Geometria.volumenCilindro(r, h) + " m3");
	}

}
