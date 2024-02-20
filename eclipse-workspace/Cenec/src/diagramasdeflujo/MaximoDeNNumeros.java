package diagramasdeflujo;

import java.util.Scanner;

public class MaximoDeNNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Leer N
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();

        // Paso 2: Leer M
        System.out.print("Ingrese el primer número (M): ");
        int M = scanner.nextInt();

        // Paso 3: Inicializar I
        int I = N - 1;

        // Bucle para leer los N-1 números restantes
        while (I > 0) {
            // Paso 4: Leer A
            System.out.print("Ingrese un número (A): ");
            int A = scanner.nextInt();

            // Paso 5: Comparar A con M y actualizar M si es necesario
            if (A > M) {
                M = A;
            }

            // Paso 6: Reducir I
            I--;
        }

        // Paso 16: Escribir el resultado
        System.out.println("El máximo de los números ingresados es: " + M);

        // Cerrar el Scanner
        scanner.close();
    }
}