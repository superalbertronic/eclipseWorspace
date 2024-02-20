package modeloVistaControlador69;

import java.sql.SQLException;
import java.util.List;

import modeloVistaControlador69.Alumno;
import modeloVistaControlador69.AlumnoModel;
import modeloVistaControlador69.AlumnoView;

public class AlumnoController {
	
	    private AlumnoModel model; // Instancia del modelo
	    private AlumnoView view;   // Instancia de la vista

	    // Constructor que recibe la URL de la base de datos, el usuario y la contrase�a
	    public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
	        model = new AlumnoModel(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexi�n a la base de datos
	        view = new AlumnoView(); // Inicializa la vista
	    }

	    // M�todo para mostrar los alumnoss
	    public void mostrarAlumnos() throws SQLException {
	        List<Alumno> alumnos = model.getAllAlumnos(); // Obtiene la lista de alumnos desde el modelo
	        view.mostrarAlumnos(alumnos); // Muestra los alumnos en la vista
	    }

	    // M�todo para cerrar la conexi�n a la base de datos
	    public void cerrarConexion() throws SQLException {
	        model.close(); // Cierra la conexi�n en el modelo
	    }
}

