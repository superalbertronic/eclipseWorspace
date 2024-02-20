package accionesbd;

import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Medicos;
import modelo.Pacientes;

public class EliminarRegistroPacientes {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			// Realizar una consulta para obtener los datos antes de la eliminación
			String selectHqlBeforeDelete = "FROM Pacientes WHERE id = 1";
			Query<Pacientes> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Pacientes.class);
			List<Pacientes> pacientesBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación
			System.out.println("Registros en la tabla medicos antes de la eliminación:");
			for (Pacientes f : pacientesBeforeDelete) {
				System.out.println(f.toString());
			}

			// Eliminar el registro
			String deleteHql = "DELETE FROM Pacientes WHERE id = 1";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación
			String selectHqlAfterDelete = "FROM Pacientes";
			Query<Pacientes> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Pacientes.class);
			List<Pacientes> pacientesAfterDelete = selectQueryAfterDelete.list();
			// Imprimir resultados después de la eliminación
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