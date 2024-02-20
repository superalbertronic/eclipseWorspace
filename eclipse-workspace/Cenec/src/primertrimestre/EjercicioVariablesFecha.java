package primertrimestre;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class EjercicioVariablesFecha {

    public static void main(String[] args) throws ParseException {
        // Obtener la fecha y hora actual
    	 String fechaStr = "2023/05/05";

         // Formato de fecha esperado
         SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

                    // Convertir la cadena a un objeto Date
             Date fecha = formato.parse(fechaStr);

             // Imprimir la fecha
             System.out.println("Fecha: " + fecha);

          
    	
    	
    	LocalDateTime fechaYHoraActual = LocalDateTime.now();
      
        
        // Imprimir la fecha y hora actual
        System.out.println("Fecha y hora actual: " + fechaYHoraActual);
    }
}