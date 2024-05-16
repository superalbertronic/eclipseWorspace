package interfacedificil3;

import java.util.ArrayList;

//Clase para los cirujanos
class Cirujano extends PersonalMedico implements Asignable {
private ArrayList<Paciente> pacientesAsignados;

public Cirujano(String nombre, String especialidad, String turno) {
   super(nombre, especialidad, turno);
   this.pacientesAsignados = new ArrayList<>();
}

@Override
public void realizarConsulta(Paciente paciente) {
   System.out.println("El cirujano " + nombre + " está evaluando al paciente " + paciente.getNombre());
}

@Override
public void asignarPaciente(Paciente paciente) {
   pacientesAsignados.add(paciente);
   System.out.println("El paciente " + paciente.getNombre() + " ha sido asignado al cirujano " + nombre);
}

public void programarCirugia(Paciente paciente, String fecha) {
   System.out.println("El cirujano " + nombre + " ha programado una cirugía para el paciente " + paciente.getNombre() + " para el día " + fecha);
}
}