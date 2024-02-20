package modelo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class InsertarDatosPaciente {

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
		String ciudad;
		String direccion;
		String telefono;
		int edad;
		String historial;	
		
		try {
			// Crear objeto paciente:
			System.out.println("Nombre del paciente:");
			nombre = sc.nextLine();
			
			System.out.println("Apellidos del paciente:");
			apellidos = sc.nextLine();
			
			System.out.println("Ciudad del paciente:");
			ciudad = sc.nextLine();
			
			System.out.println("Dirección del paciente:");
			direccion = sc.nextLine();
			
			System.out.println("Teléfono del paciente:");
			telefono = sc.nextLine();
			
			System.out.println("Edad del paciente:");
			edad = Integer.parseInt(sc.nextLine());
					
			System.out.println("Historial del paciente:");
			historial = sc.nextLine();
			
			Paciente paciente = new Paciente(nombre, apellidos, ciudad, direccion, telefono, edad, historial);
			
			// Obtener la sesión actual:
			Session session = context.currentSession();

			// Iniciar transacción:
			session.beginTransaction();

			// Guardar objeto en la base de datos:
			session.save(paciente);

			// Hacer commit en la transacción:
			session.getTransaction().commit();

			// Imprimir alumno guardado en la base de datos:
			System.out.println("Paciente guardado: " + paciente);

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