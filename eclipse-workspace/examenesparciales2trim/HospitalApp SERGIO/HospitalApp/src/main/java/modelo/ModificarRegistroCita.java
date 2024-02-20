package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class ModificarRegistroCita {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            String updateHql = "UPDATE Cita SET fecha = '09/02/2024' WHERE id = 1";
            Query<?> updateQuery = session.createQuery(updateHql);
            updateQuery.executeUpdate();

            String selectHql = "FROM Cita WHERE id = 1";
            Query<Cita> selectQuery = session.createQuery(selectHql, Cita.class);
            List<Cita> citas = selectQuery.list();

            System.out.println("Registros en la tabla citas después de la actualización:");
            for (Cita c : citas) {
                System.out.println(c.toString());
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
