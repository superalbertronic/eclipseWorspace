package application5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudianteModel {
	private Connection conn;

	public EstudianteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Estudiante> getAllEstudiantes() throws SQLException {
		List<Estudiante> estudiantes = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estudiante");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String correo_electronico = rs.getString("correo_electronico");
			String telefono = rs.getString("telefono");
			String curso = rs.getString("curso");
			String fecha_inscripcion = rs.getString("fecha_inscripcion");

			estudiantes.add(new Estudiante(id, nombre, correo_electronico, telefono, curso,fecha_inscripcion));
		}
		stmt.close();
		rs.close();
		return estudiantes;
	}

	public void borrarRegistro(String nombreEstudiante) throws SQLException {
		String sql = "DELETE FROM estudiante WHERE nombre=?";
		try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setString(1, nombreEstudiante);

			int filasAfectadas = preparedStatement.executeUpdate();
			if (filasAfectadas > 0) {
				System.out.println("Estudiante eliminado correctamente");
			} else {
				System.out.println("No se encontró el registro con el nombre especificado");
			}
		}
	}

	public void agregarEstudiante(Estudiante nuevoEstudiante) throws SQLException {
		String query = "INSERT INTO estudiante (id,nombre, correo_electronico, telefono, curso, fecha_inscripcion) VALUES (?,?,?,?,?,?)";

		try (PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1,nuevoEstudiante.getId());
			stmt.setString(2, nuevoEstudiante.getNombre());
			stmt.setString(3, nuevoEstudiante.getCorreo_electronico());
			stmt.setString(4, nuevoEstudiante.getTelefono());
			stmt.setString(5,nuevoEstudiante.getCurso());
			stmt.setString(6,nuevoEstudiante.getFecha_inscripcion());
			

			stmt.executeUpdate();
		}
	}

	public void close() throws SQLException {
		conn.close();
	}

}