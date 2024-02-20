package clinicaherencia;

public  class Clinica {
	protected String fecha;
	protected String hora;
	protected int consulta;
	
	
	public Clinica(String paciente, String consulta, String fecha, String hora) {
		
	}
	public Clinica() {
		
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


	public int getConsulta() {
		return consulta;
	}


	public void setConsulta(int consulta) {
		this.consulta = consulta;
	}


	@Override
	public String toString() {
		return "Clinica [fecha=" + fecha + ", hora=" + hora + ", consulta=" + consulta + "]";
	}

}
