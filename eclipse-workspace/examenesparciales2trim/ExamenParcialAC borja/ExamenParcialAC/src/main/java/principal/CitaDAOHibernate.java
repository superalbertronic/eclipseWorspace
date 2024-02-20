package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class CitaDAOHibernate implements CitaDAO {
    private SessionFactory sessionFactory;

    public CitaDAOHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Cita getCitaById(int id) {
        Session session = sessionFactory.openSession();
        Cita cita = null;
        try {
            cita = session.get(Cita.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cita;
    }

    public List<Cita> getAllCitas() {
        Session session = sessionFactory.openSession();
        List<Cita> citas = null;
        try {
            Query<Cita> query = session.createQuery("FROM Cita", Cita.class);
            citas = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return citas;
    }

    public void addCita(Cita cita) {
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

    public void mostrar() {
    	
    	for (Cita cita : getAllCitas()) {
			cita.mostrarInf();
		}
    	
    }
    
    public void updateCita(Cita cita) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(cita);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteCita(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Cita cita = session.get(Cita.class, id);
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
}
