package mvc;

import java.sql.SQLException;
import java.util.List;

public class VideoJuegoController {

	private VideoJuegoModel modelo;
	private VideoJuegoView vista;

	// Constructor del controlador.
	public VideoJuegoController(String dbURL, String dbUser, String dbPassword) throws SQLException {

		modelo = new VideoJuegoModel(dbURL, dbUser, dbPassword);
		vista  = new VideoJuegoView();
		
	} // costr
	
	// Método de mostrar los juegos.
	public void mostrarJuegos() throws SQLException {
		List<VideoJuego> juego = modelo.getAllGames();
		vista.mostrarJuegos(juego);
	} // method
	
	// Método de cerrar la conexión.
	public void cerrarConexion() throws SQLException {
		modelo.close();
	} // method
	
} // class
