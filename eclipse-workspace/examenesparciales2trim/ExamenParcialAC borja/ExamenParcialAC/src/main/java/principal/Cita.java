package principal;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;
    
    private Date fecha;
    private String hora;


    public Cita() {
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
    public void mostrarInf() {
        System.out.println("ID: " + this.id);
        System.out.println("Paciente: " + this.paciente.getNombre() + " " + this.paciente.getApellidos());
        System.out.println("Médico: " + this.medico.getNombre() + " " + this.medico.getApellidos());
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
    }

}
