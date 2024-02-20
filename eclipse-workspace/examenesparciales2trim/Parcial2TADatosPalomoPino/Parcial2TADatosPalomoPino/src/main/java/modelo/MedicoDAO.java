package modelo;

import java.util.List;
import modelo.Medico;

public interface MedicoDAO {
    void insertarMedico(Medico Medico);
    void modificarMedico(Medico Medico);
    void eliminarMedico(int id);
    Medico mostrarMedico(int id);
    List<Medico> mostrarTodosLosMedicos();
}