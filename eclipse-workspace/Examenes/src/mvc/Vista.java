package mvc;
import java.util.List;


import java.sql.Connection;


public class Vista {
    // Método para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId()); // Imprime el ID del alumno
            System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno
            System.out.println("Apellido1: " + alumno.getApellido1()); // Imprime el ID del alumno
            System.out.println("Apellido2: " + alumno.getApellido2()); // Imprime el ID del alumno
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento()); // Imprime el ID del alumno
            System.out.println("Es repetidor: " + alumno.getEsRepetidor()); // Imprime el ID del alumno
            System.out.println("Teléfono: " + alumno.getTelefono()); // Imprime el ID del alumno
            System.out.println(); // Imprime una línea en blanco para separar los alumno
        }
    }
}
