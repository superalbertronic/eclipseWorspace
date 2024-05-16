package refactorizarmovermetodos;

public class TipoEmpleado {
	private String tipo;
	private double horabase;
	
	public TipoEmpleado(String tipo, double horabase) {
		super();
		this.tipo = tipo;
		this.horabase = horabase;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getHorabase() {
		return horabase;
	}
	
	public void setHorabase(double horabase) {
		this.horabase = horabase;
	}

	public double calculoHoras(int horas, int horasextra) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
}
