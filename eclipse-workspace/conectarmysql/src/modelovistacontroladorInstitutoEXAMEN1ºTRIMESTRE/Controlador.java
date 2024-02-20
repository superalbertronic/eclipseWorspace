package modelovistacontroladorInstitutoEXAMEN1ºTRIMESTRE;
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

    // Método para mostrar los clientes
    public void mostrarClientes() throws SQLException {
        List<Cliente> clientes = model.getAllClientes(); // Obtiene la lista de clientes desde el modelo
        view.mostrarClientes(clientes); // Muestra los clientes en la vista
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() throws SQLException {
        model.close(); // Cierra la conexión en el modelo
    }
}
