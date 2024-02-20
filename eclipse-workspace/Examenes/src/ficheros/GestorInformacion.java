package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class GestorInformacion {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String opcion;
		String ruta = "";
		String nombreArchivo = "";
		String contenido = "";

		do {
			System.out.println("Seleccione una opción:");
			System.out.println("A - Ver info carpeta");
			System.out.println("B - Ver info fichero");
			System.out.println("C - Salir");
			opcion = sc.nextLine();
			switch (opcion) {
			case "A":
				System.out.println("Decir nombre de la carpeta - 1, Volver al Menú Principal - 2");
				int opcion2 = Integer.parseInt(sc.nextLine());
				if(opcion2 == 1) {
				System.out.println("Dime la ruta de carpeta");
				ruta = sc.nextLine();
				ruta = "c:\\" + ruta + "\\";
				File direc = new File(ruta);

				if (direc.exists()) {
					System.out.println("Nombre del directorio  : " + direc.getName());
					System.out.println("Ruta                : " + direc.getPath());
					System.out.println("Ruta absoluta       : " + direc.getAbsolutePath());
					System.out.println("Lectura       : " + direc.canRead());
					System.out.println("Escritura   : " + direc.canWrite());
					System.out.println("Tama�o              : " + direc.length() + " Kb");
					System.out.println("Directorio    : " + direc.isDirectory());
					System.out.println("Fichero       : " + direc.isFile());
					System.out.println("Nombre del directorio padre: " + direc.getParent());
				}
				} else {
					break;
				}
				break;
			case "B":
				System.out.println("Decir nombre del fichero - 1, Volver al Menú Principal - 2");
				int opcion3 = Integer.parseInt(sc.nextLine());
				if(opcion3 == 1) {
				System.out.println("Dime la ruta de fichero");
				ruta = sc.nextLine();
				File f = new File(ruta);
				System.out.println(f.getName());

				if (f.exists()) {
					System.out.println("Nombre del fichero  : " + f.getName());
					System.out.println("Ruta                : " + f.getPath());
					System.out.println("Ruta absoluta       : " + f.getAbsolutePath());
					System.out.println("Lectura       : " + f.canRead());
					System.out.println("Escritura   : " + f.canWrite());
					System.out.println("Tama�o              : " + f.length() + " Kb"); // El tama�o es expresado en
																						// bytes
					System.out.println("Directorio    : " + f.isDirectory());
					System.out.println("Fichero       : " + f.isFile());
					System.out.println("Nombre del directorio padre: " + f.getParent());
					FileReader fr = new FileReader(ruta);
					BufferedReader br = new BufferedReader(fr);
					String linea;
					System.out.println("Contenido del fichero: ");
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
					br.close();
					fr.close();
				} else {
					break;
				}
				} else {
					System.out.println("No existe");
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
