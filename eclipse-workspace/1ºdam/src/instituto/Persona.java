package instituto;

public abstract class Persona {
	private String nombre;
	private String asignaturas;
	private String apellidos;
	private int dni;
	
	public Persona(String nombre, String asignaturas, String apellidos, int dni) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas;
		this.apellidos=apellidos;
		this.dni=dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
		
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	abstract public void MostrarDatos();
	   
	public void Calendario() {
		System.out.println("El calendario escolar del curso 2022-2023");
		
	}
	
	
	
	
}
