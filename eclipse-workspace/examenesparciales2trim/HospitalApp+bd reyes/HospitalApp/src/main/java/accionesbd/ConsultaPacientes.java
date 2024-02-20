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

import modelo.Pacientes;

public class ConsultaPacientes {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()

				.buildSessionFactory();
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();
			session.beginTransaction();

// Crear consulta HQL para seleccionar todos los registros de la tabla fabricante
			String hql = "FROM Pacientes";
			Query<Pacientes> query = session.createQuery(hql, Pacientes.class);

// Ejecutar consulta y obtener resultados
			List<Pacientes> pacientes = query.list();

// Imprimir resultados
			System.out.println("Registros en la tabla pacientes:");
			for (Pacientes f : pacientes) { //for each
				System.out.println(f.toString());
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
//Desligar la sesión del contexto
			ThreadLocalSessionContext.unbind(sessionFactory);
//Cerrar la sesión de Hibernate
			sessionFactory.close();
		}
	}
}
