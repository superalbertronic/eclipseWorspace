package modelo;

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
	private int edad;

	@Column(name = "historial")
	private String historial;

	// Constructor por defecto requerido por Hibernate:
	public Paciente() {
		
    }

	// Constructor para crear un objeto de tipo Paciente con un nombre, apellidos, ciudad, dirección,
	// teléfono, edad e histotral específicos:
	public Paciente(String nombre, String apellidos, String ciudad, String direccion, String telefono, 
			int edad, String historial) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.edad = edad;
		this.historial = historial;
    }
	
	// Getter y setter para el atributo id:
	public int getId() {
	 	return id;
	}

	public void setId(int id) {
	 	this.id = id;
	}
	 
	// Getter y setter para el atributo nombre:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Getter y setter para el atributo apellidos:
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	// Getter y setter para el atributo ciudad:
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	// Getter y setter para el atributo direccion:
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	// Getter y setter para el atributo telefono:
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	// Getter y setter para el atributo edad:
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Getter y setter para el atributo historial:
	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}
	
	// Método para imprimir información del objeto paciente:
 	@Override
 	public String toString() {
 		return "Paciente {" + "id = " + id 
 				+ ", " + "nombre = '" + nombre 
 				+ "', " + "apellidos = '" + apellidos 
 				+ "', " + "ciudad = '" + ciudad 
 				+ "', " + "direccion = '" + direccion 
 				+ "', " + "telefono = '" + telefono 
 				+ "', " + "edad = " + edad  
 				+ ", " + "historial = '" + historial + "'}";
 	}
}