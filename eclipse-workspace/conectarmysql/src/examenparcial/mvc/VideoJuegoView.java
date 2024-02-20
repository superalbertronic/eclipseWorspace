package mvc;

import java.util.List;

public class VideoJuegoView {

	// Constructor de la vista.
	public void mostrarJuegos(List<VideoJuego> juegos) {
		// bucle de ejecución.
		for (VideoJuego juego : juegos) {
			System.out.println("ID: " + juego.getIdJuego());
			System.out.println("Nombre: " + juego.getNombre());
			System.out.println("Año: " + juego.getAnio());
			System.out.println("Compañia: " + juego.getCompania());
			System.out.println("Precio: " + juego.getPrecio());
			System.out.println("Sinopsis: " + juego.getSinopsis());
			System.out.println("Plataforma: " + juego.getPlataforma());
		} // for
	} // method

} // class
