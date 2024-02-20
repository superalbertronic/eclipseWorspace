package arraylist;

import java.util.ArrayList;
import java.util.Collections;
//implementación para el método "compareTo" de la interfaz. Al implementar 
//la interfaz "Comparable", la clase se puede comparar con otros objetos
//de su tipo y se puede utilizar para ordenar colecciones de objetos que 
//contienen elementos de la clase "PeliculasArray".
public class PeliculasArray implements Comparable<PeliculasArray> {
    private String nombre;
    private String director;
    private int año;

    public PeliculasArray(String nombre, String director, int año) { // Constructor de la clase PeliculasArray
        this.nombre = nombre;
        this.director = director;
        this.año = año;
    }

    public String getNombre() { // Método para obtener el nombre de la película
        return nombre;
    }

    public String getDirector() { // Método para obtener el nombre del director de la película
        return director;
    }

    public int getAño() { // Método para obtener el año de la película
        return año;
    }

    @Override
    // se define int, `porque si es 0 los objetos son iguales, si es 1
    //son diferentes
    public int compareTo(PeliculasArray pelicula) { 
    	// Método para comparar objetos PeliculasArray y ordenarlos alfabéticamente
        return this.nombre.compareTo(pelicula.getNombre());
    }

    public static void main(String[] args) { // Método principal donde se crea el ArrayList y se ordena
        ArrayList<PeliculasArray> peliculas = new ArrayList<>(); // Se crea el ArrayList de objetos PeliculasArray

        PeliculasArray alien = new PeliculasArray("Alien", "Ridley Scott", 1979); // Se crean tres objetos PeliculasArray
        PeliculasArray starWars = new PeliculasArray("Star Wars", "George Lucas", 1977);
        PeliculasArray starTrek = new PeliculasArray("Star Trek", "Robert Wise", 1979);

        peliculas.add(alien); // Se agregan los objetos al ArrayList
        peliculas.add(starWars);
        peliculas.add(starTrek);

        Collections.sort(peliculas); // Se ordena el ArrayList usando el método compareTo de la clase PeliculasArray

        for (PeliculasArray pelicula : peliculas) { // Se recorre el ArrayList para imprimir los objetos ordenados alfabéticamente
            System.out.println(pelicula.getNombre() + " (" + pelicula.getAño() + "), dirigida por " + pelicula.getDirector());
        }
    }
}
