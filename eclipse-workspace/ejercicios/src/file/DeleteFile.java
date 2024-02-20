package file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		 try {
			 
				// Declaración de variables
				 
				String directorio = "C:\\prueba";
				 
				String varios = "folder1\\";
				// Crea un directorio
				 
				if ((new File(directorio)).mkdir())
				    	  System.out.println("Directorio: " + directorio + " creado");
				 
				// Creando varios directorios
				  
				if ((new File(directorio+"\\"+varios)).mkdirs())
				        	 System.out.println("Directorios: " + varios + " creado");
				 
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		 

	}

}
