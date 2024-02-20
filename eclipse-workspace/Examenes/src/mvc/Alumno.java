package mvc;

import java.sql.Date;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fechaNacimiento;
    private boolean repetidor; //Como que enum???? por favor
    private int telefono; //Realmente debería de ser String o al menos long, aunque esto sirve para todos los números españoles, supongo...
	public Alumno(int id, String nombre, String apellido1, String apellido2, Date fechaNacimiento, boolean repetidor,
			int telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.repetidor = repetidor;
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
	public boolean isRepetidor() {
		return repetidor;
	}
	public int getTelefono() {
		return telefono;
	}
    

}
