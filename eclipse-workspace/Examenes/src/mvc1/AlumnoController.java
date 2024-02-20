package mvc1;

import java.sql.SQLException;
import java.util.List;

public class AlumnoController {

	private AlumnoModel modelo;
	private AlumnoView vista;

	public AlumnoController(String dbURL, String dbUser, String dbPassword) throws SQLException {

		modelo = new AlumnoModel(dbURL, dbUser, dbPassword);
		vista = new AlumnoView();

	} // costr

	public void mostrarAlumnos() throws SQLException {
		List<Alumno> alumnos = modelo.getAllAlumnos();
		vista.monstrarAlumnos(alumnos);
	} // method

	public void cerrarConexion() throws SQLException {
		modelo.close();
	} // method

} // class
