package mvc;
import java.util.List;
import java.sql.Connection;

public class AlumnoView {
 
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
        	System.out.println("ID: "+alumno.getId());
        	System.out.println("Nombre completo: "+ alumno.getNombre()+" "+alumno.getApellido1()+" "+alumno.getApellido2());
        	System.out.println("Fecha de nacimiento: "+alumno.getFechaNacimiento());
        	System.out.println(alumno.isRepetidor()?"Es repetidor":"No es repetidor");
        	System.out.println("Teléfono: "+(alumno.getTelefono()==0?"Sin teléfono":alumno.getTelefono()));
        	System.out.println("\n\n");
        }
    }
}
