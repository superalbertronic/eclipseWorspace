package streamsTexto;
 
import java.io.*;
public class writeFichTextoPrint {
  public static void main(String[] args) {
  try{      
      PrintWriter fichero = new PrintWriter (new FileWriter("C:\\prueba\\myfile.txt"));
      for (int i=1; i<11; i++){
	    fichero.println("Fila número: "+i); //escribe una línea
      }
      fichero.close(); 
      }
	catch (FileNotFoundException fn ){                      
               System.out.println("No se encuentra el fichero");}
	catch (IOException io) {
               System.out.println("Error de E/S ");}
  }
}
