package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PacientesDao {
	private final SessionFactory sessionFactory;

    public PacientesDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void agregarPacientes(Pacientes pacientes) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(pacientes);
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


    public List<Pacientes> obtenerTodasLosPacientess() {
        try (Session session = sessionFactory.openSession()) {
            Query<Pacientes> query = session.createQuery("from Pacientes", Pacientes.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Devuelve una lista vacía o maneja el error de otra manera según tus necesidades.
        }
    }


    public void actualizarPacientes(Pacientes pacientes) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(pacientes);
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


    public void eliminarPacientes(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Pacientes Pacientes = session.get(Pacientes.class, id);
            if (Pacientes != null) {
                session.delete(Pacientes);
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


    public Pacientes obtenerPacientes(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Pacientes.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
