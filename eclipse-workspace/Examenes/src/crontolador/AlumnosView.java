package crontolador;

import java.util.List;

public class AlumnosView {
    // Método para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumnos> alumno) {
        for (Alumnos alumnos : alumno) {
            System.out.println("ID: " + alumnos.getId()); // Imprime el ID del alumno
            System.out.println("Nombre: " + alumnos.getNombre()); // Imprime el NIF del alumno
            System.out.println("Apellido 1: " + alumnos.getApellido1()); // Imprime el nombre del alumno
            System.out.println("Apellido 2: " + alumnos.getApellido2()); // Imprime la edad del alumno
            System.out.println("Fecha nacimiento: " + alumnos.getFecha_nacimiento());
            System.out.println("Repetidor: " + alumnos.getEs_repetidor());
            System.out.println("Teléfono: " + alumnos.getTeléfono());
            
            System.out.println(); // Imprime una línea en blanco para separar los alumnos
        }
    }
}
