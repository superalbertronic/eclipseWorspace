//Ejercicio 2
//Escribe un programa que lea 10 números por teclado y que luego los muestre
//en orden inverso, es decir, el primero que se introduce es el último en mostrarse
//y viceversa.


import java.util.Scanner;

public class Array02
{
    public static void main(String[] args)
    {
        int i;
        
        
        int[] numeros = new int[5];
        
        

        Scanner s = new Scanner(System.in);
        

        for(i=0; i<numeros.length; i++)
        {
            System.out.println("Introduzca  número para el array --> : " + i);
            
            
            numeros[i] = s.nextInt();
        }

		System.out.println(numeros.length);

        for(i=numeros.length-1; i>=0; i--) // aqui hay que quitar uno porque si el array si sus dimensiones son 5 empezaria por 4 -->
        {
            System.out.println(numeros[i]);
        }
    }
}

