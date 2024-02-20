package modelo;

import modelo.Clientes;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class Crear {

	public static void main(String[] args) {

	    SessionFactory sessionFactory = new Configuration()
	            .configure("hibernate.cfg.xml")
	            .buildSessionFactory();

	    ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
	    context.bind(sessionFactory.openSession());

	    try {
	        // Crear objeto cliente
	        Clientes cliente = new Clientes("Alberto", "Málaga");

	        // Obtener la sesión actual
	        Session session = context.currentSession();

	        // Iniciar transacción
	        session.beginTransaction();

	        // Guardar objeto en la base de datos
	        session.save(cliente);

	        // Crear consulta HQL para seleccionar todos los registros de la tabla Clientes
	        String hql = "FROM Clientes";
	        Query query = session.createQuery(hql);

	        // Ejecutar consulta y obtener resultados
	        List<Clientes> clientes = query.list();

	        // Imprimir resultados
	        for (Clientes c : clientes) {
	            System.out.println("Cliente encontrado: " + c.toString());
	        }

	        // Hacer commit de la transacción
	        session.getTransaction().commit();

	        // Imprimir cliente guardado en la base de datos
	        System.out.println("Cliente guardado: " + cliente);

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        context.unbind(sessionFactory);
	        sessionFactory.close();
	    }
	}

    }


