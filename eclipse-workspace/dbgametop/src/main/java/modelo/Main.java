package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure() // Llama al archivo de configuración hibernate.cfg.xml
                .buildSessionFactory(); // Construir la sesión de Hibernate

        try {
            // Crear objeto juego
            Juegos juego = new Juegos("World of Wordcraft", 2010, "Blizzard", 
            		80.00, "Pedazo de juego", "todas");

            // Obtener la sesión actual
            Session session = sessionFactory.openSession();

            // Iniciar transacción
            Transaction transaction = session.beginTransaction();

            // Guardar objeto en la base de datos
            session.save(juego);

            // Hacer commit de la transacción
            transaction.commit();

            // Imprimir juego guardado en la base de datos
            System.out.println("Juego guardado en la base de datos: " + juego);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar la sesión de Hibernate
            sessionFactory.close();
        }
    }
}
