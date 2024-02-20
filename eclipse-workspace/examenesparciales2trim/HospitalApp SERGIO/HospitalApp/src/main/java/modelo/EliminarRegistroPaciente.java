package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class EliminarRegistroPaciente {
    
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            Scanner scanner = new Scanner(System.in);
            System.out.print("ID del paciente que quiere eliminar: ");
            String id = scanner.nextLine();
            
            String selectHqlBeforeDelete = "FROM Paciente WHERE id = "+id;;
            Query<Paciente> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Paciente.class);
            List<Paciente> pacientesBeforeDelete = selectQueryBeforeDelete.list();

            System.out.println("Registros en la tabla pacientes antes de la eliminación:");
            for (Paciente p : pacientesBeforeDelete) {
                System.out.println(p.toString());
            }

            String deleteHql = "DELETE FROM Paciente WHERE id = "+id;
            Query<?> deleteQuery = session.createQuery(deleteHql);
            deleteQuery.executeUpdate();

            String selectHqlAfterDelete = "FROM Paciente";
            Query<Paciente> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Paciente.class);
            List<Paciente> pacientesAfterDelete = selectQueryAfterDelete.list();

            System.out.println("Registros en la tabla pacientes después de la eliminación:");
            for (Paciente p : pacientesAfterDelete) {
                System.out.println(p.toString());
            }

            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            context.unbind(sessionFactory);
            sessionFactory.close();
        }
    }
}
