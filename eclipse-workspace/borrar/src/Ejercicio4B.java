public class Ejercicio4B {
    public static void main(String[] args) {
        /* Escribe un programa que lea 15 números por teclado y que los almacene en un
        array. Rota los elementos de ese array, es decir, el elemento de la posición 0
        debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
        la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
         del array.*/
        /* Modificamos este ejercicio 4 de manera que vamos a realizar un arreglo de 10 elementos donde
        vamos a mostrar de manera ordenada el primer valor del arreglo con el último, en la segunda iteration el 2 con el penúltimo
        en la tercera iteración el tercero con el antepenúltimo y así consecutivamente (un orden principio final)
         */
           int [] numeros = new int[10]; // Creamos un arreglo de 10 elementos

           for(int i = 0; i < numeros.length; i++) { // Lo inicializamos con el bucle partiendo desde 0 hasta el total (length)
               numeros[i] = i + 1; /* Como los elementos inician desde el valor 0, vamos a sumarle 1 para que inicie desde 1
                                     y así el último elemento que se guarda en el índice 9 es el valor 10 */
           }
           for(int i = 0;i < numeros.length/2; i++){ /* ahora creamos otro for para que itere con el anterior y podamos mostrar los valores en
                                               un orden determinado, hemos dividido el length entre 2 para ue se muestre en pantalla la mitad
                                                del recorrido de arreglo tanto el que incrementa y el que decrementa y así no se repitan los
                                                valores */


               System.out.println(numeros[i]); // aquí vamos a mostrar los elementos del 1 al 10
               System.out.println(numeros[numeros.length- 1 - i]); /* de esta manera con el método length que es total del arreglo -1 lo usamos
                                                              para mostrar la posición 9 que corresponde con el valor 10 y luego le restamos
                                                              i para ir decrementando el arreglo.*/
           }



    }
}
