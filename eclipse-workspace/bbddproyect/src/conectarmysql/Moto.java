package conectarmysql;

public class Moto extends Vehiculo{
	private String casco;
	private int ruedas;
	private String accesorio;
	
	public Moto(String nombre, int precio, int caballos, String tipo, String casco, int ruedas, String accesorio) {
		super(nombre, precio, caballos, tipo);
		this.casco = casco;
		this.ruedas = ruedas;
		this.accesorio = accesorio;
	}
	public String getCasco() {
		return casco;
	}
	public void setCasco(String casco) {
		this.casco = casco;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public String getAccesorio() {
		return accesorio;
	}
	public void setAccesorio(String accesorio) {
		this.accesorio = accesorio;
	}
	@Override
	public String toString() {
		return "Moto [Nombre=" + getNombre() + ", Precio=" + getPrecio() + ", Caballos=" + getCaballos() + "Casco=" + getCasco() + ", Ruedas=" + getRuedas() + ", Accesorio=" + getAccesorio()
				+ "]";
	}
	
	
}
