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
	
    @ManyToOne
    @JoinColumn(name = "id_pacientes", nullable = false)
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "id_medicos", nullable = false)
    private Medico medico;
    
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "hora")
	private String hora;

	
	
	public Cita() {
		super();
	}



	public Cita(Paciente paciente, Medico medico, Date fecha, String hora) {
		super();
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



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Medico getMedico() {
		return medico;
	}



	public void setMedico(Medico medico) {
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
		return "Cita [id=" + id + "paciente=" + paciente + ", medico=" + medico + ", fecha="
				+ fecha + ", hora=" + hora + "]";
	}
		
	
}
