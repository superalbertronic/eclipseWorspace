package MetodoMikel;

abstract class ClaseAbstracta {
    private String nombre;
    private String usuario;
    
    public ClaseAbstracta(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	    
    public abstract void Gracias(); // Método abstracto que debe ser implementado por las subclases
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Usuario: " + usuario;
    }
}
