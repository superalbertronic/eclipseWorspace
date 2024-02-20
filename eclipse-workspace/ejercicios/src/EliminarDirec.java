import java.io.*;
public class EliminarDirec  {
	 public static void main(String[] args) throws IOException {
	   
		 // creamos una árbol de directorios y ficheros
		 File f = creaEstrucDirFich(new File("c:"));
		 // intentamos eliminarlo pero como contiene directorios y archivos es imposible
		 eliminar(f);
		 // Exploramos el árbol de directorios y sus ficheros para mostrarlo
		 exploracion(f);
		 // Eliminamos el contenido de forma recursiva para poder eliminar el directorio más tarde
		 eliminarContenido(f);
		 /* Ahora que se ha borrado el contenido del directorio volvemos a intentar borrarlo y como está vacío no habrá problema */
		 eliminar(f);
	
	 }
	 
	 /* creamos una estructura de directorios y ficheros a partir de una ruta concreta y devolvemos el directorio principal */
	 public static File creaEstrucDirFich(File raiz) throws IOException{
		File directorio = new File(raiz,"directorio");
		directorio.mkdir();
		new File(directorio,"dir1\\dir11").mkdirs();
		new File(directorio,"dir1\\dir12").mkdir();
		new File(directorio,"dir1\\dir12\\f111.txt").createNewFile();
		new File(directorio,"dir1\\dir12\\f112.txt").createNewFile();
		new File(directorio,"dir1\\f11.txt").createNewFile();
		new File(directorio,"dir2\\dir21").mkdirs();
		new File(directorio,"dir2\\dir21\\f221.txt").createNewFile();
		new File(directorio,"dir2\\f21.txt").createNewFile();
		new File(directorio,"f1.txt").createNewFile();
		return directorio;
	 }
	 
	 // Mostramos el nombre de la carpeta o fichero según corresponda seguido de su ruta completa
	 public static void mostrar(File fichero){
		 System.out.println(((fichero.isDirectory())?"Nombre de la carpeta: ":"Nombre del fichero: ")
				 +fichero.getAbsolutePath());
	 }
	 
	 // Explorar de forma recursiva el árbol de directorios
	 public static void exploracion (File directorio){
		 for (File subFichero : directorio.listFiles()){
			 mostrar(subFichero);
			 if(subFichero.isDirectory()){
				 exploracion(subFichero);
			 }
		}
	 }
	 
	 // eliminamos un fichero o directorio
	 public static void eliminar(File f){
		 String dirFich = (f.isDirectory())?"directorio":"fichero";
		 
		 if (f.delete())
			 System.out.println("El "+dirFich +" " + f.getName() + " ha sido borrado correctamente");
		 else
			 System.out.println("El "+dirFich +" " + f.getName() + " no se ha podido borrar");
	 }
	 
	 // Eliminamos de forma recursiva el contenido de las subcarpetas
	 public static void eliminarContenido(File directorio){
		 for (File subFichero : directorio.listFiles()){
			 if(subFichero.isDirectory()){
				 eliminarContenido(subFichero);
			 }
			 eliminar(subFichero);
		}
	 }
 
}
 
