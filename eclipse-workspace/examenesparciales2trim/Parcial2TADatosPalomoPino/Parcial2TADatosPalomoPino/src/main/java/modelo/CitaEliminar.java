package modelo;

import modelo.CitaDAO;
import modelo.CitaDAOHibernate;
import modelo.Cita;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CitaEliminar {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        CitaDAO citaDAO = new CitaDAOHibernate(sessionFactory);

        System.out.println("Citas existentes:");
        citaDAO.mostrarTodasLasCitas().forEach(Cita -> {
            System.out.println("ID: " + Cita.getId() + ", ID_Paciente: " + Cita.getPaciente()  
            + ", ID_Medico: " + Cita.getMedico() + ", Fecha: " + Cita.getFecha()
            + ", Hora: " + Cita.getHora());
        });
        
        System.out.println();
        
        citaDAO.eliminarCita(1);
        
        System.out.println("Citas existentes tras la actualizacion:");
        citaDAO.mostrarTodasLasCitas().forEach(Cita -> {
            System.out.println("ID: " + Cita.getId() + ", ID_Paciente: " + Cita.getPaciente()  
            + ", ID_Medico: " + Cita.getMedico() + ", Fecha: " + Cita.getFecha()
            + ", Hora: " + Cita.getHora());
        });

        sessionFactory.close();
    }
}