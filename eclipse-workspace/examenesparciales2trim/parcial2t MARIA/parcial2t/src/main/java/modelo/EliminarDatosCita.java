package modelo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarDatosCita {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		Scanner sc = new Scanner(System.in);
		int id;

		try {
			System.out.println("Introduce el ID de la cita que deseas eliminar:");
			id = Integer.parseInt(sc.nextLine());

			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Realizar una consulta para obtener los datos antes de la eliminación:
			String selectHqlBeforeDelete = "FROM Cita WHERE id = " + id;
			Query<Cita> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Cita.class);
			List<Cita> citasBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación:
			System.out.println("Registros en la tabla citas antes de la eliminación:");
			for (Cita c : citasBeforeDelete) {
				System.out.println(c.toString());
			}

			// Eliminar el registro:
			String deleteHql = "DELETE FROM Cita WHERE id = " + id;
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación:
			String selectHqlAfterDelete = "FROM Cita";
			Query<Cita> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Cita.class);
			List<Cita> citasAfterDelete = selectQueryAfterDelete.list();

			// Imprimir resultados después de la eliminación:
			System.out.println("Registros en la tabla citas después de la eliminación:");

			for (Cita c : citasAfterDelete) {
				System.out.println(c.toString());
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