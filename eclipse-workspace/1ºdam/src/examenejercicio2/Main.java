package examenejercicio2;

public class Main {
	  public static void main(String[] args) {
	    // Crear objetos de diferentes tipos
	    Libro libro1 = new Libro("La fundaci�n", "Ciencia ficci�n", "123456789", "Isaac Asimov", 350);
	    Revista revista1 = new Revista("Napoleon", "Historia", "ISSN-0027-9358", 12, "2023-11-15");
	    Video video1 = new Video("Dune 2", "Ciencia Ficci�n", 180, "Villaneuve", "Aventuras");
	    Musica musica1 = new Musica("M�sica para relajarse", "Chill", "Dire Straits", "Walking in live", "Rock");

	    // Mostrar informaci�n
	    libro1.mostrarInformacion();
	    System.out.println();
	    revista1.mostrarInformacion();
	    System.out.println();
	    video1.mostrarInformacion();
	    System.out.println();
	    musica1.mostrarInformacion();

	    // Simular pr�stamo y devoluci�n
	    System.out.println("\n**Pr�stamo de materiales:**");
	    libro1.prestar();
	    revista1.prestar();
	    video1.prestar();
	    musica1.prestar();

	    System.out.println("\n**Devoluci�n de materiales:**");
	    libro1.devolver();
	    revista1.devolver();
	    video1.devolver();
	    musica1.devolver();
	  }
	}
