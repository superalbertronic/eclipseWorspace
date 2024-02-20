package crontolador;

import java.sql.SQLException;
import java.util.List;

public class AlumnosController {
    private AlumnosModel model; // Instancia del modelo
    private AlumnosView view;   // Instancia de la vista

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public AlumnosController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnosModel(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexión a la base de datos
        view = new AlumnosView(); // Inicializa la vista
    }

    // Método para mostrar los clientes
    public void mostrarAlumnos() throws SQLException {
        List<Alumnos> alumnos = model.getAllAlumnos(); // Obtiene la lista de alumnos desde el modelo
        view.mostrarAlumnos(alumnos); // Muestra los alumnos en la vista
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}
