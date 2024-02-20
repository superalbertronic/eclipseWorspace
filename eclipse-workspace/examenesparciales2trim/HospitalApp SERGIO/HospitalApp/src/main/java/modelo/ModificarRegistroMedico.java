package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class ModificarRegistroMedico {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            String updateHql = "UPDATE Medico SET nombre = 'NuevoNombre' WHERE id = 1";
            Query<?> updateQuery = session.createQuery(updateHql);
            updateQuery.executeUpdate();

            String selectHql = "FROM Medico WHERE id = 1";
            Query<Medico> selectQuery = session.createQuery(selectHql, Medico.class);
            List<Medico> medicos = selectQuery.list();

            System.out.println("Registros en la tabla medicos después de la actualización:");
            for (Medico m : medicos) {
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
