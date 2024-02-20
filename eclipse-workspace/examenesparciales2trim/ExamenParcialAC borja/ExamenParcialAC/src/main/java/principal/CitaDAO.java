package principal;

import java.util.List;

public interface CitaDAO {
    Cita getCitaById(int id);
    List<Cita> getAllCitas();
    void addCita(Cita cita);
    void updateCita(Cita cita);
    void deleteCita(int id);
}
