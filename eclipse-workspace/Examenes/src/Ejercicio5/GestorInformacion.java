package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class GestorInformacion {

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Ver Información de Carpeta");
            System.out.println("2. Ver Información de Fichero");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verInformacionCarpeta();
                    break;
                case 2:
                    verInformacionFichero();
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void verInformacionCarpeta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la carpeta: ");
        String nombreCarpeta = scanner.next();

        File carpeta = new File(nombreCarpeta);

        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Información de la Carpeta:");
            System.out.println("Nombre: " + carpeta.getName());
            System.out.println("Tamaño: " + carpeta.length() + " bytes");

            System.out.println("Archivos contenidos:");

            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    System.out.println("- " + archivo.getName());
                }
            } else {
                System.out.println("La carpeta está vacía");
            }
        } else {
            System.out.println("La carpeta no existe o no es válida");
        }
    }

    private static void verInformacionFichero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del fichero: ");
        String nombreFichero = scanner.next();

        File fichero = new File(nombreFichero);

        if (fichero.exists() && fichero.isFile()) {
            System.out.println("Información del Fichero:");
            System.out.println("Nombre: " + fichero.getName());
            System.out.println("Tamaño: " + fichero.length() + " bytes");

            try {
                String contenido = new String(Files.readAllBytes(fichero.toPath()));
                System.out.println("Contenido del fichero:\n" + contenido);
            } catch (IOException e) {
                System.out.println("No se pudo leer el contenido del fichero");
            }
        } else {
            System.out.println("El fichero no existe o no es válido");
        }
    }
}

