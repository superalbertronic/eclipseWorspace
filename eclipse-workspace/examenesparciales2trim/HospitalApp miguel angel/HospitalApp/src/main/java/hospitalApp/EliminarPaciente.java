package hospitalApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class EliminarPaciente {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Pacientes";
			Query<Pacientes> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Pacientes.class);
			List<Pacientes> pacientesBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla pacientes antes de la eliminación:");
			for (Pacientes f : pacientesBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Pacientes where id = 4";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Pacientes";
			Query<Pacientes> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Pacientes.class);
			List<Pacientes> pacientesAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla pacientes después de la eliminación:");
			for (Pacientes f : pacientesAfterDelete) {
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