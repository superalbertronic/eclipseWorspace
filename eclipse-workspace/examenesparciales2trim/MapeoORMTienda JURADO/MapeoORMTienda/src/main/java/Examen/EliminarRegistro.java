package Examen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class EliminarRegistro {
    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        Session session = null;
        try {
            // Obtener la sesión actual
            session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Eliminar registro de Paciente por ID
            eliminarRegistroPorId(session, Paciente.class, 18);

            // Eliminar registro de Medico por ID
            eliminarRegistroPorId(session, Medico.class, 15);

            // Eliminar registro de Cita por ID
            eliminarRegistroPorId(session, Cita.class, 7);

            // Hacer el commit de la transacción
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (session != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Desligar la sesión del contexto
            ThreadLocalSessionContext.unbind(sessionFactory);
            // Cerrar la sesión de Hibernate
            sessionFactory.close();
        }
    }

    private static <T> void eliminarRegistroPorId(Session session, Class<T> entityClass, int id) {
        T registro = session.get(entityClass, id);
        if (registro != null) {
            session.delete(registro);
            System.out.println(entityClass.getSimpleName() + " con ID " + id + " eliminado correctamente");
        } else {
            System.out.println("No se encontró ningún " + entityClass.getSimpleName() + " con ID " + id);
        }
    }
}
