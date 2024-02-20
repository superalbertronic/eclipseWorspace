package controlador;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

import modelo.Cita;
import modelo.Medico;
import modelo.Paciente;

import java.util.List;

public class CrearPaciente {

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
            String selectHqlBeforeInsert = "FROM fabricante";
            Query<Paciente> selectQueryBeforeInsert = session.createQuery(selectHqlBeforeInsert, Paciente.class);
            List<Paciente> pacienteBeforeInsert = selectQueryBeforeInsert.list();
        


            // Imprimir resultados antes de la inserción
            System.out.println("Registros en la tabla fabricante antes de la inserción:");
            for (Paciente f : pacienteBeforeInsert) {
                System.out.println(f.toString());
            }
        
            // Añadir un nuevo registro
            Paciente nuevoPaciente = new Paciente();
            Medico nuevoMedico = new Medico();
            Cita nuevoCita = new Cita();
            nuevoPaciente.setNombre("Pepe");
            nuevoMedico.setNombre("Juan");
            

            // Configura otros atributos según la estructura de tu entidad fabricante

            session.save(nuevoPaciente);
            session.save(nuevoMedico);
            session.save(nuevoCita);



            // Realizar una nueva consulta para obtener los datos después de la inserción
            String selectHqlAfterInsert = "FROM paciente";
            Query<Paciente> selectQueryAfterInsert = session.createQuery(selectHqlAfterInsert, Paciente.class);
            List<Paciente> pacientesAfterInsert = selectQueryAfterInsert.list();
          
            // Imprimir resultados después de la inserción
            System.out.println("Registros en la tabla fabricante después de la inserción:");
			for (Paciente f : pacientesAfterInsert) {
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

