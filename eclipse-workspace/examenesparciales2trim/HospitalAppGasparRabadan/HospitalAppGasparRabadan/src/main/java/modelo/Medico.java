package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name ="medicos")

public class Medico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_medico")
	private int id_medico;
	
	@Column(name="nombre_medico")
	private String nombre_medico;
	
	@Column(name ="apellidos")
	private String apellidos;

	@Column(name ="especialidad")
	private String especialidad;

	@OneToMany(mappedBy = "id_paciente", cascade = CascadeType.ALL)
    private List<Paciente> paciente = new ArrayList<>();
	
	public Medico() {
		
	}
	
	public Medico(String nombre_medico,String apellidos,String especialidad) {
		
		this.nombre_medico=nombre_medico;
		this.apellidos=apellidos;
		this.especialidad=especialidad;
		
		
	}

	
	@Override
	public String toString() {
		return "medico [id_medico=" + id_medico + ", nombre_medico='" + nombre_medico + '\''+", apellidos='" + apellidos
				+ '\''+ "especialidad='"+ especialidad +'\''+ "]";
	}
	
	

	
}
