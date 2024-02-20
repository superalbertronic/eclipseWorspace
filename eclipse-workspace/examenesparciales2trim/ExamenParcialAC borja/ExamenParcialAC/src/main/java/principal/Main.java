package principal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import java.util.Scanner;

public class Main {
	// Configurar Hibernate
	static Configuration configuration = new Configuration().configure();
	static SessionFactory sessionFactory = configuration.buildSessionFactory();
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		boolean salir = false;


		while (!salir) {
			System.out.println("------ Menú ------");
			System.out.println("1. Gestionar pacientes");
			System.out.println("2. Gestionar médicos");
			System.out.println("3. Gestionar citas");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");
			int opcionMenuPrincipal = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcionMenuPrincipal) {
			case 1:
				gestionarPacientes(scanner);
				break;
			case 2:
				gestionarMedicos(scanner);
				break;
			case 3:
				
				System.out.println("WIP");
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Opción inválida. Inténtalo de nuevo.");
				break;
			}
		}
		System.out.println("¡Hasta luego!");
	}

	private static void gestionarPacientes(Scanner scanner) {
		boolean volverMenuPrincipal = false;
		PacienteDAO pacienteDAO = new PacienteDAOHibernate(sessionFactory);

		while (!volverMenuPrincipal) {
			System.out.println("\n------ Menú Pacientes ------");
			System.out.println("1. Insertar paciente");
			System.out.println("2. Actualizar paciente");
			System.out.println("3. Mostrar lista de pacientes");
			System.out.println("4. Eliminar paciente");
			System.out.println("5. Volver al menú principal");
			System.out.print("Seleccione una opción: ");
			int opcionMenuPacientes = scanner.nextInt();
			scanner.nextLine(); // Consumir salto de línea

			switch (opcionMenuPacientes) {
			case 1:
				insertarPaciente(scanner, pacienteDAO);
				break;
			case 2:
				insertarPaciente(scanner, pacienteDAO);
				break;
			case 3:
		        for (Paciente paciente : pacienteDAO.getAllPacientes()) {
		            System.out.println(paciente.getNombre() + " " + paciente.getApellidos());
		        }
				break;
			case 4:
				System.out.println("WIP.");
				break;
			case 5:
				volverMenuPrincipal = true;
				break;
			default:
				System.out.println("Opción inválida. Inténtalo de nuevo.");
				break;
			}
		}
	}

	private static void insertarPaciente(Scanner scanner, PacienteDAO pacienteDAO) {
		Paciente paciente = new Paciente();
		System.out.println("Ingrese el nombre del paciente:");
		paciente.setNombre(scanner.nextLine());
		System.out.println("Ingrese los apellidos del paciente:");
		paciente.setApellidos(scanner.nextLine());
		System.out.println("Ingrese la ciudad del paciente:");
		paciente.setCiudad(scanner.nextLine());
		System.out.println("Ingrese la dirección del paciente:");
		paciente.setDireccion(scanner.nextLine());
		System.out.println("Ingrese el teléfono del paciente:");
		paciente.setTelefono(scanner.nextLine());
		System.out.println("Ingrese la edad del paciente:");
		paciente.setEdad(scanner.nextInt());
		scanner.nextLine(); // Consumir salto de línea
		System.out.println("Ingrese el historial del paciente:");
		paciente.setHistorial(scanner.nextLine());

		pacienteDAO.addPaciente(paciente);
		System.out.println("Paciente agregado con éxito.");
	}
	
	private static void gestionarMedicos(Scanner scanner) {
	    boolean volverMenuPrincipal = false;
	    MedicoDAO medicoDAO = new MedicoDAOHibernate(sessionFactory);

	    while (!volverMenuPrincipal) {
	        System.out.println("\n------ Menú Médicos ------");
	        System.out.println("1. Insertar médico");
	        System.out.println("2. Actualizar médico");
	        System.out.println("3. Mostrar lista de médicos");
	        System.out.println("4. Eliminar médico");
	        System.out.println("5. Volver al menú principal");
	        System.out.print("Seleccione una opción: ");
	        int opcionMenuMedicos = scanner.nextInt();
	        scanner.nextLine(); // Consumir salto de línea

	        switch (opcionMenuMedicos) {
	            case 1:
	                insertarMedico(scanner, medicoDAO);
	                break;
	            case 2:
	                insertarMedico(scanner, medicoDAO);
	                break;
	            case 3:
	            	for (Medico medico : medicoDAO.getAllMedicos()) {
	                    System.out.println(medico.getNombre() + " " + medico.getApellidos() + " - " + medico.getEspecialidad());
	                }
	                break;
	            case 4:
	                System.out.println("WIP");
	                break;
	            case 5:
	                volverMenuPrincipal = true;
	                break;
	            default:
	                System.out.println("Opción inválida. Inténtalo de nuevo.");
	                break;
	        }
	    }
	}

	private static void gestionarCitas(Scanner scanner) {
	    boolean volverMenuPrincipal = false;
	    CitaDAO citaDAO = new CitaDAOHibernate(sessionFactory);

	    while (!volverMenuPrincipal) {
	        System.out.println("\n------ Menú Citas ------");
	        System.out.println("1. Insertar cita");
	        System.out.println("2. Actualizar cita");
	        System.out.println("3. Mostrar lista de citas");
	        System.out.println("4. Eliminar cita");
	        System.out.println("5. Volver al menú principal");
	        System.out.print("Seleccione una opción: ");
	        int opcionMenuCitas = scanner.nextInt();
	        scanner.nextLine(); // Consumir salto de línea

	        switch (opcionMenuCitas) {
	            case 1:
	                System.out.println("Las cistas esta work in progress");
	                break;
	            case 2:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 3:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 4:
	            	System.out.println("Las cistas esta work in progress");
	                break;
	            case 5:
	                volverMenuPrincipal = true;
	                break;
	            default:
	                System.out.println("Opción inválida. Inténtalo de nuevo.");
	                break;
	        }
	    }
	}


	
	private static void insertarMedico(Scanner scanner, MedicoDAO medicoDAO) {
	    Medico medico = new Medico();
	    System.out.println("Ingrese el nombre del médico:");
	    medico.setNombre(scanner.nextLine());
	    System.out.println("Ingrese los apellidos del médico:");
	    medico.setApellidos(scanner.nextLine());
	    System.out.println("Ingrese la especialidad del médico:");
	    medico.setEspecialidad(scanner.nextLine());

	    medicoDAO.addMedico(medico);
	    System.out.println("Médico agregado con éxito.");
	}

	

	private static void mostrarListaPacientes(PacienteDAO pacienteDAO) {
		System.out.println("\nLista de pacientes:");
		for (Paciente paciente : pacienteDAO.getAllPacientes()) {
			System.out.println(paciente.getNombre() + " " + paciente.getApellidos());
		}

		sessionFactory.close();
	}
}
