package examen1trimestre;

import java.util.List;

public class AlumnoView {
	// Método para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Id: " + alumno.getId());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido1: " + alumno.getApellido1());
            System.out.println("Apellido2: " + alumno.getApellido2()); 
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento());
            System.out.println("Es Repetidor: " + alumno.getEsRepetidor());
            System.out.println("Telefono: " + alumno.getTelefono());

            System.out.println("\n");
        }
    }
}
