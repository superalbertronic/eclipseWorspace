package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class MedicoDAOHibernate implements MedicoDAO {
    private SessionFactory sessionFactory;

    public MedicoDAOHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Medico getMedicoById(int id) {
        Session session = sessionFactory.openSession();
        Medico medico = null;
        try {
            medico = session.get(Medico.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return medico;
    }
    
    public void mostrar() {
    	
    	for (Medico medico : getAllMedicos()) {
    		medico.mostrarInf();
		}
    	
    }

    public List<Medico> getAllMedicos() {
        Session session = sessionFactory.openSession();
        List<Medico> medicos = null;
        try {
            Query<Medico> query = session.createQuery("FROM Medico", Medico.class);
            medicos = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return medicos;
    }

    public void addMedico(Medico medico) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(medico);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateMedico(Medico medico) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(medico);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void deleteMedico(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Medico medico = session.get(Medico.class, id);
            if (medico != null) {
                session.delete(medico);
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
