package hospitalApp;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class InsertarCitas {

    public static void main(String[] args) {
        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Crear una nueva instancia de Citas
        Citas Citas = new Citas();
        Citas.setFecha("10/10/2024");
        Citas.setHora("10:30");
       

        // Guardar el Citas en la base de datos
        insertarCitas(Citas, sessionFactory);

        // Cerrar la sesión de Hibernate
        sessionFactory.close();
    }

    public static void insertarCitas(Citas Citas, SessionFactory sessionFactory) {
        // Obtener una nueva sesión de Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Iniciar una nueva transacción
            Transaction transaction = session.beginTransaction();

            // Guardar el Citas en la base de datos
            session.save(Citas);

            // Commit de la transacción
            transaction.commit();
            System.out.println("Citas insertada exitosamente en la base de datos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
