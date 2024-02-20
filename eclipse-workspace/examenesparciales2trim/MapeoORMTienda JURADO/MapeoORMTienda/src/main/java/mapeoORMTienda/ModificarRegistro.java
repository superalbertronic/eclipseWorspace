package mapeoORMTienda;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class ModificarRegistro {
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

            // Obtener el fabricante a modificar por su ID
            int fabricanteId = 5; // Aquí debes poner el ID del fabricante que deseas modificar
            FabricanteTienda fabricante = session.get(FabricanteTienda.class, fabricanteId);

            // Verificar si se encontró el fabricante
            if (fabricante != null) {
                // Modificar los atributos del fabricante
                fabricante.setNombre("NTTDATA");

                // Guardar los cambios en la base de datos
                session.update(fabricante);

                // Hacer el commit de la transacción
                session.getTransaction().commit();

                // Imprimir mensaje de confirmación
                System.out.println("Registro modificado exitosamente: " + fabricante);
            } else {
                System.out.println("No se encontró ningún fabricante con el ID proporcionado.");
            }

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
}
