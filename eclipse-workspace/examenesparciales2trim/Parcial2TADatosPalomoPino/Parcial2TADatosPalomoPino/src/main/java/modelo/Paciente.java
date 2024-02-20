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
	private String telefono;
	
	@Column(name = "edad")
	private String edad;
	
	@Column(name = "historial")
	private String historial;
	
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Cita> cita = new ArrayList<>();

	
    public Paciente() {
		super();
	}
    
    
    
	public Paciente(int id) {
		super();
		this.id = id;
	}



	public Paciente(int id,String nombre, String apellidos, String ciudad, String direccion, String telefono, String edad,
			String historial) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
		this.historial = historial;
		this.cita = cita;
	}
    
	public Paciente(String nombre, String apellidos, String ciudad, String direccion, String telefono, String edad,
			String historial) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
		this.historial = historial;
		this.cita = cita;
	}


	public Paciente(String nombre, String apellidos, String ciudad, String direccion, String telefono, String edad,
			String historial, List<Cita> cita) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
		this.historial = historial;
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getHistorial() {
		return historial;
	}


	public void setHistorial(String historial) {
		this.historial = historial;
	}


	public List<Cita> getCita() {
		return cita;
	}


	public void setCita(List<Cita> cita) {
		this.cita = cita;
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", edad=" + edad + ", historial=" + historial
				+ ", cita=" + cita + "]";
	}
    
    
    
	
}