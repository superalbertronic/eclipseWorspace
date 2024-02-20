package Examen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;

import java.util.Date;

public class ModificarRegistro {
    public static void main(String[] args) {
        // Configuración de la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Configuración de la sesión en el contexto actual
        ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
        context.bind(sessionFactory.openSession());

        // Se declara la sesión fuera del bloque try-catch para poder cerrarla correctamente en el bloque finally
        Session session = null;
        try {
            // Obtener la sesión actual
            session = context.currentSession();

            // Iniciar la transacción
            session.beginTransaction();

            // Modificar un registro de la clase Paciente por su ID
            int pacienteId = 19; // ID del paciente a modificar
            Paciente pacienteAModificar = session.get(Paciente.class, pacienteId);

            // Verificar si se encontró el paciente
            if (pacienteAModificar != null) {
                // Modificar los atributos del paciente
                pacienteAModificar.setNombre("Paco");
                pacienteAModificar.setApellidos("Nuevos Apellidos");
                pacienteAModificar.setCiudad("Nueva Ciudad");

                // Guardar los cambios en la base de datos
                session.update(pacienteAModificar);

                // Imprimir mensaje de confirmación
                System.out.println("Registro de Paciente modificado exitosamente: " + pacienteAModificar);
            } else {
                System.out.println("No se encontró ningún paciente con el ID proporcionado.");
            }

            // Modificar un registro de la clase Medico por su ID
            int medicoId = 16; // ID del médico a modificar
            Medico medicoAModificar = session.get(Medico.class, medicoId);

            // Verificar si se encontró el médico
            if (medicoAModificar != null) {
                // Modificar los atributos del médico
                medicoAModificar.setNombre("Paco");
                medicoAModificar.setApellidos("Nuevos Apellidos");
                medicoAModificar.setEspecialidad("Nueva Especialidad");

                // Guardar los cambios en la base de datos
                session.update(medicoAModificar);

                // Imprimir mensaje de confirmación
                System.out.println("Registro de Médico modificado exitosamente: " + medicoAModificar);
            } else {
                System.out.println("No se encontró ningún médico con el ID proporcionado.");
            }

            // Modificar un registro de la clase Cita por su ID
            int citaId = 8; // ID de la cita a modificar
            Cita citaAModificar = session.get(Cita.class, citaId);

            // Verificar si se encontró la cita
            if (citaAModificar != null) {
                // Modificar los atributos de la cita
                citaAModificar.setFecha(new Date());
                citaAModificar.setHora("12:00");

                // Guardar los cambios en la base de datos
                session.update(citaAModificar);

                // Imprimir mensaje de confirmación
                System.out.println("Registro de Cita modificado exitosamente: " + citaAModificar);
            } else {
                System.out.println("No se encontró ninguna cita con el ID proporcionado.");
            }

            // Hacer el commit de la transacción
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            // Si ocurre un error, hacer rollback de la transacción
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
