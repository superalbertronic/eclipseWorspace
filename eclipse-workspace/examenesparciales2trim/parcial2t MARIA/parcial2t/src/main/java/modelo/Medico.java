package modelo;

import javax.persistence.*;

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
	
	// Constructor por defecto requerido por Hibernate:
	public Medico() {
		
	}

	// Constructor para crear un objeto de tipo Medico con un nombre, apellidos y especialidad específicos:
	public Medico(String nombre, String apellidos, String especialidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
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
		
	// Getter y setter para el atributo especialidad:
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	// Método para imprimir información del objeto paciente:
	 @Override
	 public String toString() {
	 	return "Paciente {" + "id = " + id 
	 			+ ", " + "nombre = '" + nombre 
	 			+ "', " + "apellidos = '" + apellidos 
	 			+ "', " + "especialidad = '" + especialidad + "'}";
	 }
}