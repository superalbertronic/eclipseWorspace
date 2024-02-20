package modeloVistaControlador69;

import java.util.List;

import modeloVistaControlador69.Alumno;



public class AlumnoView {
	 // M�todo para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId()); // Imprime el ID del alumno
            System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno
            System.out.println("apellido1: " + alumno.getApellido1()); // Imprime la apellido1 del alumno
            System.out.println("apellido2: " + alumno.getApellido2()); // Imprime la apellido2 del alumno
            System.out.println("fecha_nacimiento: " + alumno.getFecha_nacimiento()); // Imprime la es_repetidor del alumno
            System.out.println("es_repetidor: " + alumno.getEs_repetidor()); // Imprime la edad del alumno
            System.out.println("telefono: " + alumno.getTelefono()); // Imprime la telefono del alumno
            System.out.println(); // Imprime una l�nea en blanco para separar los alumnos
        }
    }
}
