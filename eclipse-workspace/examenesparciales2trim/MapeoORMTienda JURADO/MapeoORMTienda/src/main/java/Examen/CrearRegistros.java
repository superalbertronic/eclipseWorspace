package Examen;

import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import Examen.Paciente;
import Examen.Medico;
import Examen.Cita;

public class CrearRegistros {
    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Crear pacientes
            Paciente paciente1 = new Paciente("Elde", "García", "Madrid", "Calle Mayor 123", "123456789", 30, "Sin historial");
            Paciente paciente2 = new Paciente("Elde", "López", "Barcelona", "Avenida Diagonal 456", "987654321", 25, "Historial médico disponible");

            // Crear médicos
            Medico medico1 = new Medico("Dr. Elde", "González", "Cardiología");
            Medico medico2 = new Medico("Dra. Elde", "Fernández", "Dermatología");

            // Crear citas
            Cita cita1 = new Cita(paciente1, medico1, Date.valueOf("2024-02-08"), "10:00");
            Cita cita2 = new Cita(paciente2, medico2, Date.valueOf("2024-02-10"), "11:30");

            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Guardar pacientes, médicos y citas en la base de datos
            session.save(paciente1);
            session.save(paciente2);
            session.save(medico1);
            session.save(medico2);
            session.save(cita1);
            session.save(cita2);

            // Hacer el commit de la transacción
            session.getTransaction().commit();

            // Imprimir mensaje de confirmación
            System.out.println("Registros creados exitosamente");

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
