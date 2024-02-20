package modelVistaControlador9;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost/instituto";
        String dbUser = "root";
        String dbPassword = "";

        AlumnoModel modelo;
        AlumnoView vista;
        AlumnoController controlador;

        try {
            modelo = new AlumnoModel(dbURL, dbUser, dbPassword);
            vista = new AlumnoView();
            controlador = new AlumnoController(modelo, vista);

            controlador.mostrarTodosLosAlumnos();

            modelo.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
