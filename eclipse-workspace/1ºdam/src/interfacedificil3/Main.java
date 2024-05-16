package interfacedificil3;

import java.util.ArrayList;

//Clase principal para probar el sistema
public class Main {
 public static void main(String[] args) {
     Medico medico1 = new Medico("Dr. González", "Cardiología", "Mañana");
     Cirujano cirujano1 = new Cirujano("Dr. Pérez", "Cirugía general", "Tarde");
     Enfermera enfermera1 = new Enfermera("Laura", "General", "Noche");

     Paciente paciente1 = new Paciente("Juan", 40, "Hipertensión");
     Paciente paciente2 = new Paciente("María", 35, "Diabetes");

     medico1.asignarPaciente(paciente1);
     medico1.realizarConsulta(paciente1);

     cirujano1.asignarPaciente(paciente2);
     cirujano1.programarCirugia(paciente2, "15 de marzo");

     enfermera1.realizarConsulta(paciente1);
 }
}
