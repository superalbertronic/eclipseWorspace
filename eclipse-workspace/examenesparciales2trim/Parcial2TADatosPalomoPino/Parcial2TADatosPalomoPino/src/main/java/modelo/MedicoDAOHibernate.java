package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MedicoDAOHibernate implements MedicoDAO {

    private final SessionFactory sessionFactory;

    public MedicoDAOHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void insertarMedico(Medico medico) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(medico);
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
    public List<Medico> mostrarTodosLosMedicos() {
        try (Session session = sessionFactory.openSession()) {
            Query<Medico> query = session.createQuery("from Medico", Medico.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void modificarMedico(Medico medico) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(medico);
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
    public void eliminarMedico(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Medico medico = session.get(Medico.class, id);
            if (medico != null) {
                session.delete(medico);
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
    public Medico mostrarMedico(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Medico.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}