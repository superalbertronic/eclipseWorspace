package modelovistacontrolador12;
import java.util.List;
import java.sql.Connection;
/**
 * Clase View del Alumno
 * @author javid
 *
 */
public class AlumnoView {
    // metodo para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId());
            System.out.println("Nombre: " + alumno.getNombre()); 
            System.out.println("Apellido1: " + alumno.getApellido1()); 
            System.out.println("Apellido2: " + alumno.getApellido2());
            System.out.println("fecha Nacimiento: " + alumno.getFechanacimiento()); 
            System.out.println("es repetidor: " + alumno.getEsrepetidor());
            System.out.println("telefono: " + alumno.getTelefono());
            System.out.println();
        }
    }
}
