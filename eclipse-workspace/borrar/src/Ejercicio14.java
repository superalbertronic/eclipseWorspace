import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*  Realiza un programa que pida 10 números por teclado y que los almacene en
        un array. A continuación se mostrará el contenido de ese array junto al índice
        (0 – 9) utilizando para ello una tabla. Seguidamente, el programa pasará los
        primos a las primeras posiciones, desplazando el resto de números (los que no
        son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
        array resultante.*/

        int[] a = new int[10];  // Definimos el arreglo entero de 10 elementos

        /* Lo siguiente que vamos a crear son 4 variables las cuales van a ser las posiciones que queremos que se roten en el array
         int que nos van a servir para reubicar los 10 índices del array */

        int primero;
        int segundo;
        int penultimo;
        int ultimo;
        Scanner sc = new Scanner(System.in); // Invocamos el método Scanner

        // Ahora tenemos que leer los 10 números desde la consola del terminar usando un bucle for

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = sc.nextInt(); // Ingresarán en el programa los valores introducidos en consola
        }
        primero = a[a.length - 10]; // Definimos la posición del primer elemento del array
        segundo = a[a.length - 9]; // Definimos la posición del segundo elemento del array
        penultimo = a[a.length - 2]; // Definimos la posición del penúltimo elemento del array
        ultimo = a[a.length - 1]; // Definimos la posición del último elemento del array

        /* A continuation, mostramos como hemos modificado el valor de los elementos del arrays gracias a las variables previamente
        donde les habíamos asignado la posición exacta gracias al método length. Y así, ya podemos decirle al array en que posición
        quiero que este ahora el valor de esos índices y asignarlos donde yo quiera.
         */

        a[8] = ultimo;
        a[1] = primero;
        a[0] = segundo;
        a[9] = penultimo;
        /* Creamos bucle for para imprimir en pantalla el arreglo modificado*/
        System.out.println("El arreglo modificado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
