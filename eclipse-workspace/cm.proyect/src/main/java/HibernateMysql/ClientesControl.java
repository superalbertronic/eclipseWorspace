package HibernateMysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientesControl {
    
    private SessionFactory sessionFactory;
    
    public ClientesControl() {
        this.sessionFactory = new Configuration()
                .configure("/HibernateMysql/hibernate.cfg.xml")
                .addAnnotatedClass(Clientes.class)
                .buildSessionFactory();
    }

    public String createUsuario(int id, String nombre, String ciudad) {
        Session session = null;
        Transaction tx = null;
        try {
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

           Clientes cliente = new Clientes(id, nombre, ciudad);
            session.save(cliente); // guarda el cliente

            tx.commit(); // se aceptan los cambios
            return "Cliente creado";
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return "Error al crear cliente";
        } finally {
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
