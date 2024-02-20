package abstracta;

public abstract class Sueldos {
	
	private String nombre;
    private String puesto;
    private double salario;
    private String mes;
    
    

	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Sueldos(String nombre, String puesto, double salario, String mes) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
		this.mes=mes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	    public double calcularSalario() {
	        return 0;}
	    
	    public double Irpf() {
	    	
	        return 0; 
	    }
		public double MostrarDividendo() {
			// TODO Esbozo de método generado automáticamente
			return 0;
		}

	
}
