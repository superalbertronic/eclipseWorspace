package modelo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class EliminarDatosPaciente {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		
		Scanner sc = new Scanner(System.in);
		int id;

		try {
			System.out.println("Introduce el ID del paciente que deseas eliminar:");
			id = Integer.parseInt(sc.nextLine());
			
			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Realizar una consulta para obtener los datos antes de la eliminación:
			String selectHqlBeforeDelete = "FROM Paciente WHERE id = " + id;
			Query<Paciente> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Paciente.class);
			List<Paciente> pacientesBeforeDelete = selectQueryBeforeDelete.list();

			// Imprimir resultados antes de la eliminación:
			System.out.println("Registros en la tabla pacientes antes de la eliminación:");
			for (Paciente p : pacientesBeforeDelete) {
				System.out.println(p.toString());
			}

			// Eliminar el registro:
			String deleteHql = "DELETE FROM Paciente WHERE id = " + id;
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos después de la eliminación:
			String selectHqlAfterDelete = "FROM Paciente";
			Query<Paciente> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Paciente.class);
			List<Paciente> pacientesAfterDelete = selectQueryAfterDelete.list();

			// Imprimir resultados después de la eliminación:
			System.out.println("Registros en la tabla pacientes después de la eliminación:");

			for (Paciente p : pacientesAfterDelete) {
				System.out.println(p.toString());
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