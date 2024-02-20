package hospitalApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class EliminarMedicos {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Medicos";
			Query<Medicos> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Medicos.class);
			List<Medicos> MedicosBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla Medicos antes de la eliminación:");
			for (Medicos f : MedicosBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Medicos where id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Medicos";
			Query<Medicos> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Medicos.class);
			List<Medicos> MedicosAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Medicos después de la eliminación:");
			for (Medicos f : MedicosAfterDelete) {
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