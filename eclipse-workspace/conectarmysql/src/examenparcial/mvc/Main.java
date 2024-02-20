package mvc;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		try {
			// Datos para el controlador de la conexión la base de datos.
			String dbURL = "jdbc:mysql://localhost/dbgametop";
			String dbUser = "root";
			String dbPassword = "";
			
			// Creación del controlador.
			VideoJuegoController controlador = new VideoJuegoController(dbURL, dbUser, dbPassword);
			
			// Mostrar los Juegos.
			controlador.mostrarJuegos();
			// Cerrar la sesión.
			controlador.cerrarConexion();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	} // main

} // class
