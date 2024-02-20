package modelovistacontrolador;
import java.util.List;
import java.sql.Connection;

public class AlumnoView {
    // Método para mostrar los Alumnos en la vista
    public void mostrarAlumnos(List<Alumno> clientes) {
        for (Alumno alumno : clientes) {
            System.out.println("ID: " + alumno.getId()); 
            System.out.println("Nombre: " + alumno.getNombre()); 
            System.out.println("Apellido1: " + alumno.getApellido1()); 
            System.out.println("Apellido2: " + alumno.getApellido2());
            System.out.println("FechaNacimiento: " + alumno.getFechaNacimiento()); 
            System.out.println("EsRepetidor: " + alumno.getEsRepetidor()); 
            System.out.println("Telefono: " + alumno.getTelefono()); 
        }
    }
}
