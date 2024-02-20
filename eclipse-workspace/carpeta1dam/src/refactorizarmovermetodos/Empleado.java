package refactorizarmovermetodos;


public class Empleado{
	private TipoEmpleado tipo;
	private int horas;
	private int horasextra;
	
	public double calculoHoras() {		
		if (getTipo().getTipo().equals("Supervisor")) {
			return getHoras() * getTipo().getHorabase() + getHorasextra() * 1.40;
		}
		if (getTipo().getTipo().equals("Dependiente")) {
			return getHoras() * getTipo().getHorabase() + getHorasextra() * 1.75;
		}
		return getHoras() * getTipo().getHorabase() + getHorasextra() * 1.5;
	}
	
	public double getSueldo() {
		return getTipo().getHorabase() * calculoHoras();
	}

	public TipoEmpleado getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getHorasextra() {
		return horasextra;
	}

	public void setHorasextra(int horasextra) {
		this.horasextra = horasextra;
	}
}