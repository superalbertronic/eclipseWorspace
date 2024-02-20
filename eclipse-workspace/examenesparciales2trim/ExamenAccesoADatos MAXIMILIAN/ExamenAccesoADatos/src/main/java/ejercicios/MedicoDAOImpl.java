package ejercicios;


import ejercicios.Medicos;
import ejercicios.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MedicoDAOImpl implements MedicoDAO {
    @Override
    public void crearTabla() {
        // No es necesario crear la tabla en este caso, Hibernate lo hace automáticamente
    }

    @Override
    public void insertarMedico(Medicos medico) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(medico);
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
    public void actualizarMedico(Medicos medico) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(medico);
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
    public void eliminarMedico(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Medicos medico = session.get(Medicos.class, id);
            session.delete(medico);
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
    public List<Medicos> listarMedicos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Medicos> criteria = builder.createQuery(Medicos.class);
        Root<Medicos> root = criteria.from(Medicos.class);
        criteria.select(root);
        List<Medicos> medicos = session.createQuery(criteria).getResultList();
        session.close();
        return medicos;
    }

}
