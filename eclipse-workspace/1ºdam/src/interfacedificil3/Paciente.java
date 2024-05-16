package interfacedificil3;

//Clase para los pacientes
class Paciente {
private String nombre;
private int edad;
private String historialMedico;

public Paciente(String nombre, int edad, String historialMedico) {
   this.nombre = nombre;
   this.edad = edad;
   this.historialMedico = historialMedico;
}

public String getNombre() {
   return nombre;
}

public int getEdad() {
   return edad;
}

public String getHistorialMedico() {
   return historialMedico;
}
}