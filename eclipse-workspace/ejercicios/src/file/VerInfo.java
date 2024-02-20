package file;
 
import java.io.*;
public class VerInfo {
public static void main(String[] args) {
  System.out.println("INFORMACIÓN SOBRE EL FICHERO:");
  File f = new File(".\\src\\file\\VerInfor.java");
   if(f.exists()){
        System.out.println("Nombre del fichero  : "+f.getName());
        System.out.println("Ruta                : "+f.getPath());
        System.out.println("Ruta absoluta       : "+f.getAbsolutePath());
        System.out.println("Lectura       : "+f.canRead());
        System.out.println("Escritura   : "+f.canWrite());
        System.out.println("Tamaño              : "+f.length()); // El tamaño es expresado en bytes
		System.out.println("Directorio    : "+f.isDirectory()); 
		System.out.println("Fichero       : "+f.isFile());
		System.out.println("Nombre del directorio padre: "+f.getParent());
  }
 }
}
 
