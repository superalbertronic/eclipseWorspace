package interfacedificilpoo2;

//Interfaz para los materiales de la biblioteca
interface MaterialBiblioteca {
 String getTitulo();
}

//Clase abstracta para los libros
abstract class Libro implements MaterialBiblioteca {
 protected String titulo;
 protected String autor;
 protected int numeroPaginas;

 public Libro(String titulo, String autor, int numeroPaginas) {
     this.titulo = titulo;
     this.autor = autor;
     this.numeroPaginas = numeroPaginas;
 }

 @Override
 public String getTitulo() {
     return titulo;
 }

 public abstract String getAutor();
 public abstract int getNumeroPaginas();
}

//Clase para los libros impresos
class LibroImpreso extends Libro {
 public LibroImpreso(String titulo, String autor, int numeroPaginas) {
     super(titulo, autor, numeroPaginas);
 }

 @Override
 public String getAutor() {
     return autor;
 }

 @Override
 public int getNumeroPaginas() {
     return numeroPaginas;
 }
}

//Clase abstracta para las revistas
abstract class Revista implements MaterialBiblioteca {
 protected String titulo;
 protected int numeroEdicion;
 protected String fechaPublicacion;

 public Revista(String titulo, int numeroEdicion, String fechaPublicacion) {
     this.titulo = titulo;
     this.numeroEdicion = numeroEdicion;
     this.fechaPublicacion = fechaPublicacion;
 }

 @Override
 public String getTitulo() {
     return titulo;
 }

 public abstract int getNumeroEdicion();
 public abstract String getFechaPublicacion();
}

//Clase para las revistas digitales
class RevistaDigital extends Revista {
 public RevistaDigital(String titulo, int numeroEdicion, String fechaPublicacion) {
     super(titulo, numeroEdicion, fechaPublicacion);
 }

 @Override
 public int getNumeroEdicion() {
     return numeroEdicion;
 }

 @Override
 public String getFechaPublicacion() {
     return fechaPublicacion;
 }
}

//Clase principal para probar el sistema
public class Main {
 public static void main(String[] args) {
     Libro libro1 = new LibroImpreso("El Hobbit", "J.R.R. Tolkien", 300);
     Libro libro2 = new LibroImpreso("Cien años de soledad", "Gabriel García Márquez", 500);

     Revista revista1 = new RevistaDigital("National Geographic", 100, "01/2023");
     Revista revista2 = new RevistaDigital("Time", 200, "02/2023");

     System.out.println("Libro 1: " + libro1.getTitulo() + ", Autor: " + libro1.getAutor() + ", Páginas: " + libro1.getNumeroPaginas());
     System.out.println("Libro 2: " + libro2.getTitulo() + ", Autor: " + libro2.getAutor() + ", Páginas: " + libro2.getNumeroPaginas());

     System.out.println("Revista 1: " + revista1.getTitulo() + ", Edición: " + revista1.getNumeroEdicion() + ", Fecha de Publicación: " + revista1.getFechaPublicacion());
     System.out.println("Revista 2: " + revista2.getTitulo() + ", Edición: " + revista2.getNumeroEdicion() + ", Fecha de Publicación: " + revista2.getFechaPublicacion());
 }
}
