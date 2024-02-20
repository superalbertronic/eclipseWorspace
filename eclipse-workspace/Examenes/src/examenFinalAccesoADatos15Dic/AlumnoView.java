package examenFinalAccesoADatos15Dic;

import java.util.List;


public class AlumnoView {
    // Método para mostrar los alumnos en la vista
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId()); // Imprime el ID del alumno
            System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno
            System.out.println("Apellido 1: " + alumno.getApellido1()); // Imprime el apellido 1 del alumno
            System.out.println("Apellido 2: " + alumno.getApellido2()); // Imprime el apellido 2 del alumno
            System.out.println("Fecha: " + alumno.getFecha()); // Imprime la fecha
            System.out.println("Telefono: " + alumno.getTelefono()); // Imprimeel telefono
            System.out.println(); // Imprime una línea en blanco para separar los clientes
        }
    }
}