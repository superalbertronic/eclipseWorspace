package instituto;

public class Profesor extends Persona{

	
	
	public Profesor(String nombre, String asignaturas,String apellidos, int dni) {
		super(nombre, asignaturas, apellidos, dni);
		
		// TODO Esbozo de constructor generado automáticamente
	}

	
	public void MostrarDatos() {
		System.out.println("Usted es profesor " +getNombre()+ "apellidos " + 
				getApellidos()+ " su dni "+ getDni() +" su asignatura es "+
				getAsignaturas()+"su pago es ");
		
	};
	   
	public void Calendario() {
		super.Calendario();
		System.out.println("Bienvenido al curso señor profesor de Howards");
		
	}
	public void Pagar(int pago) {
		System.out.println(" su cobro es "+pago);
		
	}

}
