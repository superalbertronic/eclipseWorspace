package Examen;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import Examen.Paciente;
import Examen.Medico;
import Examen.Cita;

public class ConsultarRegistros {
    public static void main(String[] args) {

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Configurar la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        try {
            // Obtener la sesión actual
            Session session = context.currentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Consultar todos los registros de Paciente
            List<Paciente> pacientes = session.createQuery("FROM Paciente", Paciente.class).getResultList();

            // Consultar todos los registros de Medico
            List<Medico> medicos = session.createQuery("FROM Medico", Medico.class).getResultList();

            // Consultar todos los registros de Cita
            List<Cita> citas = session.createQuery("FROM Cita", Cita.class).getResultList();

            // Hacer commit de la transacción
            session.getTransaction().commit();

            // Imprimir resultados
            System.out.println("Registros en la tabla Paciente:");
            for (Paciente paciente : pacientes) {
                System.out.println(paciente);
            }

            System.out.println("Registros en la tabla Medico:");
            for (Medico medico : medicos) {
                System.out.println(medico);
            }

            System.out.println("Registros en la tabla Cita:");
            for (Cita cita : citas) {
                System.out.println(cita);
            }

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
