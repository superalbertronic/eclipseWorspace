// Ejercicio 4
// Escribe un programa que lea 15 números por teclado y que los almacene en un
// array. Rota los elementos de ese array, es decir, el elemento de la posición 0
// debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
// la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
// del array.

import java.util.Scanner;

public class Array04
{
    public static void main(String[] args)
    {
        int i;
        int[] numeros = new int[15];
        int[] almacen = new int[15];


        Scanner s = new Scanner(System.in);
        

        for(i=0; i<numeros.length; i++)
        {
            System.out.println("Introduzca número: ");
            
            
            numeros[i] = s.nextInt();
            almacen[i]= numeros[i];
        }

// aqui se muestra los arrays normales en orden
        System.out.println("Aqui se mostrara Ordenado como hemos escrito");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
        
        
        System.out.println("Aqui se mostrara como pide el ejercicio");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        System.out.println("////////////////////////////////////////");
        
        
        for(i=0; i<numeros.length; i++)
        {

			if (i==0){
				
				numeros[i]=numeros[numeros.length-1];	// aqui le cogemos el 0 la ultima posicion
				System.out.println(numeros[i]);
				}
				
	
			
			else {
				
				numeros[i]=almacen[i-1];
				System.out.println(numeros[i]);
				
				
				
				}				
        }      

    }
}
