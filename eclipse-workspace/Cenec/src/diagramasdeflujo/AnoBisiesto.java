package diagramasdeflujo;

import java.util.Scanner;

public class AnoBisiesto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el año desde la entrada del usuario
        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        // Verifica si el año es bisiesto
        if (esBisiesto(year)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        // Cierra el Scanner
        scanner.close();
    }

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int year) {
        // Condición para años bisiestos
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
