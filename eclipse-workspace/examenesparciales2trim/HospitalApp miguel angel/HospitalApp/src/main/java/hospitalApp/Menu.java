package hospitalApp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean salir = false;
		do {
			System.out.println("------ Menú ------");
			System.out.println("1. Insertar paciente");
			System.out.println("2. Actualizar paciente");
			System.out.println("3. Mostrar lista de pacientes");
			System.out.println("4. Eliminar paciente");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				Pacientes nuevoPaciente = crearPaciente(scanner);
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				InsertarPaciente.insertarPaciente(nuevoPaciente, sessionFactory);
				sessionFactory.close();
				break;
			case 2:
			    System.out.print("Ingrese el ID del paciente a actualizar: ");
			    int idActualizar = scanner.nextInt();
			    scanner.nextLine();
			    System.out.print("Ingrese el nuevo nombre del paciente: ");
			    String nuevoNombre = scanner.nextLine();
			    SessionFactory sessionFactory3 = new Configuration().configure().buildSessionFactory();
			    modificarPaciente(idActualizar, nuevoNombre, sessionFactory3);
			    sessionFactory3.close();
			    break;
			case 3:
				SessionFactory sessionFactory1 = new Configuration().configure().buildSessionFactory();
				mostrarPacientes(sessionFactory1);
				sessionFactory1.close();
				break;
			case 4:
				System.out.print("Ingrese el ID del paciente a eliminar: ");
				int idEliminar = scanner.nextInt();
				SessionFactory sessionFactory2 = new Configuration().configure().buildSessionFactory();
				eliminarPaciente(idEliminar, sessionFactory2);
				sessionFactory2.close();
				break;
			case 5:
				salir = true;
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		} while (!salir);

		scanner.close();
	}

	private static void mostrarPacientes(SessionFactory sessionFactory) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            String hql = "FROM Pacientes";
            Query<Pacientes> query = session.createQuery(hql, Pacientes.class);

            List<Pacientes> pacientes = query.list();

            System.out.println("Registros en la tabla pacientes:");
            for (Pacientes paciente : pacientes) {
                System.out.println(paciente.toString());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static Pacientes crearPaciente(Scanner scanner) {

		Pacientes paciente = new Pacientes();

		System.out.print("Nombre: ");
		paciente.setNombre(scanner.nextLine());

		System.out.print("Apellidos: ");
		paciente.setApellidos(scanner.nextLine());

		System.out.print("Ciudad: ");
		paciente.setCiudad(scanner.nextLine());

		System.out.print("Dirección: ");
		paciente.setDireccion(scanner.nextLine());

		System.out.print("Teléfono: ");
		paciente.setTelefono(scanner.nextLine());

		System.out.print("Edad: ");
		paciente.setEdad(scanner.nextInt());
		scanner.nextLine();

		System.out.print("Historial: ");
		paciente.setHistorial(scanner.nextLine());

		return paciente;
	}

	private static void eliminarPaciente(int idPaciente, SessionFactory sessionFactory) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();

			String selectHqlBeforeDelete = "FROM Pacientes";
			Query<Pacientes> selectQueryBeforeDelete = session.createQuery(selectHqlBeforeDelete, Pacientes.class);
			List<Pacientes> pacientesBeforeDelete = selectQueryBeforeDelete.list();

			System.out.println("Registros en la tabla pacientes antes de la eliminación:");
			for (Pacientes paciente : pacientesBeforeDelete) {
				System.out.println(paciente.toString());
			}

			String deleteHql = "DELETE FROM Pacientes WHERE id = :id";
			Query<?> deleteQuery = session.createQuery(deleteHql);
			deleteQuery.setParameter("id", idPaciente);
			int deletedCount = deleteQuery.executeUpdate();

			if (deletedCount > 0) {
				System.out.println("Paciente con ID " + idPaciente + " eliminado exitosamente.");
			} else {
				System.out.println("No se encontró ningún paciente con el ID " + idPaciente + ".");
			}

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public static void modificarPaciente(int idPaciente, String nuevoNombre, SessionFactory sessionFactory) {
	        try (Session session = sessionFactory.openSession()) {
	            Transaction transaction = session.beginTransaction();

	            String updateHql = "UPDATE Pacientes SET nombre = :nuevoNombre WHERE id = :id";
	            Query<?> updateQuery = session.createQuery(updateHql);
	            updateQuery.setParameter("nuevoNombre", nuevoNombre);
	            updateQuery.setParameter("id", idPaciente);
	            int updatedCount = updateQuery.executeUpdate();

	            if (updatedCount > 0) {
	                System.out.println("Paciente con ID " + idPaciente + " actualizado exitosamente.");
	            } else {
	                System.out.println("No se encontró ningún paciente con el ID " + idPaciente + ".");
	            }

	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
