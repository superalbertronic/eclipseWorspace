


 
import java.io.*;
 
public class VerDirec {
	public static void main(String[] args) {
		String direc = "."; //Directorio actual
		File f = new File(direc);
		
		
		System.out.println("La ruta actual del directorio es "+f.getAbsolutePath());
		System.out.printf("Ficheros en el directorio actual: %d %n", f.list().length);
		
		// Por cada elemento contenido en el directorio actual será cargado en el String archivo
		for (String archivo : f.list()) {
			File f2 = new File(f, archivo);
			/* usamos el operador ternario que consta de 3 partes la primera una expresión 
   booleana situada antes de la ? en caso de ser cierta se devuelve el valor propuesto justo después de la ? y en caso de ser falso se da el valor propuesto justo después de los :  */
			String isDir = (f2.isDirectory())?" es un directorio":" es un fichero";
			System.out.println("Nombre: "+archivo+","+isDir);
		}
		
	}
}
