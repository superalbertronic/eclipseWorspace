package gestionFicheros;
import java.io.*;

public class gestion {
    private String nombre;
    private String contenido;

    public void ingresarNombreTipo(BufferedReader reader) throws IOException {
        System.out.print("Introduce el nombre de una carpeta o fichero: ");
        nombre = reader.readLine();

        File file = new File(nombre);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("El nombre corresponde a una carpeta.");
            } else {
                System.out.println("El nombre corresponde a un fichero.");

                System.out.print("¿Deseas introducir información en él? (s/n): ");
                String opcion = reader.readLine();
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.println("Introduce el contenido:");
                    contenido = reader.readLine();
                }
            }
        } else {
            System.out.println("El nombre no corresponde a ningún fichero o carpeta existente.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        if (contenido != null && !contenido.isEmpty()) {
            System.out.println("Contenido: " + contenido);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            gestion gestor = new gestion();
            gestor.ingresarNombreTipo(reader);
            gestor.mostrarInformacion();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
