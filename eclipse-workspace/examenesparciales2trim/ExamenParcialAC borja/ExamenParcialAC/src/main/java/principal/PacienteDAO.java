package principal;

import java.util.List;
import principal.PacienteDAO;


public interface PacienteDAO {
	Paciente getPacienteById(int id);
	  List<Paciente> getAllPacientes();
	  void addPaciente(Paciente medico);
	  void updatePaciente(Paciente medico);
	  void deletePaciente(int id);
	  void mostrar();
}
