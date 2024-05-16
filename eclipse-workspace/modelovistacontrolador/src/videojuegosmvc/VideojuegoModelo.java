package videojuegosmvc;

//Modelo: Clase Videojuego
class VideojuegoModelo {
private String nombre;
private String genero;

public VideojuegoModelo(String nombre, String genero) {
   this.nombre = nombre;
   this.genero = genero;
}

public String getNombre() {
   return nombre;
}

public String getGenero() {
   return genero;
}
}

