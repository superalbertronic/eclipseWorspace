package modelo;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.Session;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------ Menú Principal ------");
            System.out.println("1. Gestionar Pacientes");
            System.out.println("2. Gestionar Médicos");
            System.out.println("3. Gestionar Citas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    gestionarPacientes(scanner);
                    break;
                case "2":
                    gestionarMedicos(scanner);
                    break;
                case "3":
                    gestionarCitas(scanner);
                    break;
                case "4":
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

    private static void gestionarPacientes(Scanner scanner) {
        while (true) {
            System.out.println("------ Menú Pacientes ------");
            System.out.println("1. Insertar Paciente");
            System.out.println("2. Actualizar Paciente");
            System.out.println("3. Mostrar Lista de Pacientes");
            System.out.println("4. Eliminar Paciente");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    insertarPaciente(scanner);
                    break;
                case "2":
                	ModificarRegistroPaciente.main(null);
                    break;
                case "3":
                	ConsultarDatosPaciente.main(null);
                    break;
                case "4":
                	EliminarRegistroPaciente.main(null);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
    private static void insertarPaciente(Scanner scanner) {
        // Lógica para insertar paciente
        System.out.println("------ Inserción de Paciente ------");

        // Recopila la información del nuevo paciente desde el usuario
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Historial: ");
        String historial = scanner.nextLine();

        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        try {
            // Obtener la sesión actual
            Session session = sessionFactory.getCurrentSession();

            // Iniciar transacción
            session.beginTransaction();

            // Crear un nuevo objeto Paciente y asignar los valores
            Paciente nuevoPaciente = new Paciente();
            nuevoPaciente.setNombre(nombre);
            nuevoPaciente.setApellidos(apellidos);
            nuevoPaciente.setCiudad(ciudad);
            nuevoPaciente.setDireccion(direccion);
            nuevoPaciente.setTelefono(telefono);
            nuevoPaciente.setEdad(edad);
            nuevoPaciente.setHistorial(historial);

            // Guardar el nuevo paciente en la base de datos
            session.save(nuevoPaciente);

            // Confirmar la transacción
            session.getTransaction().commit();

            System.out.println("Paciente insertado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar la sesión de Hibernate al finalizar
            sessionFactory.close();
        }
    }

    private static void gestionarMedicos(Scanner scanner) {
    	System.out.println("Error fatal");
        System.out.println("Volviendo al menú...");
        return;
    }

    private static void gestionarCitas(Scanner scanner) {
        System.out.println("Error fatal");
        System.out.println("Volviendo al menú...");
        return;
    }
    
}