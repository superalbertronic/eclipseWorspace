package modelo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarRegistroPaciente {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Paciente WHERE id = 1";
			Query<Paciente> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Paciente.class);
			List<Paciente> pacientesBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla Paciente antes de la eliminación:");
			for (Paciente f : pacientesBeforeDelete) {
				System.out.println(f.toString());
			}

			String deleteHql = "DELETE FROM Paciente WHERE id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			String selectHqlAfterDelete = "FROM Paciente";
			Query<Paciente> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Paciente.class);
			List<Paciente> pacientesAfterDelete = selectQueryAfterDelete.list();

			System.out.println("Registros en la tabla Paciente después de la eliminación:");
			for (Paciente f : pacientesAfterDelete) {
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
