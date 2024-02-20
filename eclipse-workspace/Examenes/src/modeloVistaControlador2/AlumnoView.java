package modeloVistaControlador2;

import java.util.List;

public class AlumnoView {
	public void mostrarAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId()); // Imprime el ID del alumno
            System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno
            System.out.println("Apellido1: " + alumno.getApellido1()); // Imprime primer apellido del alumno
            System.out.println("Apellido2: " + alumno.getApellido2()); // Imprime el segundo apellido del alumno
            System.out.println("Fecha de nacimiento: " + alumno.getFecha_nacimiento()); // Imprime la fecha de nacimiento del alumno
            System.out.println("Es repetidor: " + alumno.getEs_repetidor()); // Imprime si el alumno es repetidor
            System.out.println("Telefono: " + alumno.getTelefono()); // Imprime el telefono del alumno
            System.out.println(); // Imprime una línea en blanco para separar los alumnos
		}
	}
}
