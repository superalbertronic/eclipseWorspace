package ParcialInterfacesJoseMartinMartinez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteModel {
	private Connection conn;

	public EstudianteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Estudiante> getAllEstudiantes() throws SQLException {
		List<Estudiante> Estudiantes = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Estudiante");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String correo_electronico = rs.getString("correo_electronico");
			String telefono = rs.getString("telefono");
			String curso = rs.getString("curso");
			date fecha_inscripción = rs.getString("fecha_inscripción");
			Estudiantes.add(new Estudiante(id, nombre, correo_electronico, telefono, curso,fecha_inscripción));
		}
		stmt.close();
		rs.close();
		return Estudiantes;
	}

	public void borrarRegistro(String nombreEstudiante) throws SQLException {
		String sql = "DELETE FROM Estudiante WHERE nombre=?";
		try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setString(1, nombreEstudiante);

			int filasAfectadas = preparedStatement.executeUpdate();
			if (filasAfectadas > 0) {
				System.out.println("Registro eliminado correctamente");
			} else {
				System.out.println("No se encontró el registro con el nombre especificado");
			}
		}
	}

	public void agregarEstudiante(Estudiante nuevoEstudiante) throws SQLException {
		String query = "INSERT INTO Estudiante (nombre, correo_electronico, telefono, curso, fecha_inscripcion) VALUES (?,?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setString(1, nuevoEstudiante.getnombre());
			stmt.setString(2, nuevoEstudiante.getcorreo_electronico());
			stmt.setString(3, nuevoEstudiante.gettelefono());
			stmt.setString(4, nuevoEstudiante.getcurso());
			stmt.setDate(4, nuevoEstudiante.getfecha_inscripcion());

			stmt.executeUpdate();
		}
	}

	public void close() throws SQLException {
		conn.close();
	}

}
