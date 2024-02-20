package modelo;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class InsertarDatosCita {

	static void main(String[] args) {
		// Configurar sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure() // Llama al fichero hibernate.cfg.xml.
				// .configure("hibernate.cfg.xml") // Ruta del archivo de configuración de Hibernate.
				.buildSessionFactory(); // Construir la sesión de Hibernate.

		// Configurar la sesión en el cotexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		Scanner sc = new Scanner(System.in);
		int idPaciente;
		int idMedico;
		String fecha;
		String hora;

		try {
			// Crear objeto cita:
			System.out.println("ID del paciente:");
			idPaciente = Integer.parseInt(sc.nextLine());

			System.out.println("ID del médico:");
			idMedico = Integer.parseInt(sc.nextLine());

			System.out.println("Fecha de la cita:");
			fecha = sc.nextLine();

			System.out.println("Hora de la cita:");
			hora = sc.nextLine();

			Cita cita = new Cita(idPaciente, idMedico, Date.valueOf(fecha), hora);

			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Guardar objeto en la base de datos:
			session.save(cita);

			// Hacer commit en la transacción:
			session.getTransaction().commit();

			// Imprimir alumno guardado en la base de datos:
			System.out.println("Cita guardada: " + cita);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			// Desligar la sesión del contexto:
			ThreadLocalSessionContext.unbind(sessionFactory);

			// Cerrar la sesión de Hibernate:
			sessionFactory.close();
		}
	}
}