package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "id_paciente")
	private int id_paciente;
	@Column(name = "id_medico")
	private int id_medico;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "hora")
	private String hora;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId_medico() {
		return id_medico;
	}

	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
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

	public Cita(int id_paciente, int id_medico, String fecha, String hora) {
		super();
		this.id_paciente = id_paciente;
		this.id_medico = id_medico;
		this.fecha = fecha;
		this.hora = hora;
	} // c

	public Cita() {
	} // c

	@Override
	public String toString() {
		return "Cita [id=" + id + ", id_paciente=" + id_paciente + ", id_medico=" + id_medico + ", fecha=" + fecha
				+ ", hora=" + hora + ", getId()=" + getId() + ", getId_paciente()=" + getId_paciente()
				+ ", getId_medico()=" + getId_medico() + ", getFecha()=" + getFecha() + ", getHora()=" + getHora()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	} // toS

} // class
