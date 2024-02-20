package paquete;

import java.util.List;

public interface PacienteDAO {
    void agregarPaciente(Paciente paciente);
    void actualizarPaciente(Paciente paciente);
    void eliminarPaciente(int id);
    Paciente obtenerPaciente(int id);
    List<Paciente> obtenerTodosLosPacientes();
}
