package mvc1;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {

		try {
			String dbURL = "jdbc:mysql://localhost/instituto";
			String dbUser = "root";
			String dbPassword = "";

			AlumnoController controlador = new AlumnoController(dbURL, dbUser, dbPassword);

			controlador.mostrarAlumnos();
			controlador.cerrarConexion();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	} // main
} // class
