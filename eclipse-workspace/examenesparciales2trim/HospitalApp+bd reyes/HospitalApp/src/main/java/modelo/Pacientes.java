package modelo;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="pacientes")
public class Pacientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "historial")
	private String historial;
	
	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false)
	private Medicos medico;
	
	@ManyToOne
	@JoinColumn(name = "id_cita", nullable = false)
	private Citas cita;
	
	
	//Constructor por defecto requerido por Hibernate
	public Pacientes() {
		
	}


	public Pacientes(String nombre, String apellidos, String ciudad, String direccion, int telefono, int edad,
			String historial, Medicos medico, Citas cita) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
		this.historial = historial;
		this.medico = medico;
		this.cita = cita;
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


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHistorial() {
		return historial;
	}


	public void setHistorial(String historial) {
		this.historial = historial;
	}


	public Medicos getMedico() {
		return medico;
	}


	public void setMedico(Medicos medico) {
		this.medico = medico;
	}


	public Citas getCita() {
		return cita;
	}


	public void setCita(Citas cita) {
		this.cita = cita;
	}


	@Override
	public String toString() {
		return "Pacientes [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + ", historial=" + historial
				+ ", medico=" + medico + ", cita=" + cita + "]";
	}


	
	
}