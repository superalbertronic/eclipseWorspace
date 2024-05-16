package ejerciciobasico;

public class Modelo {
//atributos
	private String nombre;
	private int edad;
	private String domicilio;
	//constructor
	public Modelo(String nombre, int edad, String domicilio) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio=domicilio;
	}
	
	//getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
