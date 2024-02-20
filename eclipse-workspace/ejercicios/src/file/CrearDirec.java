package file;
 
import java.io.*;
public class CrearDirec  {
 public static void main(String[] args) {
   File d = new File("NEWDIREC"); //directorio que se crea a partir del actual
   File f1 = new File(d,"FILE1.TXT");
   File f2 = new File(d,"FILE2.TXT");
   
   d.mkdir();//CREAR DIRECTORIO
     
   try { 
    if (f1.createNewFile())
       System.out.println("FILE1 creado ok");
    else
       System.out.println("Error en la creación del fichero FILE1..."); 
 
    if (f2.createNewFile())
       System.out.println("FILE2 creado ok");
    else
       System.out.println(" Error en la creación del fichero FILE2...");
 
   } catch (IOException e) {
e.printStackTrace();
   }  
   
   f1.renameTo(new File(d,"FILE1NEW"));//renombrar FILE1
   try { 
        File f3 = new File("NEWDIREC\\FILE3.TXT");
	  f3.createNewFile();//crea FILE3 en NEWDIREC
   } catch (IOException e) {
e.printStackTrace();
   }  
 
 }
}
