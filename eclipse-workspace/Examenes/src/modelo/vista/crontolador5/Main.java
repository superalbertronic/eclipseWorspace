package modelo.vista.crontolador5;

import java.sql.SQLException;

public class Main {

	 public static void main(String[] args) {
	        String dbURL = "jdbc:mysql://localhost/instituto"; // URL de la base de datos
	        String dbUser = "root"; // Usuario de la base de datos
	        String dbPassword = ""; // Contraseña del usuario

	        try {
	            AlumnosController controller = new AlumnosController(dbURL, dbUser, dbPassword);
	            controller.mostrarAlumnos(); 
	            controller.cerrarConexion(); 
	        } catch (SQLException e) {
	            e.printStackTrace(); 
	        }
	    }

}
