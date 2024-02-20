package Ejerciciosbasicos;
public class Ejercicio11 {
    public static void main(String[] args) {
        /* Define un array de 10 caracteres con nombre símbolo y asigna valores a los elementos según la tabla
        que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los
        valores de los elementos que no ha sido inicializados? */

        char[] simbolo = new char[10]; /* Inicializamos un array char para añadir los caracteres en los diferentes índices */
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < simbolo.length; i++){ /* vamos a inicializar el bucle for para mostrar luego en consola
           todos los elementos del array, el bucle lo cortara a través del método length que contabiliza en este caso
           el número de índices del arrays y cortara cuando i sea igual al número de índices de dicho array */
            System.out.println(simbolo[i]); /* mostrará en pantalla los valores donde los elementos no inicializados
            mostrarán null (sin valor) en consola */
        }




    }
}