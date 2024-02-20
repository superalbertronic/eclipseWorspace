package paquete;

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
@Table(name = "Paciente")

public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "telefono")
	private int telefono;

	@Column(name = "historial")
	private String historial;
	
	public Paciente() {
	}

	public Paciente(String nombre, String apellidos, String direccion, String ciudad, int edad, int telefono, String historial) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.edad = edad;
		this.telefono = telefono;
		this.historial = historial;
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
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int teléfono) {
		this.telefono = teléfono;
	}
	
	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}
	
	@Override
	public String toString() {
		return "Pacientes: " + "id= " + id + ", nombre= " + nombre + ", apellidos= " + apellidos + ", direccion= " + direccion + ", ciudad= " + ciudad + ", edad= " + edad + ", teléfono= " + telefono + ", historial= " + historial + '\'';
	}
}