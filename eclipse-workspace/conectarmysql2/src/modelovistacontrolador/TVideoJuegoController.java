package modelovistacontrolador;

import java.sql.SQLException;
import java.util.List;

public class TVideoJuegoController {
	private TVideoJuegoModel model;
	private TVideoJuegoView view;

	public TVideoJuegoController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new TVideoJuegoModel(dbURL, dbUser, dbPassword);
		view = new TVideoJuegoView();
	}

	public void mostrarJuegos() throws SQLException {
		List<TVideoJuego> videojuegos = model.getAllVideoJuegos();
		view.mostrarJuegos(videojuegos);
	}

	public void cerrarConexion() throws SQLException {
		model.close();
	}

}
