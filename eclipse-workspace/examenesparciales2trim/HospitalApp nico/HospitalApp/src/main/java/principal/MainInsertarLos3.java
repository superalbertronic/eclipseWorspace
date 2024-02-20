package principal;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class MainInsertarLos3 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {

			Pacientes paciente = new Pacientes("Lucho", "Rataon", "Berlin", "siempre vivo", "213123",
					"33", "Drogadicto");
			Session session = context.currentSession();
			session.beginTransaction();
			session.save(paciente);
			session.getTransaction().commit();
			
			Medicos medico = new Medicos("Roberto", "Parron", "Oncología");
			Session session2 = context.currentSession();
			session2.beginTransaction();
			session2.save(medico);
			session2.getTransaction().commit();

			Citas citas = new Citas("11/30", "10:30", paciente, medico);
			Session session3 = context.currentSession();
			session3.beginTransaction();
			session3.save(citas);
			session3.getTransaction().commit();

			
			System.out.println(paciente.toString());
			System.out.println(medico.toString());
			System.out.println(citas.toString());

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