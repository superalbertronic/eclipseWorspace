package arraylist;

public class Gato {
	private String nombre;
	private String color;
	private String tipo;
	
	
	

	public Gato(String nombre, String color, String tipo) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Gato() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Color: " + this.color + ", Raza: " + this.tipo;
    }
	
	
}
