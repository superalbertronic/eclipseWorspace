package application;

import java.sql.Date;

public class Estudiante {
    private Integer id;
    private String nombre;
    private String correoElectronico;
    private String telefono;
    private String curso;
    private java.sql.Date fechaInscripcion;
	public Estudiante(Integer id, String nombre, String correoElectronico, String telefono, String curso,
			Date fechaInscripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
		this.curso = curso;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public Estudiante() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public java.sql.Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(java.sql.Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

    
}
