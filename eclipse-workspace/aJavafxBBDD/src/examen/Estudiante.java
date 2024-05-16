package examen;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty correo = new SimpleStringProperty();
	private StringProperty telefono = new SimpleStringProperty();
	private StringProperty curso = new SimpleStringProperty();
	private StringProperty fecha = new SimpleStringProperty();
	
	
	public Estudiante(String nombre, String correo, String telefono, String curso,
			String fecha) {
		super();
		this.nombre.set(nombre);
		this.correo.set(correo);
		this.telefono.set(telefono);
		this.curso.set(curso);
		this.fecha.set(fecha);
	}


	public StringProperty getNombre() {
		return nombre;
	}


	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}


	public StringProperty getCorreo() {
		return correo;
	}


	public void setCorreo(StringProperty correo) {
		this.correo = correo;
	}


	public StringProperty getTelefono() {
		return telefono;
	}


	public void setTelefono(StringProperty telefono) {
		this.telefono = telefono;
	}


	public StringProperty getCurso() {
		return curso;
	}


	public void setCurso(StringProperty curso) {
		this.curso = curso;
	}


	public StringProperty getFecha() {
		return fecha;
	}


	public void setFecha(StringProperty fecha) {
		this.fecha = fecha;
	}
	
	
	
}
