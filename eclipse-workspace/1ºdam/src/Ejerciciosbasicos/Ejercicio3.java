package Ejerciciosbasicos;


public class Ejercicio3 {
    public static void main(String[] args) {

        /* Define tres array de 20 números enteros cada una, con los nombres número, cuadrado y cubo. Carga el array número
        con valores aleatorios entre 0 y 100. En el arrays cuadrado se deben almacenar los cuadrados de los valores que hay
        en el array número. En el array cubo se deben almacenar los cubos que hay en el array número. A continuación, muestra
        el contenido de los tres arrays dispuestos en tres columnas */

         int[] numero = new int[20]; /* Definimos los 3 arrays donde pueda contener 20 elementos usamos int para que sean
              números enteros y no decimales aunque después tengamos que hacer un casting en el método random */
         int[] cuadrado = new int[20];
         int[] cubo = new int[20];

         for (int i = 0; i < numero.length; i++) { /* Inicializamos un bucle que arranca en el índice 0 del array, usamos
            el método length para que cuente el número de elementos o índices del array (número) y corte el bucle cuando i sea
            menor que dichos elementos */

            numero[i] = (int) (Math.random() * 100); /* Generamos 20 números de manera aleatoria usando el método Math.random.
            Tenemos que forzar su conversión a int haciendo un casting anteponiendo (int) antes del random. El método random
             va proseguido de una multiplicación * 100 para que los números generados se encuentre entre el 0 y el 100 */

            cuadrado[i] = numero[i] * numero[i]; // damos valor al cuadrado multiplicando 2 veces el valor generado aleatoriamente
            cubo[i] = numero[i] * numero[i] * numero[i]; // y aquí damos valor al cubo multiplicando numero 3 veces por si mismo
            System.out.println(numero[i] + "    "  + cuadrado[i] + "    " + cubo[i]); /* Mostramos en consola las 3 columnas
            correspondientes al número entero generado aleatoriamente seguida de la columna del cuadrado y la tercera columna
            pertenece al cubo de la primera columna */

        }
    }
}
