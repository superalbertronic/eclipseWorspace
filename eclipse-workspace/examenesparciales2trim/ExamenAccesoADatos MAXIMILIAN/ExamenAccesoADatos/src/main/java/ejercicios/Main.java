package ejercicios;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        PacienteDao pacienteDAO = new PacienteDAOImpl();
        pacienteDAO.crearTabla();
        MedicoDAO medicoDAO = new MedicoDAOImpl();
        medicoDAO.crearTabla();
        CitaDAO citaDAO = new CitaDAOImpl();
        citaDAO.crearTabla();

        System.out.println("Bienvenido al sistema de gestión de clínica");

        while (!salir) {
            System.out.println("------ Menú ------");
            System.out.println("1. Gestionar pacientes");
            System.out.println("2. Gestionar médicos");
            System.out.println("3. Gestionar citas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    gestionarPacientes(pacienteDAO, scanner);
                    break;
                case 2:
                    gestionarMedicos(medicoDAO, scanner);
                    break;
                case 3:
                    gestionarCitas(citaDAO, pacienteDAO, medicoDAO, scanner);
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
        // Cerrar la sesión de Hibernate al finalizar
        HibernateUtil.getSessionFactory().close();
    }

    private static void gestionarPacientes(PacienteDao pacienteDAO, Scanner scanner) {
        boolean volver = false;
        while (!volver) {
            System.out.println("------ Menú Pacientes ------");
            System.out.println("1. Insertar paciente");
            System.out.println("2. Actualizar paciente");
            System.out.println("3. Mostrar lista de pacientes");
            System.out.println("4. Eliminar paciente");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner después de leer un número

            switch (opcion) {
                case 1: // Insertar paciente
                    System.out.println("Insertar nuevo paciente:");
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
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Historial: ");
                    String historial = scanner.nextLine();

                    Paciente nuevoPaciente = new Paciente(nombre, apellidos, ciudad, direccion, telefono, edad, historial);
                    pacienteDAO.insertarPaciente(nuevoPaciente);
                    System.out.println("Paciente insertado correctamente.");
                    break;
                case 2: // Actualizar paciente
                    // La implementación dependerá de cómo manejes la actualización en tu DAO.
                    // Generalmente necesitarías el ID del paciente y los nuevos datos.
                    System.out.println("Actualizar paciente (esta funcionalidad requiere implementación adicional en el DAO).");
                    break;
                case 3: // Mostrar lista de pacientes
                    System.out.println("Lista de Pacientes:");
                    List<Paciente> pacientes = pacienteDAO.listarPacientes();
                    if (pacientes.isEmpty()) {
                        System.out.println("No hay pacientes registrados.");
                    } else {
                        pacientes.forEach(paciente -> System.out.println(paciente.getId() + ": " + paciente.getNombre() + " " + paciente.getApellidos()));
                    }
                    break;
                case 4: // Eliminar paciente
                    System.out.print("Ingrese el ID del paciente a eliminar: ");
                    Long id = scanner.nextLong();
                    pacienteDAO.eliminarPaciente(id);
                    System.out.println("Paciente eliminado correctamente.");
                    break;
                case 5: // Volver al menú principal
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }



    private static void gestionarMedicos(MedicoDAO medicoDAO, Scanner scanner) {
        boolean volver = false;
        while (!volver) {
            System.out.println("------ Menú Médicos ------");
            System.out.println("1. Insertar médico");
            System.out.println("2. Actualizar médico");
            System.out.println("3. Mostrar lista de médicos");
            System.out.println("4. Eliminar médico");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer del scanner

            switch (opcion) {
                case 1: // Insertar médico
                    System.out.println("Insertar nuevo médico:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = scanner.nextLine();

                    Medicos nuevoMedico = new Medicos(nombre, apellidos, especialidad);
                    medicoDAO.insertarMedico(nuevoMedico);
                    System.out.println("Médico insertado correctamente.");
                    break;
                case 2: // Actualizar médico
                    System.out.println("Actualizar médico (requiere ID y nuevos datos):");
                    System.out.print("ID del médico a actualizar: ");
                    Long idActualizar = scanner.nextLong();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevos apellidos: ");
                    String nuevosApellidos = scanner.nextLine();
                    System.out.print("Nueva especialidad: ");
                    String nuevaEspecialidad = scanner.nextLine();

                    Medicos medicoActualizado = new Medicos(nuevoNombre, nuevosApellidos, nuevaEspecialidad);
                    medicoActualizado.setId(idActualizar); // Asegúrate de que tu implementación de DAO maneje correctamente este caso.
                    medicoDAO.actualizarMedico(medicoActualizado);
                    System.out.println("Médico actualizado correctamente.");
                    break;
                case 3: // Mostrar lista de médicos
                    System.out.println("Lista de Médicos:");
                    List<Medicos> medicos = medicoDAO.listarMedicos();
                    if (medicos.isEmpty()) {
                        System.out.println("No hay médicos registrados.");
                    } else {
                        medicos.forEach(medico -> System.out.println(medico.getId() + ": " + medico.getNombre() + " " + medico.getApellidos() + " - " + medico.getEspecialidad()));
                    }
                    break;
                case 4: // Eliminar médico
                    System.out.print("Ingrese el ID del médico a eliminar: ");
                    Long idEliminar = scanner.nextLong();
                    medicoDAO.eliminarMedico(idEliminar);
                    System.out.println("Médico eliminado correctamente.");
                    break;
                case 5: // Volver al menú principal
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }


    private static void gestionarCitas(CitaDAO citaDAO, PacienteDao pacienteDAO, MedicoDAO medicoDAO, Scanner scanner) {
        boolean volver = false;
        while (!volver) {
            System.out.println("------ Menú Citas ------");
            System.out.println("1. Insertar cita");
            System.out.println("2. Actualizar cita");
            System.out.println("3. Mostrar lista de citas");
            System.out.println("4. Eliminar cita");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Insertar nuevo médico:");
                    System.out.print("Paciente: ");
                    String paciente = scanner.nextLine();
                    System.out.print("Medico: ");
                    String medico = scanner.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = scanner.nextLine();
                    System.out.print("Hora: ");
                    String hora = scanner.nextLine();                               
                    System.out.println("Médico insertado correctamente.");                    
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    citaDAO.listarCitas().forEach(System.out::println);
                    break;
                case 4:
                    // Eliminar cita
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
