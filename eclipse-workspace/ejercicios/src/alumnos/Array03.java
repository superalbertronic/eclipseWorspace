// Ejercicio 3
// Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
// y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
// cuadrado se deben almacenar los cuadrados de los valores que hay en el array
// numero. En el array cubo se deben almacenar los cubos de los valores que hay en
// numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
// columnas.

import java.lang.Math;

import java.util.Scanner;

public class Array03{
	
	
    public static void main(String[] args){
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		//lo puedo hacer abajo, pero prefiero hacerlo separado, esto es el numero random
        Double random = Math.random();

	
		
        for(int i=0; i<numero.length; i++)
        {
			System.out.print("El numero entero es: ");
			
            numero[i]=(int)Math.round(Math.random()*100); // Redondea el resultado para que no salga float, hay que multiplicarlo entre 100 porque sale entre 0 y 1, si lo multiplica mas alto, mas alto saldra el random

            System.out.println(numero[i]);
            
            
            
            System.out.print("El cuadrado de ese numero es:");
            System.out.println(numero[i]*numero[i]);

            
            
            System.out.print("El cubo de ese numero es:");
            System.out.println(numero[i]*numero[i]*numero[i]+"\n");

            

        }


    }
}
