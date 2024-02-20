package modelVistaControlador9;
import java.sql.SQLException;
import java.util.List;

public class AlumnoController {
    private AlumnoModel modelo;
    private AlumnoView vista;

    public AlumnoController(AlumnoModel modelo, AlumnoView vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarTodosLosAlumnos() {
        try {
            List<Alumno> alumnos = modelo.obtenerTodosLosAlumnos();
            vista.mostrarAlumnos(alumnos);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
