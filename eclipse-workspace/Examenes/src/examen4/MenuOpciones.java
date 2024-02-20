package examen4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class MenuOpciones {

	public static void main(String[] args) {
		// Scanner y booleano para salir o continuar en el menú
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;

		// bucle del menú principal
		while (continuar) {
			// elección del switch
			System.out.println("Elige una opción: \n1-Crear carpetas o ficheros" + "\n2-Ver información"
					+ "\n3-Borrar carpetas o ficheros" + "\n4-Salir");
			byte eleccion = Byte.parseByte(sc.nextLine());

			switch (eleccion) {
			case 1:
				// creo una carpeta complementaria porque sino no me deja crear ficheros en c
				new File("c:" + File.separator + "carpetaComplementariaParaElExamen").mkdir();

				System.out.println("Introduce el nombre de la carpeta o del fichero a crear");
				String nombre = sc.nextLine();
				
				//compruebo si es un fichero o una carpeta, uso este metodo porque isDirectory() no
				//me estaba funcionando correctamente
				if (!nombre.endsWith(".txt")) {
					//creo la carpeta
					File archivo = new File("c:" + File.separator + nombre);
					if(!archivo.exists()) {
						archivo.mkdir();
						System.out.println("Carpeta creada");
					}else {
						System.out.println("La carpeta ya existe");
					}
					
				} else {
					//creo el fichero con su información
					System.out.println("Desea introducir información?");
					String respuesta = sc.nextLine();
					if (respuesta.toLowerCase().equals("si")) {
						try {
							BufferedWriter bw = new BufferedWriter(new FileWriter("c:" + File.separator
									+ "carpetaComplementariaParaElExamen" + File.separator + nombre));
							System.out.println("Ingresa el contenido del fichero: ");
							String contenido = sc.nextLine();
							bw.write(contenido);
							bw.flush();
							bw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 2:
				System.out.println("Introduce el nombre del archivo");
				String nombreInfo = sc.nextLine();
				//compruebo si es un fichero o carpeta
				if (nombreInfo.endsWith("txt")) {
					File archivo = new File(
							"c:" + File.separator + "carpetaComplementariaParaElExamen" + File.separator + nombreInfo);
					//compruebo si el archivo existe
					if (archivo.exists()) {
						//si existe imprimo la información de este
						System.out.println("Nombre: " + archivo.getName());
						System.out.println("Tamaño: " + archivo.length());
						System.out.println("Contenido: ");
						try {
							FileReader fr = new FileReader(archivo);
							BufferedReader br = new BufferedReader(fr);
							String linea;
							while ((linea = br.readLine()) != null) {
								System.out.println(linea);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} else {
						System.out.println("El fichero no existe");
					}
				} else {
					//hago lo mismo con la carpeta
					File carp = new File("c:" + File.separator + nombreInfo);
					if (carp.exists()) {
						System.out.println("Nombre: " + carp.getName());
						System.out.println("Tamaño: " + carp.length());
					} else {
						System.out.println("La carpeta no existe");
					}
				}

				break;
			case 3:
				System.out.println("Introduce el nombre del archivo a borrar");
				String nombreBorrar = sc.nextLine();
				//compruebo si es un fichero o carpeta
				if (!nombreBorrar.endsWith(".txt")) {
					File carpetaBorrar = new File("c:" + File.separator + nombreBorrar);
					//borro la carpeta si existe
					if (carpetaBorrar.exists()) {
						System.out.println("La carpeta podría contener ficheros, desea borrarla igualmente?");
						if (sc.nextLine().toLowerCase().equals("si")) {
							try {
								FileUtils.deleteDirectory(carpetaBorrar);
								System.out.println("La carpeta fue borrada con éxito");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} else {
							System.out.println("La carpeta no fue borrada");
						}
					} else {
						System.out.println("La carpeta no existe");
					}
				} else {
					File ficheroBorrar = new File("c:" + File.separator + "carpetaComplementariaParaElExamen"
							+ File.separator + nombreBorrar);
					//si el fichero existe lo borro
					if (ficheroBorrar.exists()) {
						boolean borrado = ficheroBorrar.delete();
						if (borrado) {
							System.out.println("El fichero ha sido borrado");
						} else {
							System.out.println("No se pudo borrar el fichero");
						}
					} else {
						System.out.println("El fichero no existe");
					}
				}
				break;
			case 4:
				//salgo del bucle del menu
				System.out.println("Estás seguro de que quieres salir?");
				if (sc.nextLine().toLowerCase().equals("si")) {
					continuar = false;
				}
				break;
			}
		}

	}

}
