package modelovistacontrolador68;

import java.sql.Date;
//Datos de un Alumno
public class Alumno {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private String esRepetidor;
    private String telefono;
	
    //Constructor y Getters
    public Alumno(int id, String nombre, String apellido1, String apellido2, Date fechaNacimiento, String esRepetidor,
			String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.esRepetidor = esRepetidor;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEsRepetidor() {
		return esRepetidor;
	}

	public String getTelefono() {
		return telefono;
	}
    
    

 
}
