package Ejerciciosbasicos;
public class Ejercicio1 {
    public static void main(String[] args) {
        /* Define un arrays de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra
        a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los
        elementos que no han sido inicializados?
         */

        int[] num = new int[12]; // hemos definido un array de 12 elementos
        num[0] = 39; // definimos valor al elemento 1 que pertenece a la posición o índice 0
        num[1] = -2; // definimos valor al elemento 2 que pertenece a la posición o índice 1
        num[4] = 0; // definimos valor al elemento 5 que pertenece a la posición o índice 4
        num[6] = 14; // definimos valor al elemento 7 que pertenece a la posición o índice 5
        num[8] = 5; // definimos valor al elemento 9 que pertenece a la posición o índice 8
        num[9] = 120; // definimos valor al elemento 10 que pertenece a la posición o índice 9

         for (int i = 0; i < 12; i++) { /*  Inicializamos i = 0 que pertenece al índice 0 del array y finalizamos en el índice 11
             porque el array comienza por el índice 0 y termina en el índice 11 */

             System.out.println(num[i]); /* Vamos a mostrar 12 valores en consola.
              Lo que sucede con los elementos que no se han inicializado es que se les asigna el
             valor 0 de forma predeterminada */
         }
    }
}
