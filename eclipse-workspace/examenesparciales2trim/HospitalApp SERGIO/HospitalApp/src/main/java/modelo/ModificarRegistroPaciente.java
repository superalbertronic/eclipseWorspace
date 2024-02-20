package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class ModificarRegistroPaciente {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            Session session = context.currentSession();

            session.beginTransaction();

            Scanner scanner = new Scanner(System.in);
            System.out.print("ID del paciente: ");
            String id = scanner.nextLine();
            System.out.print("Campo a modificar: ");
            String campo = scanner.nextLine();
            System.out.print("Nuevo valor: ");
            String valor = scanner.nextLine();
            
            String updateHql = "UPDATE Paciente SET "+campo+" = '"+valor+"' WHERE id = 1";
            Query<?> updateQuery = session.createQuery(updateHql);
            updateQuery.executeUpdate();

            String selectHql = "FROM Paciente WHERE "+id+" = 1";
            Query<Paciente> selectQuery = session.createQuery(selectHql, Paciente.class);
            List<Paciente> pacientes = selectQuery.list();

            System.out.println("Registros en la tabla pacientes después de la actualización:");
            for (Paciente p : pacientes) {
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
