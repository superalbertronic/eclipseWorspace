package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenuPrincipal;
        int opcionMenuPacientes;

        do {
            // Menú principal
            System.out.println("------ Menú ------");
            System.out.println("1. Gestionar pacientes");
            System.out.println("2. Gestionar médicos");
            System.out.println("3. Gestionar citas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenuPrincipal = scanner.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    // Menú de pacientes
                    do {
                        System.out.println("------ Menú Pacientes ------");
                        System.out.println("1. Insertar paciente");
                        System.out.println("2. Actualizar paciente");
                        System.out.println("3. Mostrar lista de pacientes");
                        System.out.println("4. Eliminar paciente");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionMenuPacientes = scanner.nextInt();

                        switch (opcionMenuPacientes) {
                            case 1:
                                // Insertar paciente
                                System.out.println("Insertar paciente...");
                                break;
                            case 2:
                                // Actualizar paciente
                                System.out.println("Actualizar paciente...");
                                break;
                            case 3:
                                // Mostrar lista de pacientes
                                System.out.println("Mostrar lista de pacientes...");
                                break;
                            case 4:
                                // Eliminar paciente
                                System.out.println("Eliminar paciente...");
                                break;
                            case 5:
                                // Volver al menú principal
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                        }
                    } while (opcionMenuPacientes != 5);
                    break;
                case 2:
                    // Gestionar médicos
                    System.out.println("Gestionar médicos...");
                    break;
                case 3:
                    // Gestionar citas
                    System.out.println("Gestionar citas...");
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcionMenuPrincipal != 4);

        scanner.close();
    }
}
