package modelovc;

import java.util.List;

public class AlumnoView {
	// Método para mostrar los alumnos en la vista
	public void mostrarAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println("ID: " + alumno.getId());
			System.out.println("Nombre: " + alumno.getNombre());
			System.out.println("Primer apellido: " + alumno.getApellido1());
			System.out.println("Segundo apellido: " + alumno.getApellido2());
			System.out.println("Fecha de nacimiento: " + alumno.getFecha_nacimiento());
			System.out.println("Es repetidor: " + alumno.getEs_repetidor());
			System.out.println();
		}
	}
}
