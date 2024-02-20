package paquete;

import java.util.List;

public interface MedicoDAO {
    void agregarMedico(Medico medico);
    void actualizarMedico(Medico medico);
    void eliminarMedico(int id);
    Medico obtenerMedico(int id);
    List<Medico> obtenerTodosLosMedicos();
}