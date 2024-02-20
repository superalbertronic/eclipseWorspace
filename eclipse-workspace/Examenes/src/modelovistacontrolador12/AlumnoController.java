package modelovistacontrolador12;
import java.util.List;
import java.sql.*;
/**
 * Clase Controlador del Alumno
 * @author javid
 *
 */
public class AlumnoController {
	private AlumnoModel model; 
	private AlumnoView view;

	// Constructor que recibe la URL de la base de datos, el usuario y la contraseña
	public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnoModel(dbURL, dbUser, dbPassword);
        view = new AlumnoView(); 
    }

	// Método para mostrar los alumnos
	public void mostrarAlumnos() throws SQLException {
		List<Alumno> alumnos = model.getAllAlumnos();
		view.mostrarAlumnos(alumnos); 
	}

	// Método para cerrar la conexión a la base de datos
	public void cerrarConexion() throws SQLException {
		model.close();
	}
}
