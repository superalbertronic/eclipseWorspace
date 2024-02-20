package modelovistacontroladorInstitutoEXAMEN1ºTRIMESTRE;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class Modelo {
    private Connection conn;

    // Constructor que recibe la URL de la base de datos, el usuario y la contraseña
    public Modelo(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Establece la conexión con la base de datos
        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
    }

    // Método para obtener todos los clientes de la base de datos y devolverlos como una lista
    public List<Cliente> getAllClientes() throws SQLException {
    	 List<Cliente> clientes = new ArrayList<>();
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");

        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
        ResultSet rs = stmt.executeQuery();

        // Itera a través de los resultados y crea objetos Cliente para cada fila
        while (rs.next()) {
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido1 = rs.getString("apellido1");
            String apellido2 = rs.getString("apellido2");
            Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
            String es_repetidor = rs.getString("es_repetidor");
            String telefono = rs.getString("telefono"); // Aquí estaba el error

            clientes.add(new Cliente(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, telefono));
        }

        stmt.close(); // Cierra la declaración
        rs.close(); // Cierra el resultado
        return clientes; // Devuelve la lista de clientes
    }

    // Método para cerrar la conexión a la base de datos
    public void close() throws SQLException {
        conn.close();
    }
}

