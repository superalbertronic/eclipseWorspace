package modeloVistaControlador;

import java.util.List;


public class AlumnoView {
	public void mostrarAlumno(List<Alumnos> alumnos) {
        for (Alumnos alumno : alumnos) {
        	System.out.println("Id: " + alumno.getId()); 
            System.out.println("Nombre: " + alumno.getNombre()); 
            System.out.println("Apellido 1: " + alumno.getApellido1()); 
            System.out.println("Apellido 2: " + alumno.getApellido2());             
            System.out.println("Fecha de nacimiento: " + alumno.getFecha_nacimiento());
            System.out.println("Es repetidor: " + alumno.getEs_repetidor());
            System.out.println("Telefono: " + alumno.getTelefono());
            System.out.println(); 
        }
	}
}
