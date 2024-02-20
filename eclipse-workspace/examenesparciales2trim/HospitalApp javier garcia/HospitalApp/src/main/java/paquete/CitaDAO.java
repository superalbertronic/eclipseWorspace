package paquete;

import java.util.List;

public interface CitaDAO {
    void agregarCita(Cita cita);
    void actualizarCita(Cita cita);
    void eliminarCita(int id);
    Cita obtenerCita(int id);
    List<Cita> obtenerTodasLasCitas();
}
