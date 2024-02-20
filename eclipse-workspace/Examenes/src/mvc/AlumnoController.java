package mvc;
import java.util.List;
import java.sql.*;

public class AlumnoController {
    private AlumnoModel model; 
    private AlumnoView view;   


    public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnoModel(dbURL, dbUser, dbPassword);
        view = new AlumnoView();
    }

  
    public void mostrarAlumnos() throws SQLException {
        List<Alumno> alumnos = model.getAllAlumnos();
        view.mostrarAlumnos(alumnos); 
    }
 
    public void cerrarConexion() throws SQLException {
        model.close(); 
    }
}
