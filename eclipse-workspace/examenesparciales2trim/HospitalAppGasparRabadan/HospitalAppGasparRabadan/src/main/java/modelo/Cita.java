package modelo;

import java.sql.Date;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name ="citas")

public class Cita  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private int id_cita;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false)
	private Paciente id_paciente;
	
	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false)
	private Medico id_medico;

	public Cita() {
		
	}
	
	public Cita(Medico id_medico,Paciente id_paciente) {
		this.id_medico=id_medico;
		this.id_paciente=id_paciente;
		
	}

	@Override
	public String toString() {
		return "cita [id_cita=" + id_cita + ", id_cliente=" + id_paciente + ", id_medico=" + id_medico + "]";
	}
	
	
}