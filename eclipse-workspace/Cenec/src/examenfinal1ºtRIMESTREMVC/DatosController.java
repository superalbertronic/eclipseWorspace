package examenfinal1ºtRIMESTREMVC;

import java.sql.SQLException;
import java.util.List;

public class DatosController {
	private DatosModel model;
	private DatosView vista;
	
	public DatosController(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new DatosModel(dbURL, dbUser, dbPassword);
		vista = new DatosView();
	}
	
	public void mostrarDatos() throws SQLException {
        List<Datos> datos = model.getAllDatos(); 
        vista.mostrarDatos(datos); 
    }

    public void cerrarConexion() throws SQLException {
        model.close(); 
    }
	
	
}
