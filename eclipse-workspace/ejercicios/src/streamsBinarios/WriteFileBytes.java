package streamsBinarios;
 
import java.io.*;
public class WriteFileBytes {
  	public static void main(String[] args) throws IOException {   
   		File fichero = new File(".\\src\\fileBytes.dat");//declara el  fichero
   //crea flujo de salida hacia el fichero, si no existe el fichero se crea
   // al poner a true el segundo parámetro indicamos que se añada la información al final del archivo
   // para no sobrescribir
  		 FileOutputStream fileout = new FileOutputStream(fichero,true);   
   //crea flujo de entrada, en caso de no existir el fichero dará un FileNotFoundException
   		FileInputStream filein = new FileInputStream(fichero);   
 
   		for (int i=1; i<100; i++)
      			 fileout.write(i); //escribe los datos en el flujo de salida byte a byte	  
   
   		fileout.close(); //cierra el stream de salida para liberar los recursos   
   
   //visualizar los datos del fichero	   
   		while (filein.available() != 0) // comprobamos que haya bytes restantes por leer
	    		System.out.println(filein.read());//lee los datos del flujo de entrada byte a byte		
   
   		filein.close();  //cierra stream de entrada para liberar recursos
  	}
}
 
