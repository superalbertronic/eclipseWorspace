package modelo;

import modelo.MedicoDAO;
import modelo.MedicoDAOHibernate;
import modelo.Medico;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MedicoMostrar {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        MedicoDAO medicoDAO = new MedicoDAOHibernate(sessionFactory);

        System.out.println("Medicos existentes:");
        medicoDAO.mostrarTodosLosMedicos().forEach(Medico -> {
            System.out.println("ID: " + Medico.getId() + ", Nombre: " + Medico.getNombre()  
            + ", Apellidos: " + Medico.getApellidos() + ", Especialidad: " + Medico.getEspecialidad());
        });

        sessionFactory.close();
    }
}