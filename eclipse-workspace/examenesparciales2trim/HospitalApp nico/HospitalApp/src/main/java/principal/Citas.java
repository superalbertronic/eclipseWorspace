package principal;

import javax.persistence.Table;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "hora")
	private String hora;

	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false)
	private Pacientes paciente;

	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false)
	private Medicos medico;

	public Citas() {
		super();
	}

	public Citas(String fecha, String hora, Pacientes paciente, Medicos medico) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
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

	@Override
	public String toString() {
		return "Citas [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", medico="
				+ medico + "]";
	}

}