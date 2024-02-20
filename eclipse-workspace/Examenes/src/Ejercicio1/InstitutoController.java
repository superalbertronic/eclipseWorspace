package Ejercicio1;
import java.util.List;
import java.sql.*;

public class InstitutoController {
    private InstitutoModel model;
    private InstitutoView view; 

    public InstitutoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new InstitutoModel(dbURL, dbUser, dbPassword);
        view = new InstitutoView(); 
    }

    public void mostrarInstitutos() throws SQLException {
        List<Instituto> institutos = model.getAllInstitutos(); 
        view.mostrarInstitutos(institutos); 
    }

    public void cerrarConexion() throws SQLException {
        model.close();
    }
}
