package factorymethod;

//Interfaz para productos
interface Persona {
void accion();
void cobrar();
}

//Implementación de productos concretos: electrodomésticos
class Profesores implements Persona {
@Override
public void accion() {
   System.out.println("El profesor da clases.");
}
@Override
public void cobrar() {
   System.out.println("El profesor debería cobrar mas.");
}


}

//Implementación de productos concretos: ropa
class Alumno implements Persona {
@Override
public void accion() {
   System.out.println("El alumno asiste a clase");
}
@Override
public void cobrar() {
   System.out.println("El alumno cobra si no aprueba.");
}

}

//Implementación de persona administrativo
class Administrativo implements Persona {
@Override
public void accion() {
 System.out.println("El administrativo curra");
}
@Override
public void cobrar() {
 System.out.println("El administrativo cobra bastante.");
}

}




//Clase base para la fábrica de productos
abstract class Factory {
public abstract Persona crearPersona();
}

//Implementación de fábrica para electrodomésticos
class DepartamentoProfesores extends Factory {
@Override
public Persona crearPersona() {
   return new Profesores();
}
}

//Implementación de fábrica para ropa
class DepartamentoAlumno extends Factory {
@Override
public Persona crearPersona() {
   return new Alumno();
}
}

class DepartamentoAdministrativo extends Factory {
@Override
public Persona crearPersona() {
   return new Administrativo();
}
}


//Ejemplo de uso
public class FactoryMethod2 {
public static void main(String[] args) {
   // Crear una fábrica de electrodomésticos
   Factory departureProfesores = new DepartamentoProfesores();
   // Utilizar la fábrica para crear un electrodoméstico
   Persona profesores = departureProfesores.crearPersona();
   // Operar con el electrodoméstico
   profesores.accion();
   profesores.cobrar();

   // Crear una fábrica de ropa
   Factory departureAlumno = new DepartamentoAlumno();
   // Utilizar la fábrica para crear ropa
   Persona alumno = departureAlumno.crearPersona();
   // Operar con la ropa
   alumno.accion();
   alumno.cobrar();
   
   //administrativo
   Factory departureadmin=new DepartamentoAdministrativo();
   Persona administrativo=departureadmin.crearPersona();
   administrativo.accion();
   administrativo.cobrar();
}
}
