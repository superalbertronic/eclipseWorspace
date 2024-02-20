package modelo;

import modelo.PacienteDAO;
import modelo.PacienteDAOHibernate;
import modelo.Paciente;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PacienteMostrar {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        PacienteDAO pacienteDAO = new PacienteDAOHibernate(sessionFactory);

        System.out.println("Pacientes existentes:");
        pacienteDAO.mostrarTodosLosPacientes().forEach(paciente -> {
            System.out.println("ID: " + paciente.getId() + ", Nombre: " + paciente.getNombre()  
            + ", Apellidos: " + paciente.getApellidos() + ", Ciudad: " + paciente.getCiudad()
            + ", Direccion: " + paciente.getDireccion() + ", Telefono: " + paciente.getTelefono()
            + ", Edad: " + paciente.getEdad() + ", Historial: " + paciente.getHistorial());
        });

        sessionFactory.close();
    }
}