package ejercicios;


import ejercicios.Paciente;
import ejercicios.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class PacienteDAOImpl implements PacienteDao {
    public void crearTabla() {
        // No es necesario crear la tabla en este caso, Hibernate lo hace automáticamente
    }

    @Override
    public void insertarPaciente(Paciente paciente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(paciente);
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

    public void actualizarPaciente(Paciente paciente) {
        Session session = HibernateUtil.buildSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(paciente);
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

    public void eliminarPaciente(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Paciente paciente = session.get(Paciente.class, id);
            session.delete(paciente);
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

    public List<Paciente> listarPacientes() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Paciente> criteria = builder.createQuery(Paciente.class);
        Root<Paciente> root = criteria.from(Paciente.class);
        criteria.select(root);
        List<Paciente> pacientes = session.createQuery(criteria).getResultList();
        session.close();
        return pacientes;
    }
}

