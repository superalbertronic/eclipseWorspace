package ejercicios;

import ejercicios.Citas;
import ejercicios.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CitaDAOImpl implements CitaDAO {
    @Override
    public void crearTabla() {
        // No es necesario crear la tabla en este caso, Hibernate lo hace automáticamente
    }

    @Override
    public void insertarCita(Citas cita) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(cita);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void actualizarCita(Citas cita) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(cita);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void eliminarCita(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Citas cita = session.get(Citas.class, id);
            session.delete(cita);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Citas> listarCitas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Citas> criteria = builder.createQuery(Citas.class);
        Root<Citas> root = criteria.from(Citas.class);
        criteria.select(root);
        List<Citas> citas = session.createQuery(criteria).getResultList();
        session.close();
        return citas;
    }

}
