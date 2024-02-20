package objetos;

/**
 * PruebaLibro.java
 * Programa que prueba la clase Libro
 * @author Alberto Ruiz
 */
public class PruebaLibro {
	public static void main(String[] args) {
		Libro libro1 = new Libro();
		Libro libro2= new Libro();
		Libro libro3 = new Libro();
		
		//dar valores al objeto libro1
		libro1.autor="Tolkien";
		libro1.isbn="1";
		libro1.numeroDePaginas=200;
		libro1.titulo="El Hobbit";
		
		//dar valores al objeto libro2
		libro2.autor="Frank Herbert";
		libro2.isbn="2";
		libro2.numeroDePaginas=400;
		libro2.titulo="Dune";
		
		//dar valores al objeto libro3
		libro3.autor="Cervantes";
		libro3.isbn="3";
		libro3.numeroDePaginas=1200;
		libro3.titulo="El Quijote";
		
		// mostrar valores de los objetos
		System.out.println(libro1.titulo+" "+libro1.autor+" "+ libro1.isbn+" "+ libro1.numeroDePaginas);
		System.out.println(libro2.titulo+" "+libro2.autor+" "+ libro2.isbn+" "+ libro2.numeroDePaginas);
		System.out.println(libro3.titulo+" "+libro3.autor+" "+ libro3.isbn+" "+ libro3.numeroDePaginas);
		
		
		
		
	}
}