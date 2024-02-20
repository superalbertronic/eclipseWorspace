package modeloVistaControlador;

import java.sql.SQLException;
import java.util.List;



public class VentasController {
	private AlumnoModel model; 
    private AlumnoView view;   

    
    public VentasController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new AlumnoModel(dbURL, dbUser, dbPassword); 
        view = new AlumnoView(); 
    }


    public void mostrarVentas() throws SQLException {
        List<Alumnos> alumnos = model.getAllProductos(); 
        view.mostrarAlumno(alumnos); 
    }

    
    public void cerrarConexion() throws SQLException {
        model.close(); 
    }
}
