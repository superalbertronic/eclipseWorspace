package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class EliminarRegistroMedico {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            String selectHqlBeforeDelete = "FROM Medico WHERE id = 3";
            Query<Medico> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Medico.class);
            List<Medico> medicosBeforeDelete = selectQueryBeforeDelete.list();

            System.out.println("Registros en la tabla medicos antes de la eliminación:");
            for (Medico m : medicosBeforeDelete) {
                System.out.println(m.toString());
            }

            String deleteHql = "DELETE FROM Medico WHERE id = 9";
            Query<?> deleteQuery = session.createQuery(deleteHql);
            deleteQuery.executeUpdate();

            String selectHqlAfterDelete = "FROM Medico";
            Query<Medico> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Medico.class);
            List<Medico> medicosAfterDelete = selectQueryAfterDelete.list();

            System.out.println("Registros en la tabla medicos después de la eliminación:");
            for (Medico m : medicosAfterDelete) {
                System.out.println(m.toString());
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
