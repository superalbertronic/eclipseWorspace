package modelovistacontrolador12;

import java.sql.SQLException;
/**
 * Clase Main del alumno donde muestra por pantalla todo los datos 
 * @author javid
 *
 */
public class MainAlumno {

	public static void main(String[] args) {
		
		        String dbURL = "jdbc:mysql://localhost/instituto";
		        String dbUser = "root"; 
		        String dbPassword = "";

		        try {
		            AlumnoController controller = new AlumnoController(dbURL, dbUser, dbPassword);
		            controller.mostrarAlumnos();
		            controller.cerrarConexion(); 
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

