package propiedadcompartida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	  
	// Propiedad compartida
	private static Connection connection;

	// Propiedad restringida
	private static final String PASSWORD = "";

	// Método para obtener la conexión a la base de datos
	public static Connection getConnection() throws SQLException {
		if (connection == null) {
			// Si no existe la conexión, se crea una nueva
			String url = "jdbc:mysql://localhost:3306/empresa";
			String user = "root";
			connection = DriverManager.getConnection(url, user, PASSWORD);
			System.out.println("Conexión establecida");
		}
		return connection;
	}

	// Método para cerrar la conexión a la base de datos
	public static void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
			connection = null;
		}
	}
}

