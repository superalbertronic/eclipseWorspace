package conectarmysql;

public class Coche extends Vehiculo {
	private int puertas;
	private String bola;
	private String ayuda;
	
	public Coche(String nombre, int precio, int caballos, String tipo, int puertas, String bola, String ayuda) {
		super(nombre, precio, caballos, tipo);
		this.puertas = puertas;
		this.bola = bola;
		this.ayuda = ayuda;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getBola() {
		return bola;
	}

	public void setBola(String bola) {
		this.bola = bola;
	}

	public String getAyuda() {
		return ayuda;
	}

	public void setAyuda(String ayuda) {
		this.ayuda = ayuda;
	}

	@Override
	public String toString() {
		return "Coche [Nombre "+ getNombre() + "| Precio" + getPrecio() + "| Caballos" + getCaballos()+ "| Tipo=" + getTipo() + "Puertas=" + getPuertas() + "| Bola=" + getBola() + "| Ayuda=" + getAyuda()+ "]";
	}
	
	}
	

