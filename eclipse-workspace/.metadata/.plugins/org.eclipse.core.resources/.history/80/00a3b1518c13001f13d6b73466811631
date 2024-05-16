package diagramasdeclase1;

//Clase Main para probar el código
public class Main {
 public static void main(String[] args) {
     // Crear una persona
     Persona persona = new Persona("Juan");

     // Crear un empleado
     Empleado empleado = new Empleado("Pedro", 2000.0);

     // Crear un directivo
     Directivo directivo = new Directivo("Ana", 3000.0, "Finanzas");

     // Establecer una relación de asociación entre empleado y directivo
     empleado.setSupervisor(directivo);

     // Acceder a los atributos y métodos de cada clase
     System.out.println("Nombre de la persona: " + persona.getNombre());
     System.out.println("Nombre del empleado: " + empleado.getNombre());
     System.out.println("Salario del empleado: " + empleado.getSalario());
     System.out.println("Nombre del supervisor del empleado: " + empleado.getSupervisor().getNombre());
     System.out.println("Departamento del directivo: " + directivo.getDepartamento());
 }
}