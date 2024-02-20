package examenFinal1T;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.File;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte menuSimulacro = 0;
		boolean salir = false;

		while (!salir) {
			System.out.println(
					"Seleccione una opción:" + "\n1 - Crear carpeta" + "\n2 - Crear fichero" + "\n3 - Borrar fichero"
							+ "\n4 - Borrar carpeta" + "\n5 - Ver información" + "\n6 - Ver información con GestorInformacion" +"\n7 - Salir");

			menuSimulacro = Byte.parseByte(sc.nextLine());

			
			switch (menuSimulacro) {
			case 1: // Crear carpeta
				String ruta1 = "c:\\";
				System.out.println("Escribe el nombre de la carpeta que deseas crear.");
				String carpeta = sc.nextLine ();
				File directorio = new File(ruta1 + carpeta);
				if (directorio.exists() == true) {
					System.out.println("La carpeta existe.");
				} else {
					directorio.mkdir();
					System.out.println("Carpeta creada.");

				}

				break;

			case 2: // Crear fichero
				String ruta2 = "c:\\prueba\\";
				System.out.println("Escribe el nombre del fichero que deseas crear.");
				String fichero = sc.nextLine ();

				try {
					BufferedWriter fw = new BufferedWriter(new FileWriter(ruta2 + fichero));
					System.out.println("Archivo " + fichero+ " ha sido creado correctamente");

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Error al crear el archivo " +fichero);
				}
				System.out.println("¿Deseas introducir información en el fichero? Sí/No");
				String respuesta = sc.nextLine();
				if (respuesta.equals("Sí")) {
					try (FileWriter Rellenarfichero = new FileWriter("c:\\prueba\\" ))
			        {
			            PrintWriter pw = new PrintWriter(fichero);

			            for (int i = 0; i < 10; i++)
			                pw.println("Linea " + i);

			        } catch (Exception e) {
			            e.printStackTrace();
			        } 
			    
				}else {
					System.out.println("Vale, sin problema.");
				}

				break;

			case 3: // Borrar fichero
				String ruta3 = "c:\\prueba\\";
				System.out.println("Escribe el nombre del fichero que deseas borrar.");
				String fichero3 = sc.nextLine ();
				/*
				 * Esta opción deberá permitir al usuario borrar carpetas o ficheros. Deberás solicitar al usuario que introduzca el nombre 
				 * de la carpeta o fichero que desea eliminar. Si se trata de una carpeta, asegúrate de que esté vacía antes de proceder al borrado.
				 */
				String rutaFichero = ruta3 + File.separator + fichero3;
				File ficheroQueQuieroBorrar = new File(rutaFichero);

				if (ficheroQueQuieroBorrar.exists()) {
					boolean borrado = ficheroQueQuieroBorrar.delete();
					if (borrado) {
						System.out.println("El fichero ha sido borrado con éxito.");
					} else {
						System.out.println("No se pudo borrar el fichero");
					}
				} else {
					System.out.println("El fichero no existe en la ubicación especificada");

				}

				break;

			case 4: // Borrar carpeta
				File carpeta2 = new File("c:\\Carpeta_Simulacro\\");
				if (carpeta2.exists() && carpeta2.isDirectory()) {
					System.out.println("La carpeta existe");
					try {
						FileUtils.deleteDirectory(carpeta2);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("La carpeta ha sido borrado.");
				} else {
					System.out.println("La carpeta no existe o no es una carpeta");
				}

				break;

			case 5: //Ver información
				try {
				File archivo = new File("c:/prueba/ciudades.txt");

				if (!archivo.exists()) {
					System.out.println("Archivo ciudades.txt no existe");
					return;
				}
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);

				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}

			} catch (IOException e) {
			}

				break;
				
			case 6: //Uso de la función GestorInformacion	
				
				
			case 7:
				salir = true;

				break;

			default:
				System.out.println("Por favor, escribe un número que se encuentre comprendido entre el 1 y el 6.");
			}
		}
	}
}