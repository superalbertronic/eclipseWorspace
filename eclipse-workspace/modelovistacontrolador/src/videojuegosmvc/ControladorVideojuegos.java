package videojuegosmvc;


//Controlador: Gestiona las acciones del usuario y actualiza el modelo
class ControladorVideojuegos {
private VistaVideojuegos vista;
private VideojuegoModelo videojuegoModelo;

public ControladorVideojuegos(VistaVideojuegos vista) {
   this.vista = vista;
}

public void agregarVideojuego(String nombre, String genero) {
   videojuegoModelo = new VideojuegoModelo(nombre, genero);
   vista.mostrarMensaje("¡Videojuego agregado correctamente!");
}

public void mostrarDetallesVideojuego() {
   if (videojuegoModelo != null) {
       vista.mostrarMensaje("Nombre: " + videojuegoModelo.getNombre());
       vista.mostrarMensaje("Género: " + videojuegoModelo.getGenero());
   } else {
       vista.mostrarMensaje("¡No hay ningún videojuego para mostrar!");
   }
}
}

