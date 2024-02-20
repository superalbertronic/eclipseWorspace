package seleccionFutbol;

public class Seleccion {
	
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public Seleccion(int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse");
	}
	
	public void viajar() {
		System.out.println("Viajar");
	}
	
}
