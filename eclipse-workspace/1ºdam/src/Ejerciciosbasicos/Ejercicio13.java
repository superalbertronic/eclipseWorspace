package Ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la palabra "par"
        o "impar" según proceda
         */
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[8]; // inicializamos un array int con 8 elementos

        System.out.println("Introduce 8 números enteros"); // Pedimos al usuario mediante Scanner que introduzca los 8 números
        for (int i = 0; i < numero.length; i++) { /* Este bucle va a reiterarse usando el método length del array con un número
                                                  de 8 elementos de manera que así podremos introducir los valores 8 del array,
                                                  el bucle cortará cuando se reitere 8 veces */

            numero[i] = sc.nextInt(); // la aplicación toma nota sobre el número que se ha introducido
        }
        for (int i = 0; i < numero.length; i++) { /* Creamos otro bucle for para preguntar si el número introducido es par o impar
                                                   empezando a preguntar desde el elemento del índice 0 hasta el índice 7 */
            if (numero[i] % 2 == 0) { // si el resto del resultado de dividir el número entre 2 es 0
                System.out.println(numero[i] + " par"); // entonces el número es par, imprime valor seguido de la palabra par
            } else {  // si no
                System.out.println(numero[i] + " impar");  // imprime el valor seguido de la palabra impar
            }
        }
    }
}
