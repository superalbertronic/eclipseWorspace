package clinicaherencia;


public class Medicos extends Clinica {
	String nombre;
	String especialidad;
	int consulta;
	
	public Medicos(String especialidad, String nombre) {
		this.nombre=nombre;
		this.especialidad=especialidad;
		this.fecha="12 de abril";
		this.hora="16.30";
		this.consulta= 1;
		
	}

	@Override
	public String toString() {
		return "Medicos [nombre=" + nombre + ", especialidad=" + especialidad + ", consulta=" + consulta + ", fecha="
				+ fecha + ", hora=" + hora + "]";
	}
	
}
