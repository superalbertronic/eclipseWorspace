package modelVistaControlador9;

import java.util.List;

public class AlumnoView {
    public void mostrarAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("ID: " + alumno.getId());
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellido1() + " " + alumno.getApellido2());
            System.out.println("Fecha de Nacimiento: " + alumno.getFechaNacimiento());
            System.out.println("Es Repetidor: " + alumno.getEsRepetidor());
            System.out.println("Teléfono: " + alumno.getTelefono());
            System.out.println("-------------------");
        }
    }
}
