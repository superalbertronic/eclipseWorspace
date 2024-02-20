package modelovistacontrolador;
import java.util.List;
import java.sql.*;

public class AlumnoController {
    private AlumnoModel model; // Instancia del modelo
    private AlumnoView view;   // Instancia de la vista

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnoModel(dbURL, dbUser, dbPassword); 
        view = new AlumnoView(); // Inicializa la vista
    }

    // Método para mostrar los alumnos
    public void mostrarAlumnos() throws SQLException {
        List<Alumno> alumnos = model.getAllAlumnos(); 
        view.mostrarAlumnos(alumnos); 
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}
