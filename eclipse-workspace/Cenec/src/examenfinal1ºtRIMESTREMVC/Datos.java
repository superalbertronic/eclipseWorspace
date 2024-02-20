package examenfinal1ºtRIMESTREMVC;

public class Datos {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fecha_nacimiento;
	private String es_repetido;
	private int telefono;
	
	public Datos(int id, String nombre, String apellido1, String apellido2, String fecha_nacimiento,
			String es_repetido, int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fecha_nacimiento = fecha_nacimiento;
		this.es_repetido = es_repetido;
		this.telefono = telefono;
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String isEs_repetido() {
		return es_repetido;
	}

	public void setEs_repetido(String es_repetido) {
		this.es_repetido = es_repetido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
