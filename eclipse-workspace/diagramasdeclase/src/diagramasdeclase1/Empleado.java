package diagramasdeclase1;

//Clase Empleado que hereda de Persona
public class Empleado extends Persona {
 private double salario;
 private Directivo supervisor; // Relación de asociación con Directivo

 // Constructor
 public Empleado(String nombre, double salario) {
     super(nombre);
     this.salario = salario;
 }

 // Getter y setter específico de Empleado
 public double getSalario() {
     return salario;
 }

 public void setSalario(double salario) {
     this.salario = salario;
 }

 public Directivo getSupervisor() {
     return supervisor;
 }

 public void setSupervisor(Directivo supervisor) {
     this.supervisor = supervisor;
 }
}
