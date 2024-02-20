package Ejercicio1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost/instituto";
        String dbUser = "root";
        String dbPassword = "";

        try {
        	InstitutoController controller = new InstitutoController(dbURL, dbUser, dbPassword); 
            controller.mostrarInstitutos();
            controller.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

