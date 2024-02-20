package Examen1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GestorArchivo {
	
	 public static void main(String[] args) {
		 	
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Introduce el nombre de una carpeta o fichero");
		 	
	        String ruta = ".\\src\\ficheros\\ejercicio1";
	        String nombreFichero = sc.next();
	        
	        
	        String rutaFichero = ruta + File.separator + nombreFichero;

	        File fichero = new File(rutaFichero);

	        if (fichero.exists()) {
	            System.out.println("El fichero ya existe.");
	        } else {
	            try {
	                boolean creado = fichero.createNewFile();
	                if (creado) {
	                    System.out.println("El fichero ha sido creado con �xito.");
	                } else {
	                    System.out.println("No se pudo crear el fichero.");
	                }
	            } catch (IOException e) {
	                System.out.println("Error al crear el fichero: " + e.getMessage());
	            }
	        }
	    }
}
