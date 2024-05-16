package safa1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class TrabajoConFcheros {

	
	
	
	public static void main(String[] args) {
		File fichero = new File("ficheroEntrada.txt");
		PrintWriter pv = null;
		String nombre =  "ana";
		String apellido =  "lopez";
		String edad = "31";
		String dni = "75781586w";
		
		try {
			pv = new PrintWriter (fichero);
			pv.print(nombre);
			pv.print(apellido);
			pv.print(edad);
			pv.print(dni);
			
		}catch(FileNotFoundException ex) {
			
			ex.printStackTrace();
		}finally {
			
			if (pv != null) {
				pv.close();
			}
			
			}
		try {
			// Abrimos un PrintWriter para escribir en un nuevo fichero
			PrintWriter salidaFichero = new PrintWriter("ficheroSalida.txt");
		} catch (FileNotFoundException e) {
			// Imprimimos el error
			e.printStackTrace();
		}

			
			}

			
		}
		
			
			
		
		

		
		
		

	


