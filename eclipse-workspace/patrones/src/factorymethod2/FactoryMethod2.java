package factorymethod2;

//Interfaz para productos
interface Persona {
void accion();
}

//Implementación de productos concretos: electrodomésticos
class Profesores implements Persona {
@Override
public void accion() {
   System.out.println("El profesor da clases.");
}
}

//Implementación de productos concretos: ropa
class Alumno implements Persona {
@Override
public void accion() {
   System.out.println("El alumno asiste a clase");
}
}



//Clase base para la fábrica de productos
abstract class Factory {
public abstract Persona crearPersona();
}

//Implementación de fábrica para electrodomésticos
class FabricaProfesores extends Factory {
@Override
public Persona crearPersona() {
   return new Profesores();
}
}

//Implementación de fábrica para ropa
class FabricaAlumno extends Factory {
@Override
public Persona crearPersona() {
   return new Alumno();
}
}



//Ejemplo de uso
public class FactoryMethod2 {
public static void main(String[] args) {
   // Crear una fábrica de electrodomésticos
   Factory fabricaProfesores = new FabricaProfesores();
   // Utilizar la fábrica para crear un electrodoméstico
   Persona profesores = fabricaProfesores.crearPersona();
   // Operar con el electrodoméstico
   profesores.accion();

   // Crear una fábrica de ropa
   Factory fabricaAlumno = new FabricaAlumno();
   // Utilizar la fábrica para crear ropa
   Persona alumno = fabricaAlumno.crearPersona();
   // Operar con la ropa
   alumno.accion();
   
   
   
   
}
}
