package abstracta.cineherencia;

import java.util.Arrays;


	public class Cine {
	protected String Pelicula;
	protected String horario;
	public Cine() {
		
	}
	public Cine(String nombre, String horario) {
		this.Pelicula = nombre;
		this.horario=horario;

	}


	public String getPelicula() {
		return Pelicula;
	}


	public void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}
	
	@Override
	public String toString() {
		return "Cine [Pelicula=" + Pelicula + ", horario=" + horario + "]";
	}


	
}

