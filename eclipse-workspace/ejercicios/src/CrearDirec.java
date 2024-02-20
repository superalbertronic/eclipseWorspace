import java.io.File;
/**
 *
 * @author decodigo.com
 */
public class CrearDirec {
    public static void main(String args[]){
        File directorio = new File("/ejercicio1");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}