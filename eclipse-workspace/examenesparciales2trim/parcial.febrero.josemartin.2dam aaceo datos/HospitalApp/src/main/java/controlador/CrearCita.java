package controlador;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import modelo.Cita;

import java.util.List;

public class CrearCita {

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
            String selectHqlBeforeInsert = "FROM Cita";
            Query<Cita> selectQueryBeforeInsert = session.createQuery(selectHqlBeforeInsert, Cita.class);
            List<Cita> CitasBeforeInsert = selectQueryBeforeInsert.list();

            // Imprimir resultados antes de la inserción
            System.out.println("Registros en la tabla Cita antes de la inserción:");
            for (Cita f : CitasBeforeInsert) {
                System.out.println(f.toString());
            }

            // Añadir un nuevo registro
            Cita nuevoCita = new Cita();
            nuevoCita.setId("Aragorn");
            // Configura otros atributos según la estructura de tu entidad Cita

            session.save(nuevoCita);

            // Realizar una nueva consulta para obtener los datos después de la inserción
            String selectHqlAfterInsert = "FROM Cita";
            Query<Cita> selectQueryAfterInsert = session.createQuery(selectHqlAfterInsert, Cita.class);
            List<Cita> CitasAfterInsert = selectQueryAfterInsert.list();

            // Imprimir resultados después de la inserción
            System.out.println("Registros en la tabla Cita después de la inserción:");
            for (Cita f : CitasAfterInsert) {
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

