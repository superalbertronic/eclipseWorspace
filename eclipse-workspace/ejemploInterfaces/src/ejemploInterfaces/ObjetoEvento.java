package ejemploInterfaces;

public class ObjetoEvento {
	private Object origen;
	private String nombrePropiedad;
	private String valorPropiedad;
	private String anteriorPropiedad;
	
	public ObjetoEvento(Object origen ,String nombrePropiedad, String valorPropiedad,String anteriorPropiedad){
		this.origen = origen;
		this.nombrePropiedad = nombrePropiedad;
		this.valorPropiedad = valorPropiedad;
		this.anteriorPropiedad = anteriorPropiedad;
	}

	public Object getOrigen() {
		return origen;
	}

	public String getNombrePropiedad() {
		return nombrePropiedad;
	}

	public String getValorPropiedad() {
		return valorPropiedad;
	}

	public String getAnteriorPropiedad() {
		return anteriorPropiedad;
	}
}
