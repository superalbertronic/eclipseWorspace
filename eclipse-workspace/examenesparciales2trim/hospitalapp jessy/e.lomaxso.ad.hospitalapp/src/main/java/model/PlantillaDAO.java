package model;

public interface PlantillaDAO {

	void agregarRegistro(Object obj);
	void actualizarRegistro(int id, String campo, String valor);
	void eliminarRegistro(int id);
	void obtenerRegistro(int id);
	void obtenerTodosLosRegistros();
	
} // interface
