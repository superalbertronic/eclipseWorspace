package Ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /* Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el
        primero que se introduce es el último en mostrarse y viceversa
         */
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10]; // inicializamos un array de 10 elementos

        System.out.println("Introduce 10 números enteros"); /* Pedimos al usuario por consola que introduzca los
        valores del array */

        for (int i = 0; i < 10; i++) { /* Creamos un bucle para que podamos añadir los 10 valores que corresponden desde
         el índice 0 al 9 del array */
            num[i] = sc.nextInt(); /* método scanner para petición de datos al usuario, cuando introduzcamos los 10
             elementos el bucle terminará y pasará al siguiente bucle que mostramos más abajo */
        }
        for (int i = 9; i >= 0; i--) { /* Ahora con los 10 valores introducidos anteriormente, primero leerá el valor
         que se encuentra en el índice 9 e irá decrementando en el bucle una unidad hasta llegar al índice igual a 0 y se
         finalizará. De esta manera mostrará de manera inversa los valores introducidos */

            System.out.println(num[i]); // Vamos a mostrar los 10 valores a la inversa
        }

    }
}
