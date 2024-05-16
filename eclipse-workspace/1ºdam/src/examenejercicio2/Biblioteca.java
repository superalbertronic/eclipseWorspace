package examenejercicio2;

public abstract class Biblioteca {
	private String nombre;
	  private String ubicacion;

	  public Biblioteca(String nombre, String ubicacion) {
	    this.nombre = nombre;
	    this.ubicacion = ubicacion;
	  }

	  public String getNombre() {
	    return nombre;
	  }

	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public String getUbicacion() {
	    return ubicacion;
	  }

	  public void setUbicacion(String ubicacion) {
	    this.ubicacion = ubicacion;
	  }

	  @Override
	  public String toString() {
	    return "Nombre: " + nombre + ", Ubicación: " + ubicacion;
	  }

	  public abstract void mostrarInformacion();

	  public abstract void prestar();

	  public abstract void devolver();
	}

