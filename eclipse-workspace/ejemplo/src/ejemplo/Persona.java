package ejemplo;
import java.lang.*;

public class Persona {
	private String nombre;
	public Persona(String nombre) {
			this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreApellido(String apellido) {
		return this.nombre +" "+apellido;
	}

	
	
	
}
