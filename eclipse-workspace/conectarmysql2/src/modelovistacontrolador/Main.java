package modelovistacontrolador;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost/dbgametop";
		String dbUser="root";
		String dbPassword="";
		
		try {
			TVideoJuegoController controller=new TVideoJuegoController(dbURL, dbUser, dbPassword);
			controller.mostrarJuegos();
			controller.cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
