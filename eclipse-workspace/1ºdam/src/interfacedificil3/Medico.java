package interfacedificil3;

import java.util.ArrayList;

//Clase para los médicos
class Medico extends PersonalMedico implements Asignable {
private ArrayList<Paciente> pacientesAsignados;

public Medico(String nombre, String especialidad, String turno) {
   super(nombre, especialidad, turno);
   this.pacientesAsignados = new ArrayList<>();
}

@Override
public void realizarConsulta(Paciente paciente) {
   System.out.println("El médico " + nombre + " está realizando una consulta al paciente " + paciente.getNombre());
}

@Override
public void asignarPaciente(Paciente paciente) {
   pacientesAsignados.add(paciente);
   System.out.println("El paciente " + paciente.getNombre() + " ha sido asignado al médico " + nombre);
}
}