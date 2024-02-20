package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MedicosDao {
	private final SessionFactory sessionFactory;

    public MedicosDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void agregarMedicos(Medicos Medicos) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(Medicos);
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


    public List<Medicos> obtenerTodasLosMedicoss() {
        try (Session session = sessionFactory.openSession()) {
            Query<Medicos> query = session.createQuery("from Medicos", Medicos.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Devuelve una lista vacía o maneja el error de otra manera según tus necesidades.
        }
    }


    public void actualizarMedicos(Medicos Medicos) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(Medicos);
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


    public void eliminarMedicos(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Medicos Medicos = session.get(Medicos.class, id);
            if (Medicos != null) {
                session.delete(Medicos);
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


    public Medicos obtenerMedicos(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Medicos.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
