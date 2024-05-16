package refactorizarmovermetodos;

public class TipoEmpleadoRefactorizado {
    private String tipo;
    private double horaBase;
    
    public TipoEmpleadoRefactorizado(String tipo, double horaBase) {
        this.tipo = tipo;
        this.horaBase = horaBase;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getHoraBase() {
        return horaBase;
    }
    
    public void setHoraBase(double horaBase) {
        this.horaBase = horaBase;
    }

	public double calculoHoras(double horas, double horasextra) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
}

