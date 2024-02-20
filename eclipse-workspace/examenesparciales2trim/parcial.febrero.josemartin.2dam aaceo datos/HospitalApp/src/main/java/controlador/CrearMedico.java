package controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import modelo.Medico;

import java.util.List;

public class CrearMedico {

    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Realizar una consulta para obtener los datos antes de la inserción
            String selectHqlBeforeInsert = "FROM Medico";
            Query<Medico> selectQueryBeforeInsert = session.createQuery(selectHqlBeforeInsert, Medico.class);
            List<Medico> MedicosBeforeInsert = selectQueryBeforeInsert.list();

            // Imprimir resultados antes de la inserción
            System.out.println("Registros en la tabla Medico antes de la inserción:");
            for (Medico f : MedicosBeforeInsert) {
                System.out.println(f.toString());
            }

            // Añadir un nuevo registro
            Medico nuevoMedico = new Medico();
            nuevoMedico.setNombre("Aragorn");
            // Configura otros atributos según la estructura de tu entidad Medico

            session.save(nuevoMedico);

            // Realizar una nueva consulta para obtener los datos después de la inserción
            String selectHqlAfterInsert = "FROM Medico";
            Query<Medico> selectQueryAfterInsert = session.createQuery(selectHqlAfterInsert, Medico.class);
            List<Medico> MedicosAfterInsert = selectQueryAfterInsert.list();

            // Imprimir resultados después de la inserción
            System.out.println("Registros en la tabla Medico después de la inserción:");
            for (Medico f : MedicosAfterInsert) {
                System.out.println(f.toString());
            }

            // Hacer commit de la transacción
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
