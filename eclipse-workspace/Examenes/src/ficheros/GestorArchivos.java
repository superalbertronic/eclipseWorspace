package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GestorArchivos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ruta = "";
		String contenido = "";
		System.out.println("Dime el nombre de carpeta o ficho");
		ruta = sc.nextLine();
		File fichero = new File(ruta);
		if (!ruta.contains(".")) {
			ruta = "c:\\" + ruta + "\\";
			fichero = new File(ruta);

			if (fichero.mkdir()) {
				System.out.println("Carpeta creada");
			} else {
				System.out.println("No se puedo crear la carpeta");
				if (fichero.exists()) {
					System.out.println("La carpeta ya existe");
				}
			}
		} else {
			fichero = new File("c:\\" + File.separator + ruta);
			System.out.println("Quieres escribir contenido? 1 - Sí, 2 - No");
			int opcion3 = Integer.parseInt(sc.nextLine());
			if (opcion3 == 1) {
				System.out.println("Dime el contenido");
				contenido = sc.nextLine();
				try (BufferedWriter fw = new BufferedWriter(new FileWriter(fichero))) {
					System.out.println("Archivo " + ruta + " creado correctamente");
					fw.write(contenido);
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("Error al crear el archivo " + ruta);
				}
			} else if (opcion3 == 2) {
				if (fichero.exists()) {
		            System.out.println("El fichero ya existe.");
		        } else {
		            try {
		                boolean creado = fichero.createNewFile();
		                if (creado) {
		                    System.out.println("El fichero ha sido creado con exito.");
		                } else {
		                    System.out.println("No se pudo crear el fichero.");
		                }
		            } catch (IOException e) {
		                System.out.println("Error al crear el fichero: " + e.getMessage());
		            }
		        }
			}
		}
		System.out.println("Quieres ver info? 1 - Sí, 2 - No");
		int opcion4 = Integer.parseInt(sc.nextLine());
		if (opcion4 == 1 ) {
			if(fichero.exists()){
		        System.out.println("Nombre del fichero  : "+fichero.getName());
		        System.out.println("Ruta                : "+fichero.getPath());
		        System.out.println("Ruta absoluta       : "+fichero.getAbsolutePath());
		        System.out.println("Lectura       : "+fichero.canRead());
		        System.out.println("Escritura   : "+fichero.canWrite());
		        System.out.println("Tamano              : "+fichero.length()+ " Kb");
				System.out.println("Directorio    : "+fichero.isDirectory()); 
				System.out.println("Fichero       : "+fichero.isFile());
				System.out.println("Nombre del directorio padre: "+fichero.getParent());
		  }else {
			  System.out.println("No existe");
		  }
		} else {
			System.out.println("Adios!");
		}
		
	}
	
	
	public String mostrarInfo() {
		String info ="";
		return info;
	}
}
