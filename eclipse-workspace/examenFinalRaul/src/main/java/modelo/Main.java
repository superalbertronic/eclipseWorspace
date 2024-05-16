package modelo;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		byte opcion;
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());
		System.out.println("Bienvenido al sistema de gestión de asignaturas");
		
		try {
			
		do {
			System.out.println("\nEliga una opción. \n1. Dar de alta asignatura."
					+ "\n2. Ver todas las asignaturas. \n3. Salir.");
			opcion=Byte.parseByte(sc.nextLine());
			switch(opcion){
			case 1:
				System.out.println("Escribe el nombre");
				String nombre = sc.nextLine();
				System.out.println("Escribe el codigo");
				String codigo = sc.nextLine();
				System.out.println("Escribe el departamento");
				String departamento = sc.nextLine();
				System.out.println("Escribe el creditos");
				int creditos = sc.nextInt();
				System.out.println("Escribe el descripcion");
				String descripcion = sc.nextLine();
				
				Asignaturas asignatura = new Asignaturas(nombre, codigo, departamento, creditos, descripcion);
				
				Session session = context.currentSession();
				session.beginTransaction();
				session.save(asignatura);
				session.getTransaction().commit();
				System.out.println("Asignatura dada de alta: " + asignatura);
				break;
			case 2:
				Session session2 = context.currentSession();
				session2.beginTransaction();
				String hql = "From Asignaturas";
				Query<Asignaturas> query = session2.createQuery(hql, Asignaturas.class);
				
				List<Asignaturas> asignaturas = query.list();
				
				System.out.println("Registros en la tabla asignaturas: ");
				for(Asignaturas a : asignaturas) {
					System.out.println(a.toString());
				}
				session2.getTransaction().commit();
				break;
			case 3:
				System.out.println("Hasta pronto");
				break;
			}
			
			
		}while(opcion!=3);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ThreadLocalSessionContext.unbind(sessionFactory);
			sessionFactory.close();
		}
		
	}

}
