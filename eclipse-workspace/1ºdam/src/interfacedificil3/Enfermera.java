package interfacedificil3;

//Clase para las enfermeras
class Enfermera extends PersonalMedico {
public Enfermera(String nombre, String especialidad, String turno) {
   super(nombre, especialidad, turno);
}

@Override
public void realizarConsulta(Paciente paciente) {
   System.out.println("La enfermera " + nombre + " está atendiendo al paciente " + paciente.getNombre());
}
}
