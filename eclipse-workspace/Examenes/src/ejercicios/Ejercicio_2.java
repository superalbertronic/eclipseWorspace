package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;

public class Ejercicio_2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String opcion;
			String ruta = "C:\\";

			do {
				System.out.println("Seleccione una opción:");
				System.out.println("A - Crear carpeta");
				System.out.println("B - Crear fichero");
				System.out.println("C - Borrar fichero");
				System.out.println("D - Borrar carpeta");
				System.out.println("E - Leer fichero");
				System.out.println("F - Salir");

				opcion = sc.nextLine().toUpperCase();

				switch (opcion) {
				case "A":
					System.out.println("Introduzca el nombre de la carpeta:");
					String nCarpeta = sc.nextLine();
					File carpeta = new File(ruta + nCarpeta);

					if (!carpeta.exists()) {
						carpeta.mkdirs(); // crea la carpeta si no existe
						System.out.println("La carpeta " + nCarpeta + " se ha creado correctamente.");
					} else {
						System.out.println("La carpeta " + nCarpeta + " ya existe.");
					}
					break;

				case "B":
					System.out.println("Introduzca el nombre de la carpeta donde se encuentra el fichero:");
					String nCarpetaFichero = sc.nextLine();
					File carpetaFichero = new File(ruta + nCarpetaFichero);

					if (carpetaFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero:");
						String nombreFichero = sc.nextLine();

						try (BufferedWriter bw = new BufferedWriter(
								new FileWriter(ruta + nCarpetaFichero + "\\" + nombreFichero + ".txt"))) {
							System.out.println("¿Quiéres introducir información en el fichero? Escriba si o no");
							String informacionFichero=sc.nextLine();
							if(informacionFichero.toLowerCase().equals("si")) { //Comprobamos si quiere añadir información al fichero
								System.out.println("Introduzca la información deseada:");
								String informacionAñadida = sc.nextLine();
								bw.write(informacionAñadida);
								bw.newLine();
							}else if(informacionFichero.toLowerCase().equals("no")){
								System.out.println("No se ha añadido información.");
							}else {
								System.out.println("Debes escribir si o no");
							}
							System.out.println("Fichero creado correctamente.");
						} catch (IOException e) {
							System.out.println("No se ha podido escribir en el fichero");
						}
					} else {
						System.out.println("La carpeta " + nCarpetaFichero + " no existe.");
					}
					break;

				case "C":
					System.out.println("Introduzca el nombre de la carpeta donde se encuentra el fichero:");
					String nombreCarpetaBorrarFichero = sc.nextLine();
					File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);

					if (carpetaBorrarFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero a borrar:");
						String nombreFicheroBorrar = sc.nextLine();
						File ficheroBorrar = new File(
								ruta + nombreCarpetaBorrarFichero + "\\" + nombreFicheroBorrar + ".txt");

						if (ficheroBorrar.exists()) {
							ficheroBorrar.delete();
							System.out
									.println("El fichero " + nombreFicheroBorrar + ".txt se ha borrado correctamente.");
						} else {
							System.out.println("El fichero " + nombreFicheroBorrar + ".txt no existe.");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrarFichero + " no existe.");
					}
					break;

				case "D":
					System.out.println("Introduzca el nombre de la carpeta a borrar:");
					String nombreCarpetaBorrar = sc.nextLine();
					File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

					if (carpetaBorrar.exists()) {
						FileUtils.deleteDirectory(carpetaBorrar);
						System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente.");
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe.");
					}
					break;

				case "E":
					System.out.println("Introduzca el nombre de la carpeta donde se encuentra el fichero:");
					String nombreCarpetaLeer = sc.nextLine();
					File carpetaLeer = new File(ruta + nombreCarpetaLeer);

					if (carpetaLeer.exists()) {
						System.out.println("Introduzca el nombre del fichero a leer:");
						String nombreFicheroLeer = sc.nextLine();
						File ficheroLeer = new File(ruta + nombreCarpetaLeer + "\\" + nombreFicheroLeer + ".txt");

						if (ficheroLeer.exists()) {
							try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
								String linea;
								while ((linea = br.readLine()) != null) {
									System.out.println(linea);
								}
							} catch (IOException e) {
								System.out.println("No se puede leer el fichero.");
							}
						} else {
							System.out.println("El fichero " + nombreFicheroLeer + ".txt no existe en la carpeta.");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaLeer + " no existe.");
					}
					break;

				case "F":
					System.out.println("Hasta la próxima!");
					break;

				default:
					System.out.println("Debe elegir una opción del menu.");
					break;
				}

			} while (!opcion.equals("F"));

			sc.close();

		} catch (IOException ioe) {
			System.out.println("Error en la operación.");
		}
	}
}