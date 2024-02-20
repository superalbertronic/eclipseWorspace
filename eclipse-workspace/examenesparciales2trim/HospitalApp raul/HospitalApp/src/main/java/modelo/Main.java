package modelo;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {

			Paciente paciente = new Paciente("Pepe", "Gonzalez Romero", "Málaga", "Calle Aurora, 23", "603604605",
					"25", "No tiene historial");
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(paciente);
			session.getTransaction().commit();
			
			Medico medico = new Medico("Juan", "Giménez Atencia", "Oncología");
			Session session2 = context.currentSession();
			session2.beginTransaction();
			session2.save(medico);
			session2.getTransaction().commit();

			Cita cita = new Cita("22/11", "13:30", paciente, medico);
			Session session3 = context.currentSession();
			session3.beginTransaction();
			session3.save(cita);
			session3.getTransaction().commit();

			
			System.out.println(paciente.toString());
			System.out.println(medico.toString());
			System.out.println(cita.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Desligar la sesión del contexto
			ThreadLocalSessionContext.unbind(sessionFactory);
			// Cerrar la sesión de Hibernate
			sessionFactory.close();
		}

	}

}
