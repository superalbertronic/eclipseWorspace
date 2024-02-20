package ejerciciosbasicossuperclases; 

public class Nominas {
	protected String nombre;
	protected String apellido;
	protected String DNI;
	protected double sueldo;
	protected String puesto;
	
	public Nominas() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

	@Override
	public String toString() {
		return "Puesto " +puesto+ " [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", sueldo=" + sueldo + "]";
	}
	
}
