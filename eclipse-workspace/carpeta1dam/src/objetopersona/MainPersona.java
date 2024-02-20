/**
 * persona
 * main de la clase persona
 * @author Alberto Ruiz
 */


package objetopersona;
import java.util.Objects;


import objetopersona.Persona;
public class MainPersona {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Persona person= new Persona();
	
		
		person.setEdad(25);
		person.setNombre("Alberto");
		
		
		
		String MostrarNombre=person.getNombre();
		int MostrarEdad=person.getEdad();
		
		System.out.println("Su nombres es "+MostrarNombre + " su edad es "+MostrarEdad);
				   
		
	}

}
