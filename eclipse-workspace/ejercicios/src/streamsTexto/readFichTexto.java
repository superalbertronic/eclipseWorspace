package streamsTexto;
 
import java.io.*;
 
public class readFichTexto {
  public static void main(String[] args) throws IOException {
    File fichero = new File("C:\\prueba\\myfile.txt"); //declara el fichero
    FileReader fiche = new FileReader(fichero); //crea el flujo de entrada  
        
    int i;
    while ((i = fiche.read()) != -1) //se lee el archivo hasta que encuentre  el car�cter  -1
    	System.out.print((char) i); //cast a char
    	
    //para leer de 20 en 20 utilizamos el metodo read pas�ndole el buffer de caracteres
    /*	char b[] = new char [20];
    	while ((i = fiche.read(b)) != -1) 
    		System.out.println(b);*/
    	
    	//System.out.println( (char) i + "==>"+ i);
        
    fiche.close(); //cerrar fichero  
    
  }
}

