package ejercicios;

import ejercicios.Paciente;

import java.util.List;

public interface PacienteDao {
    void crearTabla();
    void insertarPaciente(Paciente paciente);
    void actualizarPaciente(Paciente paciente);
    void eliminarPaciente(Long id);
    List<Paciente> listarPacientes();
}
