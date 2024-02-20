package menuCompletoGestor;
import java.io.*;

public class menu {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Menú:");
                System.out.println("1. Crear carpeta o fichero");
                System.out.println("2. Borrar carpeta o fichero");
                System.out.println("3. Ver información del fichero o carpeta");
                System.out.println("4. Salir del programa");
                System.out.print("Selecciona una opción: ");
                String opcion = reader.readLine();

                switch (opcion) {
                    case "1":
                        crearCarpetaOFichero(reader);
                        break;
                    case "2":
                        borrarCarpetaOFichero(reader);
                        break;
                    case "3":
                        verInformacion(reader);
                        break;
                    case "4":
                        System.out.println("¿Estás seguro de querer salir? (s/n)");
                        String confirmacion = reader.readLine();
                        if (confirmacion.equalsIgnoreCase("s")) {
                            System.out.println("Saliendo del programa...");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Opción inválida, por favor selecciona una opción válida.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void crearCarpetaOFichero(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre de la carpeta o fichero que deseas crear: ");
        String nombre = reader.readLine();

        File file = new File(nombre);
        if (file.createNewFile()) {
            System.out.println("Fichero creado: " + file.getName());
            System.out.print("¿Deseas introducir información en el fichero? (s/n): ");
            String opcion = reader.readLine();
            if (opcion.equalsIgnoreCase("s")) {
                try (FileWriter writer = new FileWriter(file)) {
                    System.out.println("Introduce la información:");
                    String informacion = reader.readLine();
                    writer.write(informacion);
                    System.out.println("Información escrita en el fichero.");
                }
            }
        } else {
            if (file.isDirectory()) {
                System.out.println("La carpeta o fichero ya existe.");
            }
        }
    }

    private static void borrarCarpetaOFichero(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre de la carpeta o fichero que deseas eliminar: ");
        String nombre = reader.readLine();
        File file = new File(nombre);
        if (file.exists()) {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    file.delete();
                    System.out.println("Carpeta borrada: " + file.getName());
                } else {
                    System.out.println("La carpeta no está vacía, no se puede borrar.");
                }
            } else {
                file.delete();
                System.out.println("Fichero borrado: " + file.getName());
            }
        } else {
            System.out.println("La carpeta o fichero no existe.");
        }
    }

    private static void verInformacion(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre del fichero o carpeta del cual deseas ver la información: ");
        String nombre = reader.readLine();
        File file = new File(nombre);
        if (file.exists()) {
            System.out.println("Nombre: " + file.getName());
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            System.out.println("Es directorio: " + file.isDirectory());
            System.out.println("Tamaño: " + file.length() + " bytes");
            System.out.println("Última modificación: " + file.lastModified());
        } else {
            System.out.println("El fichero o carpeta no existe.");
        }
    }
}
