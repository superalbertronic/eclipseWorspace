package modelo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class ModificarDatosPaciente {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		// Configurar la sesión en el contexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		
		Scanner sc = new Scanner(System.in);
		int id;
		String nuevoNombre;
		
		System.out.println("Introduce el ID del paciente cuyo nombre deseas modificar:");
		id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el nuevo nombre del paciente:");
		nuevoNombre = sc.nextLine();

		try {
			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Modificar el nombre:
			String updateHql = "UPDATE Paciente SET nombre = '" + nuevoNombre + "' WHERE id = " + id;
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos actualizados:
			String selectHql = "FROM Paciente WHERE id = " + id;
			Query<Paciente> selectQuery = session.createQuery(selectHql, Paciente.class);
			List<Paciente> pacientes = selectQuery.list();

			// Imprimir resultados:
			System.out.println("Registros en la tabla pacientes después de la actualización:");

			for (Paciente p : pacientes) {
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