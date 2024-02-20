package modelovc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel {
	private Connection conn;

	// Constructor que recibe la URL de la base de datos, el usuario y la contraseña
	public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	// Método para obtener todos los clientes de la base de datos y devolverlos como
	// una lista
	public List<Alumno> getAllAlumnos() throws SQLException {
		List<Alumno> alumnos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido1 = rs.getString("apellido1");
			String apellido2 = rs.getString("apellido2");
			String fecha_nacimiento = rs.getString("fecha_nacimiento");
			String es_repetidor = rs.getString("es_repetidor");
			int telefono = rs.getInt("telefono");
			alumnos.add(new Alumno(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, telefono));
		}

		stmt.close();
		rs.close();
		return alumnos;

	}

	public void close() throws SQLException {
		conn.close();
	}
}
