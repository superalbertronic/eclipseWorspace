package modelovistacontrolador12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase model del Alumno
 * @author javid
 *
 */
public class AlumnoModel {

	private Connection conn;

	// Constructor que recibe la URL de la base de datos, el usuario y la contraseña
	public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {

		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	// Método para obtener todos los alumnos de la base de datos y devolverlos como
	// una lista
	public List<Alumno> getAllAlumnos() throws SQLException {
		List<Alumno> alumnos = new ArrayList<Alumno>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido1 = rs.getString("apellido1");
			String apellido2 = rs.getString("apellido2");
			String fechanacimiento = rs.getString("fecha_nacimiento");
			String esrepetidor = rs.getString("es_repetidor");
			String telefono = rs.getString("telefono");
			alumnos.add(new Alumno(id, nombre, apellido1, apellido2, fechanacimiento, esrepetidor, telefono));

		}

		stmt.close();
		rs.close();
		return alumnos;
	}

	public void close() throws SQLException {
		conn.close();
	}
}
