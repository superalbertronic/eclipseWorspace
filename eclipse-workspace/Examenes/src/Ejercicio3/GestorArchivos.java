package Ejercicio3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivos  {
    private String nombreCarpeta;
    private String nombreFichero;
    private String contenidoFichero;

    public void ingresarNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de una carpeta o fichero:");
        String nombre = scanner.nextLine();

        File archivo = new File(nombre);
        if (archivo.isDirectory()) {
            gestionarCarpeta(nombre);
        } else if (archivo.isFile()) {
            gestionarFichero(nombre);
        } else {
            System.out.println("El nombre introducido no corresponde a una carpeta ni a un fichero");
        }
    }

    private void gestionarCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        System.out.println("Carpeta almacenada: " + nombreCarpeta);
    }

    private void gestionarFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea introducir información en el fichero? (si/no):");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el contenido del fichero:");
            contenidoFichero = scanner.nextLine();
            almacenarInformacionFichero();
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("Fichero almacenado");
        } else {
            System.out.println("Respuesta no válida");
        }
    }

    private void almacenarInformacionFichero() {
        try (FileWriter writer = new FileWriter(nombreFichero)) {
            writer.write(contenidoFichero);
            System.out.println("Fichero almacenado: " + nombreFichero);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public void mostrarInformacion() {
        if (nombreCarpeta != null) {
            System.out.println("Nombre de la carpeta: " + nombreCarpeta);
        }
        if (nombreFichero != null) {
            System.out.println("Nombre del fichero: " + nombreFichero);
            if (contenidoFichero != null) {
                System.out.println("Contenido del fichero: " + contenidoFichero);
            }
        }
    }

    public static void main(String[] args) {
    	GestorArchivos  gestor = new GestorArchivos ();
        gestor.ingresarNombre();
        gestor.mostrarInformacion();
    }
}

