package clinicaherencia;


public class Pacientes extends Clinica {
	String nombrepaciente;
	
	public Pacientes(String nombre) {
		this.nombrepaciente=nombre;
		
	}

	@Override
	public String toString() {
		return "Pacientes  nombrepaciente=" + nombrepaciente;
	}
	
}
