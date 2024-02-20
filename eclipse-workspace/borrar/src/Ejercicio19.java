public class Ejercicio19 {
    public static void main(String[] args) {
        /*Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. */
  /* Modificamos el programa de tal manera que genere con el método random una serie de números del 1 al 1000 de los cuales
  solo mostrará 50 en pantalla y dirá cuál es el mayor de los mostrados en pantalla */


        int[] numeros = new int[50];  /* Creamos un array de 50 elementos */
        for (int i = 0; i < numeros.length; i++) { /* Inicializamos el array con un bucle for y terminará cuando recorra todos los índices
                                                     del array que son 50 inicializando desde el índice 0 al 49 */
            numeros[i] = (int) (Math.random() * 100); /* Ahora vamos a generar 50 números aleatorios comprendidos entre el 0 y 100 */
            System.out.print(" " + numeros[i]); // Vamos a mostrar en pantalla los números generados */
        }
        int max = 0;   /* Tenemos que crear una variable auxiliar para encontrar el número mayor */
        for (int i = 0; i < numeros.length; i++){
            max = (numeros[max] > numeros[i]) ? max: i; /* Inicia preguntando si el elemento que está en el índice 0 es mayor que el primer
                                               elemento o índice 0, que en este caso es 79, guardamos 79 en la variable max y ahora vuelve
                                               a preguntar si 79 es mayor que el siguiente elemento que generó el random que es
                                                el índice 1 o segundo elemento, si es así, la variable max cambiará de valor y ahora será ese
                                                su nuevo valor, si no es así quedará guardado el valor anterior sin modificación,
                                                hasta encontrar un elemento con un valor mayor con la consecuencia de que la variable
                                               se modificará tantas veces encuentre un elemento mayor que su predecesor guardado. */


        }
        System.out.println(); // salto de linea
        System.out.println("El número mayor de los aleatorios generados es el " + numeros[max]); // Imprime el número mayor guardado
    }
}