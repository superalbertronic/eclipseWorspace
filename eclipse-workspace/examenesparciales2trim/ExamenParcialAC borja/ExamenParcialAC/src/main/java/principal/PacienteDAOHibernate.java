package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class PacienteDAOHibernate implements PacienteDAO {
    private SessionFactory sessionFactory;

    public PacienteDAOHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Paciente getCitaById(int id) {
        Session session = sessionFactory.openSession();
        Paciente paciente = null;
        try {
        	paciente = session.get(Paciente.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return paciente;
    }

    public List<Paciente> getAllPacientes() {
        Session session = sessionFactory.openSession();
        List<Paciente> pacientes = null;
        try {
            Query<Paciente> query = session.createQuery("FROM Paciente", Paciente.class);
            pacientes = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return pacientes;
    }

    public void mostrar() {
    	
    	for (Paciente paciente : getAllPacientes()) {
    		paciente.mostrarInfo();
		}
    	
    }


    public void addPaciente(Paciente cita) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(cita);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updatePaciente(Paciente paciente) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(paciente);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deletePaciente(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Paciente cita = session.get(Paciente.class, id);
            if (cita != null) {
                session.delete(cita);
                tx.commit();
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

	public Paciente getPacienteById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
        Paciente paciente = null;
        try {
            paciente = session.get(Paciente.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return paciente;
	}
}
