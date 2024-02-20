package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CitaDAOHibernate implements CitaDAO {

    private final SessionFactory sessionFactory;

    public CitaDAOHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insertarCita(Cita cita) {
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

    @Override
    public List<Cita> mostrarTodasLasCitas() {
        try (Session session = sessionFactory.openSession()) {
            Query<Cita> query = session.createQuery("from Cita", Cita.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void modificarCita(Cita cita) {
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

    @Override
    public void eliminarCita(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Cita cita = session.get(Cita.class, id);
            if (cita != null) {
                session.delete(cita);
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
    public Cita mostrarCita(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Cita.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}