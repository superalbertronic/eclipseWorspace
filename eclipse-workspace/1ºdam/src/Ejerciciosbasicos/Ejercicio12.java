package Ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados
        por espacios. El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las
        ocurrencias del primer valor por el segundo en la lista generada anteriormente. Los números que se han
        cambiado deben aparecer entrecomillas.
         */
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[50]; // Definimos un array con 20 elementos para ver más claro en la consola los números

        for (int i = 0; i < numero.length; i++) { /* Inicializamos un bucle que va a reiterar con el método length el
                                                    número de elementos que contiene el array */

            numero[i] = (int)(Math.random() * 20); /* Con el método random vamos a generar 100 números aleatorios en esas 100
                                                    iteraciones. Los números son comprendidos entre el 0 y el 20.
                                                    Hemos tenido que realizar un casting sobre el método para que de números enteros
                                                    sin valor decimal añadido */

            System.out.print(numero[i] + " "); /* Imprime en pantalla en un número generado automáticamente, vuelve a
                                                    inicializarse el bucle y vuelve a imprimir. Así hasta 100 veces*/
        }
        System.out.println(); // salto de linea
        System.out.print("Introduzca el número que quieres sustituir: "); /* Solicitamos datos al usuario en este caso
                                                                        pedimos que nos diga que número aparecido previamente
                                                                        en consola vamos a seleccionar y ese valor será
                                                                        asignado a la variable int numA */
        int numA = sc.nextInt();
        System.out.print("Ahora introduce el valor por el que quieres que sea sustituido: "); /* Solicitamos al usuario
                                                                           que introduzca el nuevo valor a sustituir
                                                                           que será asignado a la variable int numB */
        int numB = sc.nextInt();

        for (int i = 0; i < numero.length; i++) { /* Inicializamos un bucle desde 0 y vamos a reiterar usando el método
                                                     length terminando el bucle cuando reitere tantas veces como índices
                                                      tenga el array número que en este caso son 20 */
            if (numero[i] == numA) { // arranca el bucle y pregunta, si el elemento es igual a numA entonces
                numero[i] = numB; //  ese elemento ahora será el valor asignado a numB
                System.out.print(numero[i]); // imprime el nuevo valor
                System.out.print(" ");
            } else {    // si no es así
                System.out.print(numero[i] + " ");  /* Volverá a imprimir el valor ya asignado en el método random,
                   de esa manera solo cambiara los valores iguales a los que han sido elegidos por el usuario, imprime
                   los nuevos valores sustituyéndolos y dejara sin modificar los otros que también serán impresos. */
            }
        }
    }
}


