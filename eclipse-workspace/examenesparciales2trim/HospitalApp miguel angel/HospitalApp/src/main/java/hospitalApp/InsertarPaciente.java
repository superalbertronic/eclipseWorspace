package hospitalApp;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class InsertarPaciente {

    public static void main(String[] args) {
        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Crear una nueva instancia de Paciente
        Pacientes paciente = new Pacientes();
        paciente.setNombre("Paco");
        paciente.setApellidos("Lopez");
        paciente.setCiudad("Malaga");
        paciente.setDireccion("Urbanizacion Sauce");
        paciente.setTelefono("111111111");
        paciente.setEdad(30);
        paciente.setHistorial("Resfriado");

        // Guardar el paciente en la base de datos
        insertarPaciente(paciente, sessionFactory);

        // Cerrar la sesión de Hibernate
        sessionFactory.close();
    }

    public static void insertarPaciente(Pacientes paciente, SessionFactory sessionFactory) {
        // Obtener una nueva sesión de Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Iniciar una nueva transacción
            Transaction transaction = session.beginTransaction();

            // Guardar el paciente en la base de datos
            session.save(paciente);

            // Commit de la transacción
            transaction.commit();
            System.out.println("Paciente insertado exitosamente en la base de datos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}