package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarRegistroCita {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Cita WHERE id = 1";
			Query<Cita> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Cita.class);
			List<Cita> citasBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla Cita antes de la eliminación:");
			for (Cita c : citasBeforeDelete) {
				System.out.println(c.toString());
			}

			String deleteHql = "DELETE FROM Cita WHERE id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Cita";
			Query<Cita> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Cita.class);
			List<Cita> citasAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Cita después de la eliminación:");
			for (Cita c : citasAfterDelete) {
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
