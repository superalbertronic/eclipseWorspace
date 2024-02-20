package paquete;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al Hospital Quirón. ¿En que puedo ayudarle? \n");
        System.out.println("------ Menú ------");
        System.out.println("1. Gestionar pacientes");
        System.out.println("2. Gestionar médicos");
        System.out.println("3. Gestionar citas");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        
        String opcion = sc.nextLine(); 
        
        switch(opcion) {
        case "1":
        	System.out.println("Está en el menú de pacientes, ¿que desea hacer? \n");
        	System.out.println("------ Menú Pacientes ------");
            System.out.println("1. Insertar paciente");
            System.out.println("2. Actualizar paciente");
            System.out.println("3. Mostrar lista de pacientes");
            System.out.println("4. Eliminar paciente");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            String opcionPaciente = sc.nextLine();
            	switch(opcionPaciente) {
            	case "1":
            		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
            		context.bind(sessionFactory.openSession());

            		try {
            			Paciente paciente = new Paciente("Roberto","Palacios", "Palencia", "Calle perchas 23",41 ,666789234, "Lesion en la femoral");
            			Session session = context.currentSession();
            			session.beginTransaction();
            			session.save(paciente);
            			session.getTransaction().commit();
            			System.out.println("Paciente: " + paciente);

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			ThreadLocalSessionContext.unbind(sessionFactory);
            			sessionFactory.close();
            		}
            		break;
            	case "2":
            		SessionFactory sessionFactory2 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context2 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory2);
            		context2.bind(sessionFactory2.openSession());

            		try {
            			Session session = context2.currentSession();

            			session.beginTransaction();

            			String updateHql = "UPDATE Paciente SET nombre = 'Alberto' WHERE id = 1";
            	        Query<?> updateQuery = session.createQuery(updateHql);
            	        updateQuery.executeUpdate();

            	        String selectHql = "FROM Paciente WHERE id = 1";
                        Query<Paciente> selectQuery = session.createQuery(selectHql, Paciente.class);
                        List<Paciente> pacientes = selectQuery.list();

                        System.out.println("Registros en la tabla Paciente después de la actualización:");
                        for (Paciente p : pacientes) {
                            System.out.println(p.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context2.unbind(sessionFactory2);
            			sessionFactory2.close();
            		}
            		
            		break;
            	case "3":
            		SessionFactory sessionFactory3 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

                    PacienteDAO pacienteoDAO = new OperacionesPaciente(sessionFactory3);

                    System.out.println("Pacientes existentes:");
                    pacienteoDAO.obtenerTodosLosPacientes().forEach(paciente -> {
                        System.out.println("ID: " + paciente.getId() + ", Nombre: " + paciente.getNombre() + ", Apellidos: " + paciente.getApellidos() + ", Ciudad: " + paciente.getCiudad() + ", Edad: " + paciente.getEdad() + ", Telefono: " + paciente.getTelefono() + ", Historial: " + paciente.getHistorial());
                    });

                    sessionFactory3.close();
            		break;
            	case "4":
            		SessionFactory sessionFactory4 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context4 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory4);
            		context4.bind(sessionFactory4.openSession());

            		try {
            			Session session = context4.currentSession();

            			session.beginTransaction();

            			String selectHqlBeforeDelete = "FROM Paciente WHERE id = 1";
                        Query<Paciente> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Paciente.class);
                        List<Paciente> pacientesBeforeDelete = selectQueryBeforeDelete.list();

                        System.out.println("Registros en la tabla Pacientes antes de la eliminación:");
                        for (Paciente p : pacientesBeforeDelete) {
                            System.out.println(p.toString());
                        }

                        String deleteHql = "DELETE FROM Paciente WHERE id = 1";
                        Query<?> deleteQuery = session.createQuery(deleteHql);
                        deleteQuery.executeUpdate();

                        String selectHqlAfterDelete = "FROM Paciente";
                        Query<Paciente> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Paciente.class);
                        List<Paciente> empleadosAfterDelete = selectQueryAfterDelete.list();

                        System.out.println("Registros en la tabla Paciente después de la eliminación:");
                        for (Paciente p : empleadosAfterDelete) {
                            System.out.println(p.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context4.unbind(sessionFactory4);
            			sessionFactory4.close();
            		}
            		break;
            	case "5":
            		System.out.println("Bienvenido al Hospital Quirón. ¿En que puedo ayudarle? \n");
                    System.out.println("------ Menú ------");
                    System.out.println("1. Gestionar pacientes");
                    System.out.println("2. Gestionar médicos");
                    System.out.println("3. Gestionar citas");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                   opcion = sc.nextLine();
            		break;
            	}
            	
        	break;
        case "2":
        	System.out.println("Está en el menú de Médicos, ¿que desea hacer? \n");
        	System.out.println("------ Menú Médicos ------");
            System.out.println("1. Insertar medico");
            System.out.println("2. Actualizar medico");
            System.out.println("3. Mostrar lista de medicos");
            System.out.println("4. Eliminar medico");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            String opcionMedico = sc.nextLine();
            	switch(opcionMedico) {
            	case "1":
            		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
            		context.bind(sessionFactory.openSession());

            		try {
            			Medico medico = new Medico("Camilo","Acuña", "Fisioterapeuta");
            			Session session = context.currentSession();
            			session.beginTransaction();
            			session.save(medico);
            			session.getTransaction().commit();
            			System.out.println("Medico: " + medico);

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			ThreadLocalSessionContext.unbind(sessionFactory);
            			sessionFactory.close();
            		}
            		
            		break;
            	case "2":
            		SessionFactory sessionFactory2 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context2 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory2);
            		context2.bind(sessionFactory2.openSession());

            		try {
            			Session session = context2.currentSession();

            			session.beginTransaction();

            			String updateHql = "UPDATE Medico SET nombre = 'Pedro' WHERE id = 1";
            	        Query<?> updateQuery = session.createQuery(updateHql);
            	        updateQuery.executeUpdate();

            	        String selectHql = "FROM Medico WHERE id = 1";
                        Query<Medico> selectQuery = session.createQuery(selectHql, Medico.class);
                        List<Medico> medicos = selectQuery.list();

                        System.out.println("Registros en la tabla Medico después de la actualización:");
                        for (Medico m : medicos) {
                            System.out.println(m.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context2.unbind(sessionFactory2);
            			sessionFactory2.close();
            		}
            		break;
            	case "3":
            		SessionFactory sessionFactory3 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

                    MedicoDAO medicoDAO = new OperacionesMedico(sessionFactory3);

                    System.out.println("Medicos existentes:");
                    medicoDAO.obtenerTodosLosMedicos().forEach(medico -> {
                        System.out.println("ID: " + medico.getId() + ", Nombre: " + medico.getNombre() + ", Apellidos: " + medico.getApellidos() + ", Especialidad: " + medico.getEspecialidad());
                    });

                    sessionFactory3.close();
            		break;
            	case "4":
            		SessionFactory sessionFactory4 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context4 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory4);
            		context4.bind(sessionFactory4.openSession());

            		try {
            			Session session = context4.currentSession();

            			session.beginTransaction();

            			String selectHqlBeforeDelete = "FROM Medico WHERE id = 1";
                        Query<Medico> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Medico.class);
                        List<Medico> medicosBeforeDelete = selectQueryBeforeDelete.list();

                        System.out.println("Registros en la tabla Medicos antes de la eliminación:");
                        for (Medico m : medicosBeforeDelete) {
                            System.out.println(m.toString());
                        }

                        String deleteHql = "DELETE FROM Medico WHERE id = 1";
                        Query<?> deleteQuery = session.createQuery(deleteHql);
                        deleteQuery.executeUpdate();

                        String selectHqlAfterDelete = "FROM Medico";
                        Query<Medico> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Medico.class);
                        List<Medico> medicosAfterDelete = selectQueryAfterDelete.list();

                        System.out.println("Registros en la tabla Medico después de la eliminación:");
                        for (Medico p : medicosAfterDelete) {
                            System.out.println(p.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context4.unbind(sessionFactory4);
            			sessionFactory4.close();
            		}
            		break;
            	case "5":
            		System.out.println("Bienvenido al Hospital Quirón. ¿En que puedo ayudarle? \n");
                    System.out.println("------ Menú ------");
                    System.out.println("1. Gestionar pacientes");
                    System.out.println("2. Gestionar médicos");
                    System.out.println("3. Gestionar citas");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                   opcion = sc.nextLine();
            		break;
            	}
            	
        	break;
        case "3":
        	System.out.println("Está en el menú de Citas, ¿que desea hacer? \n");
        	System.out.println("------ Menú Citas ------");
            System.out.println("1. Insertar cita");
            System.out.println("2. Actualizar cita");
            System.out.println("3. Mostrar lista de cita");
            System.out.println("4. Eliminar cita");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            
            String opcionCita = sc.nextLine();
            	switch(opcionCita) {
            	case "1":
            		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
            		context.bind(sessionFactory.openSession());

            		try {
            			Cita cita = new Cita(Date.valueOf("1990-05-05"),"16:00");
            			Session session = context.currentSession();
            			session.beginTransaction();
            			session.save(cita);
            			session.getTransaction().commit();
            			System.out.println("Medico: " + cita);

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			ThreadLocalSessionContext.unbind(sessionFactory);
            			sessionFactory.close();
            		}
            		break;
            	case "2":
            		SessionFactory sessionFactory2 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context2 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory2);
            		context2.bind(sessionFactory2.openSession());

            		try {
            			Session session = context2.currentSession();

            			session.beginTransaction();

            			String updateHql = "UPDATE Cita SET hora = '20:30' WHERE id = 1";
            	        Query<?> updateQuery = session.createQuery(updateHql);
            	        updateQuery.executeUpdate();

            	        String selectHql = "FROM Cita WHERE id = 1";
                        Query<Cita> selectQuery = session.createQuery(selectHql, Cita.class);
                        List<Cita> citas = selectQuery.list();

                        System.out.println("Registros en la tabla Cita después de la actualización:");
                        for (Cita c : citas) {
                            System.out.println(c.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context2.unbind(sessionFactory2);
            			sessionFactory2.close();
            		}
            		break;
            	case "3":
            		SessionFactory sessionFactory3 = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

                    CitaDAO citaDAO = new OperacionesCita(sessionFactory3);

                    System.out.println("Citas existentes:");
                    citaDAO.obtenerTodasLasCitas().forEach(cita -> {
                        System.out.println("ID: " + cita.getId() + ", Fecha: " + cita.getFecha() + ", Hora: " + cita.getHora());
                    });

                    sessionFactory3.close();
            		break;
            	case "4":
            		SessionFactory sessionFactory4 = new Configuration().configure().buildSessionFactory();

            		ThreadLocalSessionContext context4 = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory4);
            		context4.bind(sessionFactory4.openSession());

            		try {
            			Session session = context4.currentSession();

            			session.beginTransaction();

            			String selectHqlBeforeDelete = "FROM Cita WHERE id = 1";
                        Query<Cita> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Cita.class);
                        List<Cita> citasBeforeDelete = selectQueryBeforeDelete.list();

                        System.out.println("Registros en la tabla Cita antes de la eliminación:");
                        for (Cita c : citasBeforeDelete) {
                            System.out.println(c.toString());
                        }

                        String deleteHql = "DELETE FROM Cita WHERE id = 1";
                        Query<?> deleteQuery = session.createQuery(deleteHql);
                        deleteQuery.executeUpdate();

                        String selectHqlAfterDelete = "FROM Cita";
                        Query<Cita> selectQueryAfterDelete = session.createQuery(selectHqlAfterDelete, Cita.class);
                        List<Cita> citasAfterDelete = selectQueryAfterDelete.list();

                        System.out.println("Registros en la tabla Medico después de la eliminación:");
                        for (Cita c : citasAfterDelete) {
                            System.out.println(c.toString());
                        }

            			session.getTransaction().commit();

            		} catch (Exception e) {
            			e.printStackTrace();
            		} finally {
            			context4.unbind(sessionFactory4);
            			sessionFactory4.close();
            		}
            		break;
            	case "5":
            		System.out.println("Bienvenido al Hospital Quirón. ¿En que puedo ayudarle? \n");
                    System.out.println("------ Menú ------");
                    System.out.println("1. Gestionar pacientes");
                    System.out.println("2. Gestionar médicos");
                    System.out.println("3. Gestionar citas");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opción: ");
                    
                   opcion = sc.nextLine();
            		break;
            	}
            	
        	break;
        case "4":
        	System.out.println("\nHas salido del programa");
        	 System.exit(0);
        	break;
        }

	}

}
