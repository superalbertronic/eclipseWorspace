package modelo;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		try {
			// Crear objeto paciente
			Paciente paciente = new Paciente("Irene", "Guerrero", "Malaga", "Calle Gaspar", "2332323", 27,
					"Problemas de Vista");

			// Obtener la sesión actual
			Session session = context.currentSession();
			// Iniciar transacción
			session.beginTransaction();
			// Guardar objeto en la base de datos
			session.save(paciente);

			// Hacer commit de la transacción
			session.getTransaction().commit();

			// Imprimir alumnonte guardado en la base de datos
			System.out.println("Paciente: " + paciente);

			// Crear objeto Medico
			Medico medico = new Medico("Victor Joel", "Motora", "Cafelógolo");

			// Obtener la sesión actual
			Session session2 = context.currentSession();
			// Iniciar transacción
			session2.beginTransaction();
			// Guardar objeto en la base de datos
			session2.save(medico);

			// Hacer commit de la transacción
			session2.getTransaction().commit();

			// Imprimir Médico guardado en la base de datos
			System.out.println("Médico: " + medico);

			// Crear objeto Cita
			Cita cita = new Cita(medico, paciente);

			// Obtener la sesión actual
			Session session3 = context.currentSession();
			// Iniciar transacción
			session3.beginTransaction();
			// Guardar objeto en la base de datos
			session3.save(cita);

			// Hacer commit de la transacción
			session3.getTransaction().commit();

			// Imprimir Cita guardado en la base de datos
			System.out.println("Cita: " + cita);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// Desligar la sesión del contexto
			ThreadLocalSessionContext.unbind(sessionFactory);

			// Cerrar la sesión del Hibernate
			sessionFactory.close();
		}
	}
}
