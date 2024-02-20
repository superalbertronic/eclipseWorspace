package examen1ºtrimAccespADatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class GestorInformacion {
    private Scanner scanner = new Scanner(System.in);

    public void verInformacion() {
        System.out.println("Menú Ver Información:");
        System.out.println("1. Ver Información de Carpeta");
        System.out.println("2. Ver Información de Fichero");
        System.out.println("3. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");

        switch (scanner.nextInt()) {
            case 1:
                verInformacionCarpeta();
                break;
            case 2:
                verInformacionFichero();
                break;
            case 3:
                System.out.println("Volviendo al Menú Principal");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void verInformacionCarpeta() {
        System.out.print("Ingrese el nombre de la carpeta: ");
        String nombreCarpeta = scanner.next();

        File carpeta = new File(nombreCarpeta);
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Información de la Carpeta:");
            System.out.println("Nombre: " + nombreCarpeta);
            System.out.println("Tamaño: " + calcularTamañoCarpeta(carpeta) + " bytes");
            System.out.println("Contenido: " + listarContenidoCarpeta(carpeta));
        } else {
            System.out.println("La carpeta no existe o no es válida.");
        }
    }

    private long calcularTamañoCarpeta(File carpeta) {
        return carpeta.listFiles() != null ? calcularTamañoArray(carpeta.listFiles()) : 0;
    }

    private long calcularTamañoArray(File[] archivos) {
        long tamañoTotal = 0;
        for (File archivo : archivos) {
            tamañoTotal += archivo.length();
        }
        return tamañoTotal;
    }

    private String listarContenidoCarpeta(File carpeta) {
        return carpeta.listFiles() != null ? arrayToString(carpeta.listFiles()) : "Vacío";
    }

    private String arrayToString(File[] archivos) {
        StringBuilder contenido = new StringBuilder();
        for (File archivo : archivos) {
            contenido.append(archivo.getName()).append(", ");
        }
        return contenido.length() > 0 ? contenido.substring(0, contenido.length() - 2) : "";
    }

    private void verInformacionFichero() {
        System.out.print("Ingrese el nombre del fichero: ");
        String nombreFichero = scanner.next();

        File fichero = new File(nombreFichero);
        if (fichero.exists() && fichero.isFile()) {
            System.out.println("Información del Fichero:");
            System.out.println("Nombre: " + nombreFichero);
            System.out.println("Tamaño: " + fichero.length() + " bytes");

            if (fichero.length() > 0) {
                System.out.println("Contenido:");
                System.out.println(leerContenidoFichero(fichero));
            } else {
                System.out.println("El fichero está vacío.");
            }
        } else {
            System.out.println("El fichero no existe o no es válido.");
        }
    }
    private String leerContenidoFichero(File fichero) {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de error de lectura
            e.printStackTrace();
        }

        return contenido.toString();
    }
}