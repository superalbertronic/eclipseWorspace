package gestorInformacion;
import java.io.*;

public class gestorInformacion {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Menú de Información:");
                System.out.println("1. Ver Información de Carpeta");
                System.out.println("2. Ver Información de Fichero");
                System.out.println("3. Volver al Menú Principal");
                System.out.print("Elige una opción: ");
                String opcion = reader.readLine();

                switch (opcion) {
                    case "1":
                        verInfoCarpeta(reader);
                        break;
                    case "2":
                        verInfoFichero(reader);
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

    private static void verInfoCarpeta(BufferedReader reader) throws IOException {
        System.out.print("Ingresa el nombre de la carpeta para ver su información: ");
        String nombreCarpeta = reader.readLine();

        File carpeta = new File(nombreCarpeta);
        if (carpeta.exists() && carpeta.isDirectory()) {
            System.out.println("Nombre de la Carpeta: " + carpeta.getName());
            System.out.println("Tamaño de la Carpeta: " + carpeta.length() + " bytes");

            String[] archivos = carpeta.list();
            if (archivos != null && archivos.length > 0) {
                System.out.println("Archivos que obtiene la Carpeta:");
                for (String archivo : archivos) {
                    System.out.println("- " + archivo);
                }
            } else {
                System.out.println("La carpeta está vacía.");
            }
        } else {
            System.out.println("La carpeta no existe o no es una carpeta válida.");
        }
    }

    private static void verInfoFichero(BufferedReader reader) throws IOException {
        System.out.print("Ingresa el nombre del fichero para ver su información: ");
        String nombreFichero = reader.readLine();

        File fichero = new File(nombreFichero);
        if (fichero.exists() && fichero.isFile()) {
            System.out.println("Nombre del Fichero: " + fichero.getName());
            System.out.println("Tamaño del Fichero: " + fichero.length() + " bytes");

            if (fichero.length() > 0) {
                System.out.println("Contenido del Fichero:");
                try (BufferedReader fileReader = new BufferedReader(new FileReader(fichero))) {
                    String linea;
                    while ((linea = fileReader.readLine()) != null) {
                        System.out.println(linea);
                    }
                }
            } else {
                System.out.println("El fichero está vacío.");
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}
