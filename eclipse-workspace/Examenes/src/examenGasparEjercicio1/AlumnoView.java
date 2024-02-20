package examenGasparEjercicio1;

import java.util.List;

public class AlumnoView {
	
	public void mostrarAlumnos(List<Alumno>alumnos){
		
		for(Alumno alumno:alumnos) {
			System.out.println("ID:"+alumno.getId())/*Te imprime el ID del  alumno*/;
			System.out.println("Nombre"+alumno.getNombre())/*Te imprime el ID del  alumno*/;
			System.out.println("Apellido1:"+alumno.getApellido1())/*Te imprime el ID del  alumno*/;
			System.out.println("Apellido2:"+alumno.getApellido2())/*Te imprime el ID del  alumno*/;
			System.out.println("fecha_nacimiento:"+alumno.getFecha_nacimiento())/*Te imprime el ID del  alumno*/;
			System.out.println("es_repetidor:"+alumno.getEs_repetidor())/*Te imprime el ID del  alumno*/;
			System.out.println("telefono:"+alumno.getClass())/*Te imprime el ID del  alumno*/;
			System.out.println(" ")/* Ponemos un espacio para que quede todo mas bonito*/;
			
			
		}
		
	}

}
