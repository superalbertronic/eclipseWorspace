import java.util.Scanner;

public class Ejercicio4A {
    public static void main(String[] args) {
        /* /* Escribe un programa que lea 15 números por teclado y que los almacene en un
        array. Rota los elementos de ese array, es decir, el elemento de la posición 0
        debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
        la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
         del array.*/

        int[] a = new int [15];  // Definimos el arreglo entero de 15 elementos
        int ultimo; /* cuando cambiamos de posiciones, vamos cambiando los elementos de arriba hacia abajo, por ejemplo el valor en el
        índice 13 pasa a tomar el valor del índice 14, pero el valor del índice 14, no se puede pasar inmediatamente porque como vamos de arriba
        hacia abajo, si lo pasamos, perderíamos el valor definido en el índice 0 así que lo tenemos que guardar
         en una variable auxiliar o temporal, por eso creamos esta variable que solo dejamos definida*/

        Scanner sc = new Scanner(System.in); // Invocamos el método Scanner

        // Ahora tenemos que leer los 15 números desde la consola del terminar usando un bucle for

        for (int i = 0; i < a.length; i++){ // el bucle va a ir incrementando hasta contabilizar el total del arreglo 15 elementos
            System.out.print("Ingrese un número: "); // ahora vamos a imprimir pero hacia el lado, solamente print
            a[i] = sc.nextInt(); // así llenamos el arreglo con los 15 elementos
        }
        ultimo = a[a.length - 1];/* ahora aquí respaldamos el último valor del arreglo y para obtenerlo usamos el método length del arreglo
                                  a menos 1 porque como parte en 0 hay ue restarle 1 */

        // ahora empezamos a cambiar de posiciones de arriba hacia abajo con el siguiente bucle for
         for(int i = a.length - 2; i >= 0; i-- ) { /* ahora "i" debe de partir del penúltimo valor porque el último ya lo tenemos respaldado
                                             por eso al inicio del bucle le restamos 2, tenemos que llegar a 0 y vamos decrementando para
                                             llegar a 0*/
             a[i + 1] = a[i]; /* el valor actual se le asigna a la posición i + 1 para que vaya desplazando el elemento hacia abajo
              por eso tenemos que decrementar hacia abajo hasta llegar a 0 */
         }
         a[0] = ultimo; /* Aquí ya estamos le decimos al arreglo que el índice 0 va a ser el último elemento que definimos previamente
                         para que cuando ejecutemos el siguiente bucle for nos imprima el valor del arreglo modificado rotando un elemento hacia
                         abajo en consola*/
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
     }
}
