package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) {
		String ruta = ".\\";
        String nombreCarpeta;
        String nombreArchivo = null;
		
		Scanner sc = new Scanner(System.in);
		int cont = -1;

		while (cont != 0) {
			System.out.println("Opciones:");
			System.out.println("	0:Cerrar");
			System.out.println("	1:Crear carpeta");
			System.out.println("	2:Crear archivo");
			System.out.println("	3:Borrar archivo");
			System.out.println("	4:Borrar carpeta");
			System.out.println("	5:Leer fichero");
			System.out.println("	6:Leer carpeta");
			System.out.println("Introduce opcion:");
			cont = sc.nextInt();

			switch (cont) {
			case 0 -> System.out.println("Cerrando...");

			case 1 -> {
				System.out.println("Nombre?");
				String aux = sc.next();
				crearCarpeta(aux);
			}

			case 2 -> {
				String carpeta = ".\\prueba";
				System.out.println("Nombre?");
				String aux = sc.next();
				crearFichero(aux, carpeta);
			}
			//Borrar archivos
			case 3->{ 
                System.out.println("Dime el nombre del archivo que quieres borrar");
                nombreArchivo = sc.next();
                File archivoBorrar = new File(ruta+ "prueba"+ File.separator + nombreArchivo);

                if (archivoBorrar.exists()) {
                    boolean borrado = archivoBorrar.delete();
                    if (borrado) {
                        System.out.println("El fichero " + nombreArchivo + " ha sido borrado con éxito.");
                    } else {
                        System.out.println("No se pudo borrar el fichero.");
                    }
                } else {
                    System.out.println("El fichero no existe en la ubicación especificada.");
                }
			}
             
			//Borrar directorios
            case 4->{ 
                System.out.println("Introduzca el nombre de la carpeta que desea borrar:");
                nombreCarpeta = sc.nextLine();
                File carpetaBorrar = new File(ruta + nombreCarpeta);

                if (carpetaBorrar.exists()) {
                    try {
                        FileUtils.deleteDirectory(carpetaBorrar);
                        System.out.println("La carpeta " + carpetaBorrar + " se ha borrado correctamente.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("La carpeta " + carpetaBorrar + " no existe.");
                }
            }
          //Leer fichero
            case 5->{ 
                System.out.println("Dime el nombre del archivo que quieres leer");
                nombreArchivo = sc.next();
                leerArchivo(ruta +File.separator +"prueba"+File.separator + nombreArchivo);
                break;
            }
            case 6->{ //Leer directorio
                System.out.println("Dime el nombre de la carpeta de la que quieres información");
                nombreCarpeta = sc.next();
                leerCarpeta(ruta + nombreCarpeta);

            }
			}
		}

	}


	private static void leerArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
    //Función de leer carpeta
    private static void leerCarpeta(String rutaCarpeta) {
        File carpeta = new File(rutaCarpeta);
        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();
            for (File archivo : archivos) {
                System.out.println(archivo.getName());
            }
        } else {
            System.out.println("La carpeta no existe.");
        }
    }


	private static void borrarArchivo() {
		try {
			String ruta = ".\\prueba";
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime el nombre del archivo que quieres borrar");
			
            String nombreArchivo = sc.next();
            System.out.println(ruta + File.separator + nombreArchivo);
            File archivoBorrar = new File(ruta  + nombreArchivo);

            if (archivoBorrar.exists()) {
                boolean borrado = archivoBorrar.delete();
                if (borrado) {
                    System.out.println("El fichero " + nombreArchivo + " ha sido borrado con éxito.");
                } else {
                    System.out.println("No se pudo borrar el fichero.");
                }
            } else {
                System.out.println("El fichero no existe en la ubicación especificada.");
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

	private static void crearFichero(String nombre, String carpeta) {
		Scanner sc = new Scanner(System.in);
		String nombreFichero = nombre + ".txt"; // Nombre del fichero
		// que deseas crear

		// Combinar la ruta del directorio con el nombre del fichero
		String rutaFichero = carpeta + File.separator + nombreFichero;

		File fichero = new File(rutaFichero);

		if (fichero.exists()) {
			System.out.println("El fichero ya existe.");
		} else {
			try {
				boolean creado = fichero.createNewFile();
				if (creado) {
					System.out.println("El fichero ha sido creado con �xito.");
					System.out.println("Quiere escribir en el archivo? (si/no)");
					String respuesta = sc.nextLine();
					if (respuesta.equals("si")) {

						try (BufferedWriter fw = new BufferedWriter(new FileWriter(rutaFichero))) {
							System.out.println("Que quieres introducir?");
							respuesta = sc.nextLine();
							fw.write(respuesta);

						} catch (IOException e) {
							e.printStackTrace();
							System.err.println("Error al crear el archivo");
						}

					}
				} else {
					System.out.println("No se pudo crear el fichero.");
				}
			} catch (IOException e) {
				System.out.println("Error al crear el fichero: " + e.getMessage());
			}
		}
	}

	private static void crearCarpeta(String nombre) {
		// Nombre del directorio que queremos crear
		String nombreDirectorio = nombre;

		// Directorio actual
		String directorioActual = System.getProperty("user.dir");

		// Crear un objeto File para el directorio
		File directorio = new File(directorioActual, nombreDirectorio);

		// Comprobar si el directorio ya existe
		if (!directorio.exists()) {
			// Crear el directorio
			boolean directorioCreado = directorio.mkdir();
			if (directorioCreado) {
				System.out.println("Directorio creado correctamente: " + directorio.getAbsolutePath());
			} else {
				System.out.println("No se pudo crear el directorio.");
				return;
			}
		}
	}

}
