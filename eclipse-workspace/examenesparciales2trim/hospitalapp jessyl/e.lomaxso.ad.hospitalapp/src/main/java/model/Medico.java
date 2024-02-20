package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "especialidad")
	private String especialidad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
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

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Medico(String nombre, String apellidos, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	} // c

	public Medico() {
	} // c

	@Override
	public String toString() {
		return "Medico [Id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad=" + especialidad
				+ "]";
	}
	
	

} // class
