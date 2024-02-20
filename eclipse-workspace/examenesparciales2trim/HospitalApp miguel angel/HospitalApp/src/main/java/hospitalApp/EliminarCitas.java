package hospitalApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class EliminarCitas {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Citas";
			Query<Citas> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Citas.class);
			List<Citas> CitasBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla Citas antes de la eliminación:");
			for (Citas f : CitasBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Citas where id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Citas";
			Query<Citas> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Citas.class);
			List<Citas> CitasAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Citas después de la eliminación:");
			for (Citas f : CitasAfterDelete) {
				System.out.println(f.toString());
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