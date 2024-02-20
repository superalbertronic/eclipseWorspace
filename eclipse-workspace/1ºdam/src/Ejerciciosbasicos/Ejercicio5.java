package Ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /* Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que
        muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del diagrama se pueden
        dibujar a base de asteriscos o cualquier otro carácter.
         */
        Scanner sc = new Scanner(System.in);
        String[] mes = new String[12]; // creamos un array String mes con 12 elementos, en este caso los meses del año
        int[] grados = new int[12]; /* creamos un array int grados con 12 elementos donde vamos
                                         a definir sus valores con el scanner */
        mes[0] = "Enero"; // definimos enero como el elemento 1 del array mes en la posición o índice 0
        mes[1] = "Febrero"; // definimos febrero como el elemento 2 del array mes en la posición o índice 1
        mes[2] = "Marzo"; // definimos marzo como el elemento 3 del array mes en la posición o índice 2
        mes[3] = "Abril"; // definimos abril como el elemento 4 del array mes en la posición o índice 3
        mes[4] = "Mayo"; // definimos mayo como el elemento 5 del array mes en la posición o índice 4
        mes[5] = "Junio"; // definimos junio como el elemento 6 del array mes en la posición o índice 5
        mes[6] = "Julio"; // definimos julio como el elemento 7 del array mes en la posición o índice 6
        mes[7] = "Agosto"; // definimos agosto como el elemento 8 del array mes en la posición o índice 7
        mes[8] = "Septiembre"; // definimos septiembre como el elemento 9 del array mes en la posición o índice 8
        mes[9] = "Octubre"; // definimos octubre como el elemento 10 del array mes en la posición o índice 9
        mes[10] = "Noviembre"; // definimos noviembre como el elemento 11 del array mes en la posición o índice 10
        mes[11] = "Diciembre"; // definimos diciembre como el elemento 12 del array mes en la posición o índice 11

        for (int i = 0; i < mes.length; i++) { /* creamos bucle for donde vamos a inicializar el array mes desde su
        índice 0 con valor enero y con el método length vamos a cortarlo cuando i sea igual que su número de índices
        que en este caso son 11 */
            System.out.println("Introduce la temperatura en grados de " + mes[i] + " "); /* Aquí el bucle inicializado
            nos va a pedir introducir los grados de los 12 meses, al introducir los 12, el bucle cortará */
            grados[i] = sc.nextInt(); // método scanner para introducir los grados para cada mes
        }
        for (int i = 0; i < mes.length; i++) { /* creamos bucle for para poder imprimir en consola la lista de los valores
            del array mes de forma ordenada, usando el método length para cortar el bucle */
            System.out.print(mes[i] + "   ");
            for (int j = 0; j < grados[i]; j++) { /* Anidamos otro bucle for para presentar el número de asteriscos
                presentados en consola coincidiendo con los grados introducidos anteriormente. El bucle cortará
                 cuando j sea menor que el número de grados introducidos */
                System.out.print("*"); /* va a imprimir un número de asteriscos correspondientes
                                         al número de grados que hemos puesto cuando nos preguntó la temperatura media */
            }
            System.out.println(" " + grados[i] + "ºC"); /* imprime el valor numérico introducido cuando nos preguntaba
                                                          la temperatura media de cada mes */
        }

    }
}


