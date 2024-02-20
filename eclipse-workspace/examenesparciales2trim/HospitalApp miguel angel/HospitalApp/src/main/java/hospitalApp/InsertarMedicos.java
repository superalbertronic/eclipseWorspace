package hospitalApp;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class InsertarMedicos {

    public static void main(String[] args) {
        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Crear una nueva instancia de Medicos
        Medicos Medicos = new Medicos();
        Medicos.setNombre("Rodolfo");
        Medicos.setApellidos("Mandarin");
        Medicos.setEspecialidad("Cabecera");

        // Guardar el Medicos en la base de datos
        insertarMedicos(Medicos, sessionFactory);

        // Cerrar la sesión de Hibernate
        sessionFactory.close();
    }

    public static void insertarMedicos(Medicos Medicos, SessionFactory sessionFactory) {
        // Obtener una nueva sesión de Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Iniciar una nueva transacción
            Transaction transaction = session.beginTransaction();

            // Guardar el Medicos en la base de datos
            session.save(Medicos);

            // Commit de la transacción
            transaction.commit();
            System.out.println("Medicos insertada exitosamente en la base de datos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}