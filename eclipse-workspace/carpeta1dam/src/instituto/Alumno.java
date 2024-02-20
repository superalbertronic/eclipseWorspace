package instituto;

public class Alumno extends Persona{
	private int puntos;
	
	public Alumno(String nombre, String asignaturas, String apellidos, int dni) {
		super(nombre, asignaturas, apellidos, dni);
		// TODO Esbozo de constructor generado automáticamente
	}
    @Override 
	public void MostrarDatos() {
		System.out.println("Usted es alumno " +getNombre()+ "apellidos " + 
				getApellidos()+ " su dni "+ getDni() +" su asignatura es "+
				getAsignaturas());
		
	};
	@Override   
	public void Calendario() {
		super.Calendario();
		System.out.println("Bienvenido al curso Alumno de Gryfindor");
		
	}
	public void Nota(int puntos) {
		System.out.println(" su nota es "+puntos);
		
	}

}
