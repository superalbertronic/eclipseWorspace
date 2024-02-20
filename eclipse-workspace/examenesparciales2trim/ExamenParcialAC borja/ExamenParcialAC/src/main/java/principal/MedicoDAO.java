package principal;

import java.util.List;

public interface MedicoDAO {
    Medico getMedicoById(int id);
    List<Medico> getAllMedicos();
    void addMedico(Medico medico);
    void updateMedico(Medico medico);
    void deleteMedico(int id);
}
