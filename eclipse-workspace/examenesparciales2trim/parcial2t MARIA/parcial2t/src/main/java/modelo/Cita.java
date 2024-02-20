package modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_paciente")
	private int idPaciente;
	
	@Column(name = "id_medico")
	private int idMedico;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private String hora;
	
	// Constructor por defecto requerido por Hibernate:
	public Cita() {
		
	}

	// Constructor para crear un objeto de tipo Cita con un id de paciente, id de médico, fecha y hora 
	// específicos:
	public Cita(int idPaciente, int idMedico, Date fecha, String hora) {
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	// Getter y setter para el atributo idPaciente:
	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	// Getter y setter para el atributo idMedico:
	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
	// Getter y setter para el atributo fecha:
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
			 
	// Getter y setter para el atributo hora:
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	// Método para imprimir información del objeto paciente:
	@Override
	public String toString() {
		return "Cita {" + "id = " + id 
				+ ", " + " id_paciente = " + idPaciente  
		 		+ ", " + "id_medico = " + idMedico 
		 		+ ", " + "fecha = '" + fecha  
		 		+ "', " + "hora = '" + hora + "'}";
	}
}