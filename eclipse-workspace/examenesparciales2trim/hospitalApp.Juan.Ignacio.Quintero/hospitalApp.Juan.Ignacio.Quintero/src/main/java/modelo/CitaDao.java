package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CitaDao {
	private final SessionFactory sessionFactory;

    public CitaDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void agregarCita(Cita cita) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(cita);
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


    public List<Cita> obtenerTodasLosCitas() {
        try (Session session = sessionFactory.openSession()) {
            Query<Cita> query = session.createQuery("from Cita", Cita.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Devuelve una lista vacía o maneja el error de otra manera según tus necesidades.
        }
    }


    public void actualizarCita(Cita cita) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(cita);
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


    public void eliminarCita(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Cita Cita = session.get(Cita.class, id);
            if (Cita != null) {
                session.delete(Cita);
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


    public Cita obtenerCita(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Cita.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
