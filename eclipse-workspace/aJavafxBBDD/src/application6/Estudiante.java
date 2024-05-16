package ParcialInterfacesJoseMartinMartinez;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty Nombre = new SimpleStringProperty();
	private StringProperty correo_electronico = new SimpleStringProperty();
	private StringProperty telefono = new SimpleStringProperty();
	private StringProperty curso = new SimpleStringProperty();
	private DateProperty fecha_inscripcion = new SimpleDateProperty();

	public Estudiante(int id, String Nombre, String correo_electronico, String telefono, String curso, Date fecha_inscripcion) {
		this.id.set(id);
		this.Nombre.set(Nombre);
		this.correo_electronico.set(correo_electronico);
		this.telefono.set(telefono);
		this.curso.set(curso);
		this.fecha_inscripcion.set(fecha_inscripcion);
	}

	public IntegerProperty getId() {
		return id;
	}

	public void setId(IntegerProperty id) {
		this.id = id;
	}

	public StringProperty getNombre() {
		return Nombre;
	}

	public void setNombre(StringProperty nombre) {
		Nombre = nombre;
	}

	public StringProperty getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(StringProperty correo_electronico) {
		this.correo_electronico = correo_electronico;
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

	public DateProperty getFecha_inscripcion() {
		return fecha_inscripcion;
	}

	public void setFecha_inscripcion(DateProperty fecha_inscripcion) {
		this.fecha_inscripcion = fecha_inscripcion;
	}
	
}