package prototype;

//Clase Client que utiliza el Prototype
public class MainOrdenador {
 public static void main(String[] args) {
     // Crear un prototipo de ordenador de sobremesa
     OrdenadorSobremesa ordenadorSobremesaPrototipo = new OrdenadorSobremesa("Intel i5", 8, 512,"Gigabyte 360fx");

     // Clonar el ordenador de sobremesa prototipo para crear un nuevo ordenador
     OrdenadorSobremesa nuevoOrdenador1 = ordenadorSobremesaPrototipo.clonar();
     System.out.println("Primer ordenador clonado:");
     nuevoOrdenador1.especificaciones();

     // Clonar el ordenador de sobremesa prototipo para crear otro ordenador nuevo
     OrdenadorSobremesa nuevoOrdenador2 = ordenadorSobremesaPrototipo.clonar();
     System.out.println("\nSegundo ordenador clonado:");
     nuevoOrdenador2.especificaciones();

     // Modificar las especificaciones del segundo ordenador clonado
     nuevoOrdenador2.almacenamiento = 1024;
     System.out.println("\nSegundo ordenador clonado modificado:");
     nuevoOrdenador2.especificaciones();
 }
}
