package startrek;

//Vista: Interfaz de usuario en consola
class VistaStarTrek {
public void mostrarMenu() {
   System.out.println("1. Ver detalles del personaje");
   System.out.println("2. Agregar personaje StarTrek");
   System.out.println("3. Eliminar personaje StarTrek");
   System.out.println("4. Modificar personaje StarTrek");
   System.out.println("5. Salir");
   System.out.print("Seleccione una opción: ");
}

public void mostrarMensaje(String mensaje) {
   System.out.println(mensaje);
}
}
