package examenejercicio2;

public class Libro extends Biblioteca{
	  private String isbn;
	  private String autor;
	  private int numeroPaginas;

	  public Libro(String nombre, String ubicacion, String isbn, String autor, int numeroPaginas) {
	    super(nombre, ubicacion);
	    this.isbn = isbn;
	    this.autor = autor;
	    this.numeroPaginas = numeroPaginas;
	  }

	  public String getIsbn() {
	    return isbn;
	  }

	  public void setIsbn(String isbn) {
	    this.isbn = isbn;
	  }

	  public String getAutor() {
	    return autor;
	  }

	  public void setAutor(String autor) {
	    this.autor = autor;
	  }

	  public int getNumeroPaginas() {
	    return numeroPaginas;
	  }

	  public void setNumeroPaginas(int numeroPaginas) {
	    this.numeroPaginas = numeroPaginas;
	  }

	  @Override
	  public void mostrarInformacion() {
	    System.out.println("**Libro:**");
	    System.out.println(super.toString());
	    System.out.println("ISBN: " + isbn);
	    System.out.println("Autor: " + autor);
	    System.out.println("Número de páginas: " + numeroPaginas);
	  }

	  @Override
	  public void prestar() {
	    System.out.println("Libro prestado");
	  }

	  @Override
	  public void devolver() {
	    System.out.println("Libro devuelto");
	  }
	}

