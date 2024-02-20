package modelo;

import javax.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medicos")
	private int id_medicos;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "especialidad")
	private String especialidad;

	public Medico() {

	}

	public Medico(String nombre, String apellidos, String especialidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

	public int getId_medicos() {
		return id_medicos;
	}

	public void setId_medicos(int id_medicos) {
		this.id_medicos = id_medicos;
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

	@Override
	public String toString() {
		return "Medico [id_medicos=" + id_medicos + ", nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\''
				+ ", especialidad='" + especialidad + '\'' + "]";
	}

}
