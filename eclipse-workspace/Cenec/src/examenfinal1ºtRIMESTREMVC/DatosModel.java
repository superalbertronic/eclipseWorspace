package examenfinal1簍RIMESTREMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatosModel {
	 private Connection conn;

	    // Constructor que recibe la URL de la base de datos, el usuario y la contrase帽a
	    public DatosModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
	        // Establece la conexi贸n con la base de datos
	        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	    }

	    // M茅todo para obtener todos los clientes de la base de datos y devolverlos como una lista
	    public List<Datos> getAllDatos() throws SQLException {
	        List<Datos> datos = new ArrayList<>(); // Inicializa una lista para almacenar los clientes
	        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno"); // Crea una declaraci贸n SQL

	        // Ejecuta una consulta SQL para obtener todos los clientes de la tabla "clientes"
	        ResultSet rs = stmt.executeQuery();

	        // Itera a trav茅s de los resultados y crea objetos Cliente para cada fila
	        while (rs.next()) {
	        	int id = rs.getInt("id");
	        	String nombre = rs.getString("nombre");
	        	String apellido1 = rs.getString("apellido1");
	        	String apellido2 = rs.getString("apellido2");
	        	String fecha_nacimiento = rs.getString("fecha_nacimiento");
	        	String es_repetido = rs.getString("es_repetidor");
	        	int telefono = rs.getInt("telefono");
	        	
	            datos.add(new Datos(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetido, telefono)); // Agrega cada Cliente a la lista
	        }

	        stmt.close(); // Cierra la declaraci贸n
	        rs.close(); // Cierra el resultado
	        return datos; // Devuelve la lista de clientes
	    }

	    // M茅todo para cerrar la conexi贸n a la base de datos
	    public void close() throws SQLException {
	        conn.close();
	    }
}
