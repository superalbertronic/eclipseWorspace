package examen1ºtrimAccespADatos;

import java.io.File;
import java.util.Scanner;

class GestorBorrado {
    private Scanner scanner = new Scanner(System.in);

    public void realizarBorrado() {
        System.out.println("Menú Borrar:");
        System.out.println("1. Borrar Carpeta");
        System.out.println("2. Borrar Fichero");
        System.out.println("3. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");

        switch (scanner.nextInt()) {
            case 1:
                borrarCarpeta();
                break;
            case 2:
                borrarFichero();
                break;
            case 3:
                System.out.println("Volviendo al Menú Principal");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void borrarCarpeta() {
        System.out.print("Ingrese el nombre de la carpeta a borrar: ");
        String nombreCarpeta = scanner.next();

        File carpeta = new File(nombreCarpeta);
        if (carpeta.exists() && carpeta.isDirectory() && carpeta.listFiles() != null && carpeta.listFiles().length == 0) {
            carpeta.delete();
            System.out.println("La carpeta " + nombreCarpeta + " ha sido borrada exitosamente.");
        } else {
            System.out.println("La carpeta no existe, no es válida o no está vacía.");
        }
    }

    private void borrarFichero() {
        System.out.print("Ingrese el nombre del fichero a borrar: ");
        String nombreFichero = scanner.next();

        File fichero = new File(nombreFichero);
        if (fichero.exists() && fichero.isFile()) {
            fichero.delete();
            System.out.println("El fichero " + nombreFichero + " ha sido borrado exitosamente.");
        } else {
            System.out.println("El fichero no existe o no es válido.");
        }
    }
}