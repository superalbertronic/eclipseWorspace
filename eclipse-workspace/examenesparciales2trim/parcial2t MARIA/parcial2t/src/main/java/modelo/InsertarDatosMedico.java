package modelo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class InsertarDatosMedico {

	public static void main(String[] args) {
		// Configurar sesión de Hibernate:
		SessionFactory sessionFactory = new Configuration().configure() // Llama al fichero hibernate.cfg.xml.
				// .configure("hibernate.cfg.xml") // Ruta del archivo de configuración de Hibernate.
				.buildSessionFactory(); // Construir la sesión de Hibernate.

		// Configurar la sesión en el cotexto actual:
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellidos;
		String especialidad;

		try {
			// Crear objeto medico:
			System.out.println("Nombre del médico:");
			nombre = sc.nextLine();

			System.out.println("Apellidos del médico:");
			apellidos = sc.nextLine();

			System.out.println("Especialidad del médico:");
			especialidad = sc.nextLine();

			Medico medico = new Medico(nombre, apellidos, especialidad);

			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Guardar objeto en la base de datos:
			session.save(medico);

			// Hacer commit en la transacción:
			session.getTransaction().commit();

			// Imprimir alumno guardado en la base de datos:
			System.out.println("Médico guardado: " + medico);

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