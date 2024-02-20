package mvc1;

import java.util.List;

public class AlumnoView {

	// Constructor de la vista.
	public void monstrarAlumnos(List<Alumno> alumnos) {
		// bucle de ejecución.
		for (Alumno alumno : alumnos) {
			System.out.println("ID: " + alumno.getId());
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Apellido1: " + alumno.getApellido1());
			System.out.println("Apellido2: " + alumno.getApellido2());
			System.out.println("Fecha nacimiento: " + alumno.getFecha_nacimiento());
			System.out.println("Reptidor: " + alumno.isEs_repetidor());
			System.out.println("Telefono: " + alumno.getTelefono());
		} // for
	} // method
} // class
