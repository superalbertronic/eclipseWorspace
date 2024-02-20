package modelo;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure()

				.buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {

			//String nombre, String apellidos, String ciudad, String direccion, int telefono, int edad,
			//String historial, Medicos medico, Citas cita
			
			Pacientes paciente1 = new Pacientes("Reyes", "Rubio", "Málaga", "Calle Carpio", 622731351, 31, "Lupus",
					"Gregory House", cita1);
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(paciente1);
			session.getTransaction().commit();

			Pacientes paciente2 = new Pacientes("Andres", "Rubio", "Valencia", "Xativa", 632487943, 41, "Ansiedad",
					"Gregory House", cita1);
			Session session1 = context.currentSession();
			session.beginTransaction();
			session.save(paciente1);
			session.getTransaction().commit();
			
			//String nombre, String apellidos, String especialidad, List<Pacientes> pacientes, List<Citas> citas
			Medicos medico1 = new Medicos("Gregory", "House", "Traumatólogo", paciente1, cita1);
			Session session2 = context.currentSession();
			session1.beginTransaction();
			session1.save(medico1);
			session1.getTransaction().commit();
			
			Medicos medico2 = new Medicos("Pilar", "Vaquero", "Psiquiatra", paciente1, cita2);
			Session session3 = context.currentSession();
			session1.beginTransaction();
			session1.save(medico1);
			session1.getTransaction().commit();
			
			

			System.out.println(paciente1.toString());
			System.out.println(medico1.toString());
			System.out.println(cita1.toString());
			
			System.out.println(paciente2.toString());
			System.out.println(medico2.toString());
			System.out.println(cita2.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			ThreadLocalSessionContext.unbind(sessionFactory);

			sessionFactory.close();
		}
	}
}
