package examenFinal1T;

import java.util.Date;
import java.util.List;


public class AlumnoView {
	public void mostrarA(List<Alumno> alumno) {
        for (Alumno alumno1 : alumno) {
    
            System.out.println("ID: " + alumno1.getId()); // Imprime el ID del cliente
            System.out.println("Nombre: " + alumno1.getNombre()); // Imprime el nombre del cliente
            System.out.println("Apellido1: " + alumno1.getApellido1()); 
            System.out.println("Apellido2: " + alumno1.getApellido2());
            System.out.println("Fecha_nacimiento: " + alumno1.getFecha_nacimiento());
            System.out.println("Es_repetidor: " + alumno1.getEs_repetidor());
            System.out.println("Teléfono: " + alumno1.getTeléfono());
            System.out.println(); // Imprime una línea en blanco para separar los alumnos
        }
	}
}	
