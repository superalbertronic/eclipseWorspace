package examenejercicio2;

public class Video extends Biblioteca{
	 private int duracion;
	  private String director;
	  private String genero;

	  public Video(String nombre, String ubicacion, int duracion, String director, String genero) {
	    super(nombre, ubicacion);
	    this.duracion = duracion;
	    this.director = director;
	    this.genero = genero;
	  }

	  public int getDuracion() {
	    return duracion;
	  }

	  public void setDuracion(int duracion) {
	    this.duracion = duracion;
	  }

	  public String getDirector() {
	    return director;
	  }

	  public void setDirector(String director) {
	    this.director = director;
	  }

	  public String getGenero() {
	    return genero;
	  }

	  public void setGenero(String genero) {
	    this.genero = genero;
	  }

	  @Override
	  public void mostrarInformacion() {
	    System.out.println("**V�deo:**");
	    System.out.println(super.toString());
	    System.out.println("Duraci�n: " + duracion + " minutos");
	    System.out.println("Director: " + director);
	    System.out.println("G�nero: " + genero);
	  }

	  @Override
	  public void prestar() {
	    System.out.println("V�deo prestado");
	  }

	  @Override
	  public void devolver() {
	    System.out.println("V�deo devuelto");
	  }
	}

