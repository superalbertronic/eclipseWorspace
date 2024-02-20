package modelo;

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
		boolean cerrar = false;
		boolean salir = false;
		byte opcionMenu = 0;
		byte opcionPaciente = 0;
		byte opcionMedico = 0;
		byte opcionCita = 0;
		Paciente paciente = new Paciente("Maximilian", "Kotlin", "Málaga", "Calle Cenec", "123456789", 20,
				"No tiene historial");
		Medico medico = new Medico("Javier", "Vela", "Ser malo");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		ThreadLocalSessionContext.bind(sessionFactory.openSession());

		do {
			try {

				System.out.println("------ Menú ------");
				System.out.println("1. Gestionar pacientes");
				System.out.println("2. Gestionar médicos");
				System.out.println("3. Gestionar citas");
				System.out.println("4. Salir");
				System.out.print("Seleccione una opción: ");
				opcionMenu = Byte.parseByte(sc.nextLine());

				do {
					switch (opcionMenu) {
					case 1:
						System.out.println("------ Menú Pacientes ------");
						System.out.println("1. Insertar paciente");
						System.out.println("2. Actualizar paciente");
						System.out.println("3. Mostrar lista de pacientes");
						System.out.println("4. Eliminar paciente");
						System.out.println("5. Volver al menú principal");
						System.out.print("Seleccione una opción: ");
						opcionPaciente = Byte.parseByte(sc.nextLine());

						switch (opcionPaciente) {
						case 1:
							salir = false;
							// InsertarPaciente

							Session session1 = context.currentSession();

							session1.beginTransaction();

							session1.save(paciente);

							session1.getTransaction().commit();

							System.out.println("Paciente: " + paciente);
							break;
						case 2:
							// ActualizarPaciente
							Session session2 = context.currentSession();
							session2.beginTransaction();

							String updateHql = "UPDATE Paciente SET nombre='Rodrigo' WHERE id=1";
							Query<?> updateQuery = session2.createQuery(updateHql);
							updateQuery.executeUpdate();

							String selectHql = "FROM Paciente WHERE id=1";
							Query<Paciente> selectQuery = session2.createQuery(selectHql, Paciente.class);
							List<Paciente> pacienteA = selectQuery.list();

							System.out.println("Registros de la tabla pacientes después de la actualización: ");
							for (Paciente p : pacienteA) {
								System.out.println(p.toString());
							}
							session2.getTransaction().commit();
							break;
						case 3:
							// MostrarPaciente
							Session session3 = context.currentSession();
							session3.beginTransaction();

							String hql = "FROM Paciente";
							Query<Paciente> query = session3.createQuery(hql, Paciente.class);

							List<Paciente> pacienteM = query.list();

							System.out.println("Registros en la tabla Paciente:");
							for (Paciente p : pacienteM) {
								System.out.println(p.toString());
							}
							session3.getTransaction().commit();
							break;
						case 4:
							// EliminarPaciente
							Session session4 = context.currentSession();

							session4.beginTransaction();

							String selectHqlBeforeDelete = "FROM Paciente WHERE id = 1";
							Query<Paciente> selectQueryBeforeDelete = session4.createQuery(selectHqlBeforeDelete,
									Paciente.class);
							List<Paciente> pacientesBeforeDelete = selectQueryBeforeDelete.list();

							System.out.println("Registros en la tabla pacientes antes de la eliminación:");
							for (Paciente p : pacientesBeforeDelete) {
								System.out.println(p.toString());
							}

							String deleteHql = "DELETE FROM Paciente WHERE id = 1";
							Query<?> deleteQuery = session4.createQuery(deleteHql);
							deleteQuery.executeUpdate();

							String selectHqlAfterDelete = "FROM Paciente";
							Query<Paciente> selectQueryAfterDelete = session4.createQuery(selectHqlAfterDelete,
									Paciente.class);
							List<Paciente> pacientesAfterDelete = selectQueryAfterDelete.list();

							System.out.println("Registros en la tabla Cliente después de la eliminación:");
							for (Paciente p : pacientesAfterDelete) {
								System.out.println(p.toString());
							}

							session4.getTransaction().commit();
							break;
						case 5:
							// Volver
							salir = true;
							break;
						default:
							System.out.println("Opción inválida");
							break;
						}

						break;
					case 2:
						System.out.println("------ Menú Médicos ------");
						System.out.println("1. Insertar médico");
						System.out.println("2. Actualizar médico");
						System.out.println("3. Mostrar lista de médicos");
						System.out.println("4. Eliminar médico");
						System.out.println("5. Volver al menú principal");
						System.out.print("Seleccione una opción: ");
						opcionMedico = Byte.parseByte(sc.nextLine());
						switch (opcionMedico) {
						case 1:
							salir = false;
							// InsertarMedico
							Session session1 = context.currentSession();

							session1.beginTransaction();

							session1.save(medico);

							session1.getTransaction().commit();

							System.out.println("Médico: " + medico);
							break;
						case 2:
							// ActualizarMedico
							Session session2 = context.currentSession();
							session2.beginTransaction();

							String updateHql = "UPDATE Medico SET nombre='Daniel' WHERE id=1";
							Query<?> updateQuery = session2.createQuery(updateHql);
							updateQuery.executeUpdate();

							String selectHql = "FROM Medico WHERE id=1";
							Query<Medico> selectQuery = session2.createQuery(selectHql, Medico.class);
							List<Medico> medicoA = selectQuery.list();

							System.out.println("Registros de la tabla medicos después de la actualización: ");
							for (Medico m : medicoA) {
								System.out.println(m.toString());
							}
							session2.getTransaction().commit();
							break;
						case 3:
							// MostrarMedico
							Session session3 = context.currentSession();
							session3.beginTransaction();

							String hql = "FROM Medico";
							Query<Medico> query = session3.createQuery(hql, Medico.class);

							List<Medico> medicoM = query.list();

							System.out.println("Registros en la tabla Medico:");
							for (Medico m : medicoM) {
								System.out.println(m.toString());
							}
							session3.getTransaction().commit();
							break;
						case 4:
							// EliminarMedico
							Session session4 = context.currentSession();

							session4.beginTransaction();

							String selectHqlBeforeDelete = "FROM Medico WHERE id = 1";
							Query<Medico> selectQueryBeforeDelete = session4.createQuery(selectHqlBeforeDelete,
									Medico.class);
							List<Medico> medicosBeforeDelete = selectQueryBeforeDelete.list();

							System.out.println("Registros en la tabla medico antes de la eliminación:");
							for (Medico m : medicosBeforeDelete) {
								System.out.println(m.toString());
							}

							String deleteHql = "DELETE FROM Medico WHERE id = 1";
							Query<?> deleteQuery = session4.createQuery(deleteHql);
							deleteQuery.executeUpdate();

							String selectHqlAfterDelete = "FROM Medico";
							Query<Medico> selectQueryAfterDelete = session4.createQuery(selectHqlAfterDelete,
									Medico.class);
							List<Medico> medicosAfterDelete = selectQueryAfterDelete.list();

							System.out.println("Registros en la tabla Medico después de la eliminación:");
							for (Medico m : medicosAfterDelete) {
								System.out.println(m.toString());
							}

							session4.getTransaction().commit();
							break;
						case 5:
							// Volver
							salir = true;
							break;
						default:
							System.out.println("Opción inválida");
							break;
						}

						break;
					case 3:
						System.out.println("------ Menú Citas ------");
						System.out.println("1. Insertar cita");
						System.out.println("2. Actualizar cita");
						System.out.println("3. Mostrar lista de citas");
						System.out.println("4. Volver al menú principal");
						System.out.print("Seleccione una opción: ");
						opcionCita = Byte.parseByte(sc.nextLine());
						switch (opcionCita) {
						case 1:
							salir = false;
							// InsertarCita
							Cita cita = new Cita(paciente, medico, Date.valueOf("1990-05-05"), "12:23");

							Session session1 = context.currentSession();

							session1.beginTransaction();

							session1.save(cita);

							session1.getTransaction().commit();

							System.out.println("Cita: " + cita);
							break;
						case 2:
							// ActualizarCita
							Session session2 = context.currentSession();
							session2.beginTransaction();

							String updateHql = "UPDATE Cita SET hora='01:30' WHERE id=1";
							Query<?> updateQuery = session2.createQuery(updateHql);
							updateQuery.executeUpdate();

							String selectHql = "FROM Cita WHERE id=1";
							Query<Cita> selectQuery = session2.createQuery(selectHql, Cita.class);
							List<Cita> citaA = selectQuery.list();

							System.out.println("Registros de la tabla citas después de la actualización: ");
							for (Cita c : citaA) {
								System.out.println(c.toString());
							}
							session2.getTransaction().commit();
							break;
						case 3:
							// MostrarCita
							Session session3 = context.currentSession();
							session3.beginTransaction();

							String hql = "FROM Cita";
							Query<Cita> query = session3.createQuery(hql, Cita.class);

							List<Cita> citaM = query.list();

							System.out.println("Registros en la tabla Cita:");
							for (Cita c : citaM) {
								System.out.println(c.toString());
							}
							session3.getTransaction().commit();
							break;
						case 4:
							// Volver
							salir = true;
							break;
						default:
							System.out.println("Opción inválida");
							break;
						}

						break;
					case 4:
						cerrar = true;
						break;
					default:
						System.out.println("Opción inválida");
						break;
					}
				} while (!salir);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}

		} while (!cerrar);
		ThreadLocalSessionContext.unbind(sessionFactory);
		sessionFactory.close();
	}

}
