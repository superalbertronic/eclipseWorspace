package mapeoORMTienda;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class MainTienda {

    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration()
                .configure() // llama al fichero hibernate.cfg.xml
                .buildSessionFactory(); // Construir la sesión de Hibernate

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Crear el objeto fabricante
            FabricanteTienda fabricante = new FabricanteTienda("Google España");

            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Guardar el objeto en la base de datos
            session.save(fabricante);

            // Hacer el commit de la transacción
            session.getTransaction().commit();

            // Imprimir el fabricante guardado en la base de datos
            System.out.println("Fabricante guardado: " + fabricante);

            // Crear consulta HQL para seleccionar todos los registros de la tabla fabricante
            String hql = "FROM FabricanteTienda";
            Query<FabricanteTienda> query = session.createQuery(hql, FabricanteTienda.class);

            // Ejecutar consulta y obtener resultados
            List<FabricanteTienda> fabricantes = query.list();

            // Imprimir resultados
            System.out.println("Registros en la tabla fabricante:");
            for (FabricanteTienda f : fabricantes) {
                System.out.println(f.toString());
            }

            // Añadir fabricante
            FabricanteTienda fabricante1 = new FabricanteTienda("pc gaming2");

            // Iniciar transacción
            session.beginTransaction();

            // Guardar el objeto fabricante en la base de datos
            session.save(fabricante1);

            // Hacer commit de la transacción
            session.getTransaction().commit();

            // Crear objeto producto
            Producto producto = new Producto("PORTATIL gaming2", 3000, fabricante1);

            // Iniciar transacción
            session.beginTransaction();

            // Guardar el objeto producto en la base de datos
            session.save(producto);

            // Hacer commit de la transacción
            session.getTransaction().commit();

            // Añadir compra
            Compras compra = new Compras(Date.valueOf("1999-03-05"), fabricante1, producto, 88);

            // Iniciar transacción
            session.beginTransaction();

            // Guardar el objeto compra en la base de datos
            session.save(compra);

            // Hacer commit de la transacción
            session.getTransaction().commit();

            // Imprimir por pantalla objetos creados
            System.out.println(producto.toString());
            System.out.println(fabricante1.toString());
            System.out.println(compra.toString());

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
