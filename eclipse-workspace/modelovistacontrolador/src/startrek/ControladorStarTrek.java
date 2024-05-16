
package startrek;

import java.util.Scanner;

//Controlador: Gestiona las acciones del usuario y actualiza el modelo
class ControladorStarTrek {
private VistaStarTrek vista;
private StarTrekModelo starTrekModelo;
Scanner scanner = new Scanner(System.in);
String nombre, cargo, raza;

public ControladorStarTrek(VistaStarTrek vista) {
   this.vista = vista;
}

public void agregarPersonaje() {
	solicitarDatos();
   starTrekModelo = new StarTrekModelo(nombre, cargo, raza);
   vista.mostrarMensaje("¡Personaje agregado correctamente, VIVA LA FEDERACIÓN!");
}

public void mostrarDetallesPersonaje() {
   if (starTrekModelo != null) {
       vista.mostrarMensaje("Nombre: " + starTrekModelo.getNombre());
       vista.mostrarMensaje("Cargo: " + starTrekModelo.getCargo());
       vista.mostrarMensaje("Raza : "+starTrekModelo.getRaza());
   } else {
       vista.mostrarMensaje("¡No hay ningún videojuego para mostrar!");
   }
}
public void borrarRegistro() {
	if(starTrekModelo!=null) {
		starTrekModelo=null;
		vista.mostrarMensaje("Registro borrado en verdad");
	}else {
		vista.mostrarMensaje("Canio en verdad no hay videojuegos, ave");
	}

	
}
public void modificarRegistro() {
	if(starTrekModelo!=null) {
		
		solicitarDatos();
		starTrekModelo.setCargo(cargo);
		starTrekModelo.setNombre(nombre);
		starTrekModelo.setRaza(raza);
		vista.mostrarMensaje("la modificacion to wapa");
	}else {
		vista.mostrarMensaje("que no peudes modificar vieo");
	}
	

}
public void solicitarDatos() {
	scanner.nextLine(); // Limpiar el buffer de entrada
    System.out.print("Ingrese el nombre del personaje: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el puesto del personaje: ");
    String cargo = scanner.nextLine();
    System.out.print("Ingrese la raza: ");
    String raza = scanner.nextLine();
	
}


}
