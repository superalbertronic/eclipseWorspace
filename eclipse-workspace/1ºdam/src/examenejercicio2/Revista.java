package examenejercicio2;

public class Revista extends Biblioteca{
	private String issn;
	  private int numeroPublicacion;
	  private String fechaPublicacion;

	  public Revista(String nombre, String ubicacion, String issn, int numeroPublicacion, String fechaPublicacion) {
	    super(nombre, ubicacion);
	    this.issn = issn;
	    this.numeroPublicacion = numeroPublicacion;
	    this.fechaPublicacion = fechaPublicacion;
	  }

	  public String getIssn() {
	    return issn;
	  }

	  public void setIssn(String issn) {
		    this.issn = issn;
		  }

		  public int getNumeroPublicacion() {
		    return numeroPublicacion;
		  }

		  public void setNumeroPublicacion(int numeroPublicacion) {
		    this.numeroPublicacion = numeroPublicacion;
		  }

		  public String getFechaPublicacion() {
		    return fechaPublicacion;
		  }

		  public void setFechaPublicacion(String fechaPublicacion) {
		    this.fechaPublicacion = fechaPublicacion;
		  }

		  @Override
		  public void mostrarInformacion() {
		    System.out.println("**Revista:**");
		    System.out.println(super.toString());
		    System.out.println("ISSN: " + issn);
		    System.out.println("Número de publicación: " + numeroPublicacion);
		    System.out.println("Fecha de publicación: " + fechaPublicacion);
		  }

		  @Override
		  public void prestar() {
		    System.out.println("Revista prestada");
		  }

		  @Override
		  public void devolver() {
		    System.out.println("Revista devuelta");
		  }
		}
