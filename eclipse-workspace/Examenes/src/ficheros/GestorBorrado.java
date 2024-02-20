package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class GestorBorrado {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String opcion;
		String ruta = "";
		String nombreArchivo = "";
		String contenido = "";

		do {
			System.out.println("Seleccione una opción:");
			System.out.println("A - Borrar carpeta");
			System.out.println("B - Borrar fichero");
			System.out.println("C - Salir");
			opcion = sc.nextLine();
			switch (opcion) {
			case "A":
				System.out.println("Dime la nombre de la carpeta");
				ruta = sc.nextLine();
				ruta = "c:\\" + ruta + "\\";
				File carpeta = new File(ruta);
				if (carpeta.exists() && carpeta.isDirectory()) {
					FileUtils.deleteDirectory(carpeta);
					System.out.println("Listo, esta borrada");
				} else {
					System.out.println("Fichero no existe");
				}
				break;
			case "B":
				System.out.println("Dime la ruta");
				ruta = sc.nextLine();
				System.out.println("Dime el nombre del fichero");
				String nombreFichero = sc.nextLine();
				String rutaFichero = ruta + File.separator + nombreFichero;

				File fichero = new File(rutaFichero);

				if (fichero.exists()) {
					boolean borrado = fichero.delete();
					if (borrado) {
						System.out.println("El fichero ha sido borrado con �xito.");
					} else {
						System.out.println("No se pudo borrar el fichero.");
					}
				} else {
					System.out.println("El fichero no existe en la ubicaci�n especificada.");
				}
				break;
			case "C":
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Opción inválida.(Ten cuidado, hay que escibir leta mayuscula A, B, C!)");
				break;
			}

		} while (!opcion.equals("C"));
	}
}
