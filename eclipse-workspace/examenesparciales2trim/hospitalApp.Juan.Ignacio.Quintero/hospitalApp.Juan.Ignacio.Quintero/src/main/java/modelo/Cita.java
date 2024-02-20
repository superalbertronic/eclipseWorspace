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
@Table (name="citas")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false)
	private Pacientes paciente;
	
	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false)
	private Medicos medico;
	
	@Column(name ="fecha")
	private Date fecha;
	
	@Column(name ="hora")
	private String hora;

	public Cita() {}

	public Cita(Pacientes paciente, Medicos medico, Date fecha, String hora) {
		super();
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	
	public Cita(int id, Pacientes paciente, Medicos medico, Date fecha, String hora) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}

	public Medicos getMedico() {
		return medico;
	}

	public void setMedico(Medicos medico) {
		this.medico = medico;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Cita [id=" + id + ", paciente=" + paciente + ", medico=" + medico + ", fecha=" + fecha + ", hora="
				+ hora + "]";
	}
	
	
	
	
}
