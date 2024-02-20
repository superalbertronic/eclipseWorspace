package componentes;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;


public class EjemploPersistencia {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String usuario = "root";
        String contrasena = "";

        // Conexión a la base de datos
        Connection connection = DriverManager.getConnection(url, usuario, contrasena);

        // Inserción de datos
        String query = "INSERT INTO clientes (nombre, ciudad) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, "Diana");
        statement.setString(2, "Málaga");
        statement.executeUpdate();

        // Búsqueda de datos
        query = "SELECT * FROM clientes WHERE nombre = ?";
        statement = connection.prepareStatement(query);
        statement.setString(1, "Diana");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nombre = resultSet.getString("nombre");
            String ciudad = resultSet.getString("ciudad");
            System.out.println(id + ": " + nombre + " - " + ciudad);
        }

        // Cierre de la conexión
        connection.close();
    }
}