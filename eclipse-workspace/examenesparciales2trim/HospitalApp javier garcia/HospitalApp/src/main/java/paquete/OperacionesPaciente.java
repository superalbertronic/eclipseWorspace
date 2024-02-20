package paquete;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OperacionesPaciente implements PacienteDAO {

    private final SessionFactory sessionFactory;

    public OperacionesPaciente(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void agregarPaciente (Paciente paciente) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(paciente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Paciente> obtenerTodosLosPacientes() {
        try (Session session = sessionFactory.openSession()) {
            Query<Paciente> query = session.createQuery("from Paciente", Paciente.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void actualizarPaciente(Paciente paciente) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(paciente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void eliminarPaciente(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Paciente paciente = session.get(Paciente.class, id);
            if (paciente != null) {
                session.delete(paciente);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Paciente obtenerPaciente(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Paciente.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}