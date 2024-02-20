package conectarmysql;

public abstract class Vehiculo {
	private String nombre;
	private String tipo;
	private int precio;
	private int caballos;
	
	public Vehiculo(String nombre, int precio, int caballos,String tipo) {
		super();
		this.nombre = nombre;
		this.tipo=tipo;
		this.precio = precio;
		this.caballos = caballos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
