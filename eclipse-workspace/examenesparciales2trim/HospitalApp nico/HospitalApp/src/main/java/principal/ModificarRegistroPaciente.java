package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;

public class ModificarRegistroPaciente {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			String updateHql = "UPDATE Pacientes SET nombre = 'Ronaldinho' WHERE id = 1";
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			String selectHql = "FROM Pacientes WHERE id = 1";
			Query<Pacientes> selectQuery = session.createQuery(selectHql, Pacientes.class);
			List<Pacientes> pacientes = selectQuery.list();

			// Imprimir resultados
			System.out.println("Registros en la tabla Paciente después de la actualización:");
			for (Pacientes f : pacientes) {
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