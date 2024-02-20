
package com.prueba1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		int a = 5, b = 10, c = 2, d = 6;
		 
	      a += 5;  // Es lo mismo que a = a + 5;
	      b -= 2;  // b = b - 2
	      c *= 3;  // c = c * 3
	      d /= 2;  // d = d / 2
	 
	      System.out.println( "Ejemplo de Uso de Operadores de Asignación Aritmética en Java" );
	      System.out.println( "a = " + a );
	      System.out.println( "b = " + b );
	      System.out.println( "c = " + c );
	      System.out.println( "d = " + d );
	      double tp;
	      String clima;
	      Scanner entrada = new Scanner(System.in);

	       System.out.print("Ingrese la temperatura: ");
	       tp= entrada.nextDouble();
	       
	       if(tp<=10){
	    	   			System.out.println("La temperatura es FRIO");
	    	   				        }
	           else if(tp>10 && tp<=20){
	                   System.out.println("La temperatura es NUBLADO");
	                   }
	           else if(tp>20 && tp<=30){
	               System.out.println("La temperatura es CALUROSO");
	               }
	           else if(tp>30){
	                    System.out.println("La temperatura es TROPICAL");   
	           }
	       
	       
	      
	         } 

	}


