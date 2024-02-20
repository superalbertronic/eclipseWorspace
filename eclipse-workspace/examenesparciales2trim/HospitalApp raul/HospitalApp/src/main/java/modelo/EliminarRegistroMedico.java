package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarRegistroMedico {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Medico WHERE id = 1";
			Query<Medico> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Medico.class);
			List<Medico> medicosBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla Medico antes de la eliminación:");
			for (Medico f : medicosBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Medico WHERE id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Medico";
			Query<Medico> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Medico.class);
			List<Medico> medicosAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Medico después de la eliminación:");
			for (Medico f : medicosAfterDelete) {
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
