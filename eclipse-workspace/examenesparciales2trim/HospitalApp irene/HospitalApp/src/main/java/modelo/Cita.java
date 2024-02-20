package modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_citas")
	private int id_citas;

	@ManyToOne
	@JoinColumn(name = "id_pacientes", nullable = false)
	private Paciente id_pacientes;

	@ManyToOne
	@JoinColumn(name = "id_medicos", nullable = false)
	private Medico id_medicos;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "hora")
	private String hora;

	public Cita() {

	}

	public Cita(Paciente id_pacientes, Medico id_medicos, Date fecha, String hora) {
		this.id_pacientes = id_pacientes;
		this.id_medicos = id_medicos;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getId_citas() {
		return id_citas;
	}

	public void setId_citas(int id_citas) {
		this.id_citas = id_citas;
	}

	public Paciente getId_pacientes() {
		return id_pacientes;
	}

	public void setId_pacientes(Paciente id_pacientes) {
		this.id_pacientes = id_pacientes;
	}

	public Medico getId_medicos() {
		return id_medicos;
	}

	public void setId_medicos(Medico id_medicos) {
		this.id_medicos = id_medicos;
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
		return "Cita [id_citas=" + id_citas + ", id_pacientes=" + id_pacientes + ", id_medicos=" + id_medicos
				+ ", fecha=" + fecha + ", hora='" + hora + '\'' + "]";
	}

}
