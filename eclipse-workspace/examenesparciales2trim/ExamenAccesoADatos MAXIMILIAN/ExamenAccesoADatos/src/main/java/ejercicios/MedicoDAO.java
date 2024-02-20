package ejercicios;


import ejercicios.Medicos;

import java.util.List;

public interface MedicoDAO {
    void crearTabla();
    void insertarMedico(Medicos medico);
    void actualizarMedico(Medicos medico);
    void eliminarMedico(Long id);
    List<Medicos> listarMedicos();
}
