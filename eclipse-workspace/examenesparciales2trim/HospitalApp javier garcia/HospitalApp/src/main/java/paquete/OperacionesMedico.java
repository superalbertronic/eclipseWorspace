package paquete;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OperacionesMedico implements MedicoDAO {

    private final SessionFactory sessionFactory;

    public OperacionesMedico(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void agregarMedico (Medico medico) {
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
    public List<Medico> obtenerTodosLosMedicos() {
        try (Session session = sessionFactory.openSession()) {
            Query<Medico> query = session.createQuery("from Medico", Medico.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void actualizarMedico(Medico medico) {
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
    public Medico obtenerMedico(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Medico.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}