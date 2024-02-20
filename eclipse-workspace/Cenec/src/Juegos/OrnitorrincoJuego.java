package Juegos;

import java.util.Scanner;

//OrnitorrincoJuego
public class OrnitorrincoJuego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hombresJugados = 0;
        int mujeresJugadas = 0;
        int ornitorrincosMatados = 0;

        do {
            System.out.println("Escribe 'h' si eres hombre, 'm' si eres mujer o 'n' si eres neutro");
            String respuesta = scan.nextLine().toLowerCase();

            char genero = 'n';

            switch (respuesta) {
                case "h":
                    genero = 'h';
                    hombresJugados++;
                    break;
                case "m":
                    genero = 'm';
                    mujeresJugadas++;
                    break;
                case "n":
                    genero = 'n';
                    break;
                default:
                    genero = 'n';
                    break;
            }

            System.out.print("Dime el número de alumnos de tu aula: ");
            byte nAlumnos = Byte.parseByte(scan.nextLine());

            System.out.println("Cenec, 24 de Octubre, " + nAlumnos
                    + " estudiantes están en el \"aula 2\"\n aguantando el sopor"
                    + " de la clase de programación. De repente,\n " + " cae un ornitorrinco con metralletas del tragaluz."
                    + " ¿Qué haces?\n\t1 - Le tiras tu monitor a la cabeza"
                    + "\n\t2 - Le dices \"Juan Carlos\", ¿Dónde te habías metido?" + "\n\t3 - Me escondo");

            byte opcion = Byte.parseByte(scan.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Le das una patada ninja al monitor y te lo devuelve.");
                    break;
                case 2:
                    System.out.println("Te pega un tiro y te dice: \"Me llamo cancamuso, so payas\""
                            + (genero == 'h' ? 'o' : genero == 'm' ? 'a' : 'e') + ": Muere. Has Muerto");
                    ornitorrincosMatados++;
                    break;
                case 3:
                    System.out.println("Se lía a metralletazos, a ti no te mata,"
                            + " porque te has escondido, pero se carga a " + (nAlumnos * 60 / 100) + " compañeros");
                    break;
                default:
                    System.out.println("Tenías que poner un número entre 1 y 3");
                    break;
            }

            System.out.println("¿Quieres jugar de nuevo? (s/n): ");
            String jugarDeNuevo = scan.nextLine().toLowerCase();
            if (!jugarDeNuevo.equals("s")) {
                break;
            }

        } while (true);

        System.out.println("Resumen del juego:");
        System.out.println("Hombres jugados: " + hombresJugados);
        System.out.println("Mujeres jugadas: " + mujeresJugadas);
        System.out.println("Ornitorrincos que te han matado: " + ornitorrincosMatados);
    }
}
