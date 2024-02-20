package mapeoORMTienda;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

public class ConsultarRegistros {
    public static void main(String[] args) {

        // Configurar la sesion de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Configurar la sesion en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Consultar todos los registros de FabricanteTienda
            List<FabricanteTienda> fabricantes = session.createQuery("FROM FabricanteTienda", FabricanteTienda.class).getResultList();

            // Hacer commit de la transacción
            session.getTransaction().commit();

            // Imprimir resultados
            System.out.println("Registros en la tabla FabricanteTienda:");
            for (FabricanteTienda fabricante : fabricantes) {
                System.out.println(fabricante);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Desligar la sesion del contexto
            ThreadLocalSessionContext.unbind(sessionFactory);
            // Cerrar la sesion de Hibernate
            sessionFactory.close();
        }
    }
}
