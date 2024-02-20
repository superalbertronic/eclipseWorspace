package modeloVistaControlador69;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modeloVistaControlador69.Alumno;

public class AlumnoModel {
	 private Connection conn;

	    // Constructor que recibe la URL de la base de datos, el usuario y la contrase�a
	    public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
	        // Establece la conexi�n con la base de datos
	        conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	    }

	    // M�todo para obtener todos los alumnos de la base de datos y devolverlos como una lista
	    public List<Alumno> getAllAlumnos() throws SQLException {
	        List<Alumno> alumnos = new ArrayList<>(); // Inicializa una lista para almacenar los alumno
	        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno"); // Crea una declaraci�n SQL

	        // Ejecuta una consulta SQL para obtener todos los alumno de la tabla "alumno"
	        ResultSet rs = stmt.executeQuery();

	        // Itera a trav�s de los resultados y crea objetos alumno para cada fila
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String nombre = rs.getString("nombre");
	            String apellido1 = rs.getString("apellido1");
	            String apellido2 = rs.getString("apellido2");
	            String  fecha_nacimiento= rs.getString("fecha_nacimiento");
	            String  es_repetidor= rs.getString("es_repetidor");
	            String  telefono= rs.getString("telefono");
	            alumnos.add(new Alumno(id, nombre, apellido1, apellido2,  fecha_nacimiento,  es_repetidor,  telefono )); // Agrega cada Alumno a la lista
	        }

	        stmt.close(); // Cierra la declaraci�n
	        rs.close(); // Cierra el resultado
	        return alumnos; // Devuelve la lista de alumnos
	    }

	    // M�todo para cerrar la conexi�n a la base de datos
	    public void close() throws SQLException {
	        conn.close();
	    }
}
