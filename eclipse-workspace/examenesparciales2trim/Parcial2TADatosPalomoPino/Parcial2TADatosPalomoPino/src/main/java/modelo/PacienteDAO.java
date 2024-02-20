package modelo;

import java.util.List;
import modelo.Paciente;

public interface PacienteDAO {
    void insertarPaciente(Paciente paciente);
    void modificarPaciente(Paciente paciente);
    void eliminarPaciente(int id);
    Paciente mostrarPaciente(int id);
    List<Paciente> mostrarTodosLosPacientes();
}