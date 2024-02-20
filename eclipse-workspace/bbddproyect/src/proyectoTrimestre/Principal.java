package proyectoTrimestre;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<CasinoMarbella> casino = new ArrayList<>(); /* creamos arrayList donde vamos a añadir más adelante la apuesta
                                                              del cliente y mostraremos su info recorriéndolo con un bucle foreach */
    static Scanner sc = new Scanner(System.in);
    static int apuesta1;  // variable que usaremos con la Scanner para introducir datos

    public static void main(String[] args) {
        CasinoMarbella casinoMarbella = new CasinoMarbella(1) {
            @Override
            public int numerosObtenidos() {
                return 0;
            }
        };
        // aquí estamos invocando todos los métodos estáticos que hemos creado en la clase Principal pero fuera de main y será mostrados en consola
        System.out.println(casinoMarbella.toString());
        jugar();
        mostrarResultados();


    }
  /* método jugar donde realizamos un bucle do while implementado con un switch case donde vamos a preguntar al cliente
  que sea hacer y en el switch case vamos a añadir que ejecute otros métodos dependiendo la opción que elija el cliente
   */
    public static void jugar() {

        int opcion;

            do {
                System.out.println("Estimado cliente, ¿desea jugar a la ruleta?");
                System.out.println("1. Si");
                System.out.println("2. No");
                System.out.println("Elija una opción");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    tirarBola();
                    break;
                case 2:
                    noJugar();
                    break;
            }



    }

    public static void tirarBola() {
        /* en este método estamos pidiendo en consola al cliente que introduzca el valor de su apuesta. El método será
        implementado en el switch case
         */


        System.out.println("Hagan sus apuestas por favor, introduzca un valor del 1 al 36 ");
        System.out.println("Elija el número al que quiere apostar ");
        apuesta1 = sc.nextInt();


        /* creamos el objeto cliente donde vamos a añadirle el valor de la variable apuesta1, una vez que el cliente introduzca
        el número que piensa que puede ser el ganador será guardado para luego añadirlo a nuestro arrayList casino
         */
        Cliente cliente = new Cliente(apuesta1);

        casino.add(cliente);  // añadimos el valor al arrayList



    }

    // otro método con mensaje para usarlo en el switch case
    public static void noJugar() {
        System.out.println("Esperamos volver a verle pronto");
    }

    public static void mostrarResultados() {


        /* ahora hemos creado un bucle for each donde para recorrer la información del arrayList y vamos a hacer también
        que interactue con el método numerosObtenidos donde existe un método random y comparará el valor de la apuesta del
        cliente con el valor obtenido en el método random. En el caso de que el valor sea igual, el cliente se llevará el premio
         */
        for (CasinoMarbella casinoMarbella1 : casino) {

            System.out.println("La bola ha caído en el número: " + casinoMarbella1.numerosObtenidos());
            if (apuesta1 != casinoMarbella1.numerosObtenidos()) {
                System.out.println("Lo siento el número seleccionado no ha sido el número ganador");
            } else {
                System.out.println("Enhorabuena!!!!! le ha tocado nuestro Jackpot");



            }
        }

    }
}
