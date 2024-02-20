package ejercicios;

import ejercicios.Citas;

import java.util.List;

public interface CitaDAO {
    void crearTabla();
    void insertarCita(Citas cita);
    void actualizarCita(Citas cita);
    void eliminarCita(Long id);
    List<Citas> listarCitas();
}
