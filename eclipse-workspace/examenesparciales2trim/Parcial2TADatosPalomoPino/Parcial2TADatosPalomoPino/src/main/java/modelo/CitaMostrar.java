package modelo;

import modelo.CitaDAO;
import modelo.CitaDAOHibernate;
import modelo.Cita;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CitaMostrar {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        CitaDAO citaDAO = new CitaDAOHibernate(sessionFactory);

        System.out.println("Citas existentes:");
        citaDAO.mostrarTodasLasCitas().forEach(Cita -> {
            System.out.println("ID: " + Cita.getId() + ", id_pacientes: " + Cita.getPaciente()  
            + ", id_medicos: " + Cita.getMedico() + ", Fecha: " + Cita.getFecha()
            + ", Hora: " + Cita.getHora());
        });

        sessionFactory.close();
    }
}