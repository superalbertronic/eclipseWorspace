package Ejerciciosbasicos;
public class Ejercicio6 {
    public static void main(String[] args) {
        /*Define un array de número entero de 3 filas por 6 columnas con nombre num y asigna valores
        según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma como se
        muestra en la figura */

        int[][] numero = new int[3][6]; /* Definimos un array bidimensional donde el primer valor "3", representa al
        número de filas y el segundo valor "6", representa al número de columnas, debemos tener en cuenta que al
        haber 6 elementos hay 5 índices donde el índice 0, cuenta como columna 0 al igual pasa con las filas. */

        numero[0][0] = 0; // damos valor a la fila 0 columna 0
        numero[0][1] = 30; // damos valor a la fila 0 columna 1
        numero[0][2] = 2; // damos valor a la fila 0 columna 2
        numero[0][5] = 5; // damos valor a la fila 0 columna 5
        numero[1][0] = 75; // damos valor a la fila 1 columna 0
        numero[1][4] = 0; // damos valor a la fila 1 columna 4
        numero[2][2] = -2; // damos valor a la fila 2 columna 2
        numero[2][3] = 9; // damos valor a la fila 2 columna 3
        numero[2][5] = 11; // damos valor a la fija 2 columna 5

       /* Ahora vamos a definir las 2 variables que vamos a usar en los dos bucles for llamadas fila y columna
        donde vamos a representar la gráfica del enunciado del ejercicio con los valores
         del array definidos anteriormente */


        int fila, columna;
        System.out.print("          "); /* con este print, hacemos que las columnas inicien más despejadas del margen
                                         izquierdo de la consola y no se solape con la palabra "Fila" */

        for (columna = 0; columna < 6; columna++) { /* Iniciamos un bucle for para que nos imprima en pantalla las
                                                    6 columnas teniendo en cuenta que la primera columna se llama
                                                    "Columna 0" el bucle deberá inicializar en 0 y cortar en 5*/

            System.out.print("   Columna " + columna); /* Imprimimos la palabra "columna" seguido del valor numérico de
            la variable columna que va a ir incrementando su valor en 1 para mostrar columna más su número */

        }
        for (fila = 0; fila < 3; fila++) { /* Ahora inicializamos otro bucle para representar la palabra fila seguida
                                            de su número, iniciamos por la fila 0 y acabamos por la 2, hay que tener en cuenta
                                            que este bucle se inicializa haciendo que se imprima la palabra Fila 0
                                            y una vez impresa la lina, empieza con otro bucle con 6 iteraciones y al finalizar ese
                                            bucle, volvemos a este. Cuando este termine, termina la aplicación. */
            System.out.println(" "); /* hacemos un println para que cada vez que imprima Fila pase a otro renglón y
                                        salga de manera ordenada la gráfica */
            System.out.print("Fila " + fila); /* Imprime la palabra "fila" más el valor numérico definido en la variable fila
                                              del bucle que irá incrementando en 1 del 0 al 2*/

            for (columna = 0; columna < 6; columna++) { /* Creamos un tercer bucle anidado con el anterior de manera que cuando
                                                         el bucle anterior inicialice, haga su primera iteración y antes de seguir
                                                         tiene que pasar por este bucle el cual tendrá que finalizar sus
                                                         iteraciones para que vuelva al anterior bucle y este se vuelva a iniciar
                                                         nuevamente hasta que el bucle anterior haya terminado por completo */

                System.out.printf("%11d ", numero[fila][columna]); /* Tenemos que usar un printf para dar formato a la impresión
                                                                  en consola y cuadren los valores del array en la gráfica.
                                                                  Dependiendo del número que pongamos en %d haremos que los valores
                                                                  estén más o menos separados.
                                                                  Con este print vamos a ir imprimiendo los valores del array
                                                                  que se han definido por filas, una vez que imprima los 6 elementos
                                                                  vuelve al bucle llamado fila para que haga un salto de línea,
                                                                  imprima la palabra Fila nuevamente con su siguiente número
                                                                  y vuelva a este último bucle para imprimir los otros 6 elementos
                                                                  de la siguiente fila del array*/

            }
        }
    }
}






