package ficherodetexto2procesamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Cambia los tabuladores por 2 espacios
 * 
 * @author Luis José Sánchez
 */
public class Procesamiento2 {
	public static void main(String[] args) {
		String ruta = "c:\\prueba\\malaga.txt"; // Ruta del archivo a procesar
		
		System.out.print("Procesando el archivo " + ruta + "...");
		
		try {
			// Renombra el fichero añadiendo ".tmp"
			File ficheroOriginal = new File(ruta);
			File ficheroTemporal = new File(ruta + ".tmp");
			ficheroOriginal.renameTo(ficheroTemporal);
			
			// Lee los datos del archivo temporal
			BufferedReader bf = new BufferedReader(new FileReader(ruta + ".tmp"));
			
			// Crea un fichero nuevo con el nombre original
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
			
			String linea = "";
			
			while (linea != null) {
				linea = bf.readLine();
				
				if (linea != null) {
					// Cambia el tabulador por 2 espacios
					linea = linea.replace("\t", " ");
					bw.write(linea + "\n");
					bw.write(linea.toUpperCase());
				}
			}
			
			bf.close();
			bw.close();
			
			// Borra el fichero temporal
			ficheroTemporal.delete();
		} catch (IOException ioe) {
			System.out.println("Se ha producido un error de lectura/escritura");
			System.err.println(ioe.getMessage());
		}
		
		System.out.println("hecho");
	}
}

