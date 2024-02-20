package mvc;
import java.util.List;
import java.sql.*;


public class Controlador {
    private Modelo model; // Instancia del modelo
    private Vista view;   // Instancia de la vista


    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public Controlador(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new Modelo(dbURL, dbUser, dbPassword); // Inicializa el modelo con la conexión a la base de datos
        view = new Vista(); // Inicializa la vista
    }


    // Método para mostrar los alumnos
    public void mostrarAlumnos() throws SQLException {
        List<Alumno> alumnos = model.getAllAlumnos(); // Obtiene la lista de alumnos desde el modelo
        view.mostrarAlumnos(alumnos); // Muestra los alumnos en la vista
    }


    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}
