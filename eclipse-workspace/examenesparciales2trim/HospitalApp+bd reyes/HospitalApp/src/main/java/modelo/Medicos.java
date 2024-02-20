package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="medicos")
public class Medicos {
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
	
	@OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
	private List<Pacientes> pacientes = new ArrayList<>();
	
	@OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
	private List<Citas> citas = new ArrayList<>();
	
	
	//Constructor por defecto requerido por Hibernate
	public Medicos() {
		
	}


	public Medicos(String nombre, String apellidos, String especialidad, List<Pacientes> pacientes, List<Citas> citas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.pacientes = pacientes;
		this.citas = citas;
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


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public List<Pacientes> getPacientes() {
		return pacientes;
	}


	public void setPacientes(List<Pacientes> pacientes) {
		this.pacientes = pacientes;
	}


	public List<Citas> getCitas() {
		return citas;
	}


	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}


	@Override
	public String toString() {
		return "Medicos [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", especialidad="
				+ especialidad + ", pacientes=" + pacientes + ", citas=" + citas + "]";
	}


}

	