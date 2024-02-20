package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VideoJuegoModel {

	private Connection conn;

	// Constructor del modelo.
	public VideoJuegoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	} // contr

	// Método de conseguir todos los juegos (consulta).
	public List<VideoJuego> getAllGames() throws SQLException {

		List<VideoJuego> juegos = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tvideoJuegos");

		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("idjuego");
			String nombre = rs.getString("nombre");
			int anio = rs.getInt("anio");
			String compania = rs.getString("compania");
			float precio = rs.getFloat("precio");
			String sinopsis = rs.getString("sinopsis");
			String plataforma = rs.getString("plataforma");
			System.out.println("ID: " + id + " | Nombre: " + nombre + " | Año: " + anio + " | Compañia: " + compania
					+ " | Precio: " + precio + " | Sinopsis: " + sinopsis + " | Plataforma: " + plataforma);
		} // while

		rs.close();
		stmt.close();
		return juegos;
	} // method

	// Método de cerrar la conexión.
	public void close() throws SQLException {
		conn.close();
	} // method
	
} // class
