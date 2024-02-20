package alumnos;

public class Gato {

	private String nombre;
	private String color;
	private String tipo;
	private int edad;
	private String pelaje;
	
	
	public Gato(String nombre, String color, String tipo, int edad, String pelaje) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tipo = tipo;
		this.edad = edad;
		this.pelaje = pelaje;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPelaje() {
		return pelaje;
	}


	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}


	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", tipo=" + tipo + ", edad=" + edad + ", pelaje="
				+ pelaje + "]";
	}
	
	

}
