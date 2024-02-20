package modeloVistaControlador69;

import java.sql.SQLException;

import modeloVistaControlador69.AlumnoController;

public class Main {
	 public static void main(String[] args) {
	        String dbURL = "jdbc:mysql://localhost/instituto"; // URL de la base de datos
	        String dbUser = "root"; // Usuario de la base de datos
	        String dbPassword = ""; // Contrase�a del usuario

	        try {

	            AlumnoController controller = new AlumnoController(dbURL, dbUser, dbPassword); // Crea una instancia del controlador
	            controller.mostrarAlumnos(); // Llama al m�todo del controlador para mostrar los alumno
	            controller.cerrarConexion(); // Llama al m�todo del controlador para cerrar la conexi�n a la base de datos
	        } catch (SQLException e) {
	            e.printStackTrace(); // Maneja las excepciones de SQL imprimiendo el error
	        }
	    }
}
