package modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class Main {

	public static void main(String[] args) {

	    // Configurar la sesi�n de Hibernate
	    SessionFactory sessionFactory = new Configuration()
	    	   .configure()//llama al fichero hibernate.cfg.xml

	          //  .configure("hibernate.cfg.xml") // Ruta del archivo de configuraci�n de Hibernate
	            .buildSessionFactory(); // Construir la sesi�n de Hibernate

	    // Configurar la sesi�n en el contexto actual
	    ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
	    context.bind(sessionFactory.openSession());

	    try {
	        // Crear objeto producto
	    	Productos producto = new Productos(
	    			"PORTATIL OMNIO",
	    			"PORTATIL 64 GIGAS",
	    			1200.00,"HP",20
	    			);


	        // Obtener la sesión actual
	        Session session = context.currentSession();

	        // Iniciar transacción
	        session.beginTransaction();

	        // Guardar objeto en la base de datos
	        session.save(producto);
	        
	        
	        

	        // Hacer commit de la transacción
	        session.getTransaction().commit();

	        // Imprimir fabricante guardado en la base de datos
	        System.out.println("PRODUCTO: " + producto);
	        
	       

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