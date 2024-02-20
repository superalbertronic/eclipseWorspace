package accesoAleatorio;
 
import java.io.*;
public class EscribirFileAleatorio {
  public static void main(String[] args) throws IOException {      
   File fichero = new File ("C:\\prueba\\AleatorioEmple.dat");
   //declara el fichero de acceso aleatorio
   RandomAccessFile file = new RandomAccessFile(fichero, "rw");
   //arrays con los datos
   String apellido[] = {"RUIZ","RODRIGUEZ","LUCENA","REINA",
                        "MÁLAGA","GÓMEZ", "PÉREZ};//apellidos"};
   int dep[] = {10, 20, 20, 30, 20, 10, 20};       //departamentos
   Double salario[]={1200.45, 2200.60, 3400.0, 1800.56, 
                     2600.0, 1600.87, 2000.0};//salarios
   
   StringBuffer buffer = null;//buffer para almacenar apellido
   int n=apellido.length;//número de elementos del array
   
   for (int i=0;i<n; i++){ //recorremos los arrays          	  
	 file.writeInt(i+1); //uso i+1 para identificar empleado
     buffer = new StringBuffer( apellido[i] );      
     buffer.setLength(10); //10 caracteres para el apellido
     file.writeChars(buffer.toString());//insertar apellido
	 file.writeInt(dep[i]);       //insertar departamento
	 file.writeDouble(salario[i]);//insertar salario
   }     
   file.close();  //cerrar fichero 
   }
}



