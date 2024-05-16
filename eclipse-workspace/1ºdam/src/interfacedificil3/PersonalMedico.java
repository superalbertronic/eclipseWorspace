package interfacedificil3;

//Clase abstracta para el personal médico
abstract class PersonalMedico {
protected String nombre;
protected String especialidad;
protected String turno;

public PersonalMedico(String nombre, String especialidad, String turno) {
   this.nombre = nombre;
   this.especialidad = especialidad;
   this.turno = turno;
}

public abstract void realizarConsulta(Paciente paciente);
}