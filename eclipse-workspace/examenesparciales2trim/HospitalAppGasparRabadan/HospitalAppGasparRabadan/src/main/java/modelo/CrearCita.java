package modelo;

import java.sql.Date;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class CrearCita {
	
	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		try {
			// Crear objeto alumnonte
			Cita Cita = new Cita();

			// Obtener la sesión actual
			Session session2 = context.currentSession();
			// Iniciar transacción
			session2.beginTransaction();
			// Guardar objeto en la base de datos
			session2.save(Cita);

			// Hacer commit de la transacción
			session2.getTransaction().commit();

			// Imprimir alumnonte guardado en la base de datos
			System.out.println("Cita: " + Cita);

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