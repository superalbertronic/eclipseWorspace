package Examen;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora")
    private String hora;

    public Cita() {

    }

    public Cita(Paciente paciente, Medico medico, Date fecha, String hora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y setters
   

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
	        return "Cita{" +
	                "id=" + id +
	                ", paciente=" + paciente +
	                ", medico=" + medico +
	                ", fecha=" + fecha +
	                ", hora='" + hora + '\'' +
	                '}';
	    }

	
}
