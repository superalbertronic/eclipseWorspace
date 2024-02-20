package modelo;

import java.util.List;
import modelo.Cita;

public interface CitaDAO {
    void insertarCita(Cita cita);
    void modificarCita(Cita cita);
    void eliminarCita(int id);
    Cita mostrarCita(int id);
    List<Cita> mostrarTodasLasCitas();
}