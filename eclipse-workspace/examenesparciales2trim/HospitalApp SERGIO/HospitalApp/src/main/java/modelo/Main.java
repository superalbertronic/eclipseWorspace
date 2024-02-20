package modelo;

import java.sql.Date;
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
			
			Paciente paciente = new Paciente("Paquito", "Pérez Rodriguez", "Murcia", "C/ Fernando Alonso", "875193457", 33, "Rotura de Fémur");
			Session session1 = context.currentSession();
			session1.beginTransaction();
			session1.save(paciente);
			session1.getTransaction().commit();
			
			Medico medico = new Medico("Agustin", "Susunaga López", "Piernas Humanas");
			Session session2 = context.currentSession();
			session2.beginTransaction();
			session2.save(medico);
			session2.getTransaction().commit();
			
			Cita cita = new Cita(paciente, medico, "08/02/2024","16:00");
			Session session3 = context.currentSession();
			session3.beginTransaction();
			session3.save(cita);
			session3.getTransaction().commit();
			
			System.out.println(paciente.toString());
			System.out.println(medico.toString());
			System.out.println(cita.toString());

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
			}
	}

}
