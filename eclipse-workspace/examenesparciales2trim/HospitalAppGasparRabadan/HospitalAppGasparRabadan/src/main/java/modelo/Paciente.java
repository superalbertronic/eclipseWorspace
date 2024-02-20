package modelo;

import java.sql.Date;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "pacientes")

public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int id_paciente;

	@Column(name = "nombre_paciente")
	private String nombre_paciente;

	@Column(name = "apellidos")
	private String apellidos;

	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "edad")
	private int edad;

	@Column(name = "historial")
	private String historial;

	public Paciente() {

	}

	public Paciente(String nombre_paciente,String apellidos,String ciudad,String direccion,String telefono,int edad,String historial) {
	
		this.nombre_paciente=nombre_paciente;
		this.apellidos=apellidos;
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.telefono=telefono;
		this.edad=edad;
		this.historial=historial;

	}
	
	
	
	


	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getNombre_paciente() {
		return nombre_paciente;
	}

	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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

	@Override
	public String toString() {
		return "paciente [id_paciente=" + id_paciente + ", nombre_paciente='" + nombre_paciente + '\'' + ", apellidos='"
				+ apellidos + '\'' + ", ciudad='" + ciudad + '\'' + ", direccion='"+direccion+'\''+", telefono='"+telefono+'\''+", edad="+edad+", historial='"+historial+'\'' + "]";
	}

}
