package Ejercicio4;

import java.io.File;
import java.util.Scanner;

public class GestorBorrado {

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú Gestor de Borrado");
        System.out.println("1. Borrar Carpeta");
        System.out.println("2. Borrar Fichero");
        System.out.println("3. Volver al Menú Principal");
    }

    private static int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                borrarCarpeta();
                break;
            case 2:
                borrarFichero();
                break;
            case 3:
            	return;
            default:
                System.out.println("Opción no válida, intenta de nuevo");
        }
    }

    private static void borrarCarpeta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la carpeta a borrar: ");
        String nombreCarpeta = scanner.nextLine();

        File carpeta = new File(nombreCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            if (carpeta.list().length == 0) {
                if (carpeta.delete()) {
                    System.out.println("Carpeta borrada exitosamente");
                } else {
                    System.out.println("Error al intentar borrar la carpeta");
                }
            } else {
                System.out.println("La carpeta no está vacía. No se puede borrar");
            }
        } else {
            System.out.println("La carpeta no existe o no es válida.");
        }
    }

    private static void borrarFichero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del fichero a borrar: ");
        String nombreFichero = scanner.nextLine();

        File fichero = new File(nombreFichero);

        if (fichero.exists() && fichero.isFile()) {
            if (fichero.delete()) {
                System.out.println("Fichero borrado exitosamente.");
            } else {
                System.out.println("Error al intentar borrar el fichero.");
            }
        } else {
            System.out.println("El fichero no existe o no es válido.");
        }
    }
}
