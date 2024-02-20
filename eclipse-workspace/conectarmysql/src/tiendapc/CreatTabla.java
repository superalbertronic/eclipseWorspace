package tiendapc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatTabla {
    public static void main(String[] args) {
        // Información de conexión a la base de datos MySQL
        String jdbcURL = "jdbc:mysql://localhost:3306/TiendaPc";
        String username = "root";
        String password = "";

        try {
            // Establecer la conexión a la base de datos
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Crear una declaración SQL
            Statement statement = connection.createStatement();

            // Crear la tabla "productos"
            String createTableSQL = "CREATE TABLE productos (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombreProduct VARCHAR(40), " +
                    "fabricante VARCHAR(30))";

            // Ejecutar la consulta para crear la tabla
            statement.executeUpdate(createTableSQL);
            System.out.println("La tabla 'productos' se ha creado correctamente.");

            // Cerrar la conexión y la declaración
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
