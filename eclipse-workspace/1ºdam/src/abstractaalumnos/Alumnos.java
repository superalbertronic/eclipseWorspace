package abstractaalumnos;

public class Alumnos extends Notas {

	public Alumnos(String nombre, String asignaturas, String alumnos, int notas) {
		super(asignaturas, asignaturas, notas);
		this.nombre = nombre;
		this.asignaturas = asignaturas;
		this.notas = notas;
	}

	@Override
	//defines aprobado o suspenso
	String resultado() {
        
		return (notas<=5)?"suspenso":"aprobado";
	}
	@Override
	//metodo o procedimiento que muestra los alumnos, asignaturas y notas.
	void mostrar() {
        
	      System.out.println("El alumno " + nombre +" "+ asignaturas + " con un " + notas +" esta " +resultado());
	 
	
	}



}
