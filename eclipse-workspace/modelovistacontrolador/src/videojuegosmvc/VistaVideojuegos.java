package videojuegosmvc;

//Vista: Interfaz de usuario en consola
class VistaVideojuegos {
public void mostrarMenu() {
   System.out.println("1. Ver detalles del videojuego");
   System.out.println("2. Agregar videojuego");
   System.out.println("3. Salir");
   System.out.print("Seleccione una opción: ");
}

public void mostrarMensaje(String mensaje) {
   System.out.println(mensaje);
}
}
