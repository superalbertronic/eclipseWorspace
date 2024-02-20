package mvc;

public class VideoJuego {

	// Variables de la clase
	private int idJuego;
	private String nombre;
	private int anio;
	private String compania;
	private float precio;
	private String sinopsis;
	private String plataforma;

	// Constructor de la clase.
	public VideoJuego(int idJuego, String nombre, int anio, String compania, float precio, String sinopsis,
			String plataforma) {
		super();
		this.idJuego = idJuego;
		this.nombre = nombre;
		this.anio = anio;
		this.compania = compania;
		this.precio = precio;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
	} // contr

	// Getters y setters.

	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

} // class
