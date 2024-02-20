package crud;

import java.util.ArrayList;

public class MainCrud {
	public static void main(String[] args) {
	    ArrayList<Libro> listaLibros = new ArrayList<Libro>();

	    //Agregar libros a la lista
	    listaLibros.add(new Libro("Libro 1", 20.0, "Autor 1", 100));
	    listaLibros.add(new Libro("Libro 2", 25.0, "Autor 2", 150));
	    listaLibros.add(new Libro("Libro 3", 30.0, "Autor 3", 200));

	    //Listar libros
	    System.out.println("Listado de libros: ");
	    for (Libro libro : listaLibros) {
	        libro.mostrarInformacion();
	    }

	    //Modificar libro
	    String nombreLibro = "Libro 2";
	    double nuevoPrecio = 28.0;
	    for (Libro libro : listaLibros) {
	        if (libro.getNombre().equals(nombreLibro)) {
	            int indice = listaLibros.indexOf(libro);
	            libro.setPrecio(nuevoPrecio);
	            listaLibros.set(indice, libro);
	            break;
	        }
	    }
	    System.out.println("\nListado de libros después de modificar: ");
	    for (Libro libro : listaLibros) {
	        libro.mostrarInformacion();
	    }

	    //Eliminar libro
	    nombreLibro = "Libro 1";
	    for (Libro libro : listaLibros) {
	        if (libro.getNombre().equals(nombreLibro)) {
	            int indice = listaLibros.indexOf(libro);
	            listaLibros.remove(indice);
	            break;
	        }
	    }
	    System.out.println("\nListado de libros después de eliminar: ");
	    for (Libro libro : listaLibros) {
	        libro.mostrarInformacion();
	    }
	}


}
