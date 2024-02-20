package gestorBorrado;

import java.io.*;

public class GestorBorrado {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Menú de Borrado:");
                System.out.println("1. Borrar Carpeta");
                System.out.println("2. Borrar Fichero");
                System.out.println("3. Volver al Menú Principal");
                System.out.print("Elige una opción: ");
                String opcion = reader.readLine();

                switch (opcion) {
                    case "1":
                        borrarCarpeta(reader);
                        break;
                    case "2":
                        borrarFichero(reader);
                        break;
                    case "3":
                        System.out.println("Volviendo al Menú Principal...");
                        return;
                    default:
                        System.out.println("Opción inválida. Por favor, elige una opción válida.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void borrarCarpeta(BufferedReader reader) throws IOException {
        System.out.print("Ingresa el nombre de la carpeta a borrar: ");
        String nombreCarpeta = reader.readLine();

        File carpeta = new File(nombreCarpeta);
        if (carpeta.exists() && carpeta.isDirectory()) {
            if (carpeta.list().length == 0) {
                if (carpeta.delete()) {
                    System.out.println("Carpeta borrada exitosamente.");
                } else {
                    System.out.println("No se pudo borrar la carpeta.");
                }
            } else {
                System.out.println("La carpeta no está vacía. No se puede borrar.");
            }
        } else {
            System.out.println("La carpeta no existe o no es una carpeta válida.");
        }
    }

    private static void borrarFichero(BufferedReader reader) throws IOException {
        System.out.print("Ingresa el nombre del fichero a borrar: ");
        String nombreFichero = reader.readLine();

        File fichero = new File(nombreFichero);
        if (fichero.exists() && fichero.isFile()) {
            if (fichero.delete()) {
                System.out.println("Fichero borrado exitosamente.");
            } else {
                System.out.println("No se pudo borrar el fichero.");
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}

