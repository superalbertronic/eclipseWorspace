package mvc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlumnoModel {

	private Connection conn;

	// Constructor del modelo.
	public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	} // contr

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
			String telefono = rs.getString("telefono");
			System.out.println("ID: " + id + " | Nombre: " + nombre + " | Apellido1: " + apellido1 + " | Apellido2"
					+ apellido2 + " | FechaNacimiento: " + fecha_nacimiento + " | Repetidor: " + es_repetidor
					+ " | Teléfono: " + telefono);
		} // while

		rs.close();
		stmt.close();
		return alumnos;
	} // method

	// Método de cerrar la conexión.
	public void close() throws SQLException {
		conn.close();
	} // method

} // class
