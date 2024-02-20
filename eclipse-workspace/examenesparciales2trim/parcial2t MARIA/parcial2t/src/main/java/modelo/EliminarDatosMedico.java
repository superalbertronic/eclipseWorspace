package modelo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarDatosMedico {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		Scanner sc = new Scanner(System.in);
		int id;

		try {
			System.out.println("Introduce el ID del médico que deseas eliminar:");
			id = Integer.parseInt(sc.nextLine());

			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Realizar una consulta para obtener los datos antes de la eliminación:
			String selectHqlBeforeDelete = "FROM Medico WHERE id = " + id;
			Query<Medico> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Medico.class);
			List<Medico> medicosBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación:
			System.out.println("Registros en la tabla medicos antes de la eliminación:");
			for (Medico m : medicosBeforeDelete) {
				System.out.println(m.toString());
			}

			// Eliminar el registro:
			String deleteHql = "DELETE FROM Medico WHERE id = " + id;
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación:
			String selectHqlAfterDelete = "FROM Medico";
			Query<Medico> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Medico.class);
			List<Medico> medicosAfterDelete = selectQueryAfterDelete.list();

			// Imprimir resultados después de la eliminación:
			System.out.println("Registros en la tabla medicos después de la eliminación:");

			for (Medico m : medicosAfterDelete) {
				System.out.println(m.toString());
			}

			// Hacer commit de la transacción:
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}