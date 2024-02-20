package calculadora;
import calculadora.funciones.FuncionesMath2;

import java.util.Scanner;
public class Calculo2 {

	//ejemplo de calculadora sin creacion de objetos por ello usamos metodos static

	    public static void main(String[] args) {
	        Scanner s= new Scanner(System.in);
	        
	        //hemos creado un objeto para realizar otro ejemplo, basado en la clase FuncionesMath
	        FuncionesMath2 funciones= new FuncionesMath2();
	        
	        System.out.print("indica el primer número; ");     
	        int a=s.nextInt();
	        System.out.print("indica el segundor número; ");   
	        int b=s.nextInt();
	       
	       //invocamos los diferentes metodos
	       System.out.println("Suma: " + funciones.suma(a, b));
	       System.out.println("Suma: " + funciones.resta(a, b));
	       System.out.println("Suma: " + funciones.producto(a, b));
	       System.out.println("Suma: " + funciones.division(a, b));
	       
	       // en esta parte llamamos al objeto creado funciones
	       
	       funciones=null;
	      
	    }
	   
	}


