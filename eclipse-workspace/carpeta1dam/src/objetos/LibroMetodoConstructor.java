package objetos;

/**
 * Libro.java
 * Definición de la clase Libro
 * @author Alberto Ruiz
 */
public class LibroMetodoConstructor {
	// atributos
	private String isbn;
	private String titulo;
	private String autor;
	private  int numeroDePaginas;
	
	public LibroMetodoConstructor(String isbn, String titulo, String autor, int numeroDePaginas) {
		super(); /* En Java, super es utilizado para hacer referencia a una clase padre 
		o superclase. Puede ser utilizado para llamar constructores de la clase padre, 
		acceder a campos y métodos de la clase padre, y 
		para acceder a la clase padre en un contexto de sobreescritura. */
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	
	

}
