package model;

import java.util.Scanner;

import dao.CitaDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte opcion, opcionPaciente, opcionMedico, opcionCita;
		int id;
		String campo, valor, nombre, apellidos;
		PacienteDAO daoP = new PacienteDAO();
		MedicoDAO daoM = new MedicoDAO();
		CitaDAO daoC = new CitaDAO();
		
		do {
			System.out.println("\n--- Menú ---\n1. Gestionar Pacientes.\n2. Gestionar Médicos."
					+ "\n3. Gestionar Citas.\n4.Salir.\nSeleccione una opción.");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				do {
					System.out.println("\n--- Menú Pacientes ---\n1. Crear Paciente.\n2. Modificar Paciente."
							+ "\n3. Eliminar Paciente.\n4. Ver informe Paciente.\n5. Ver lista Pacientes.\n6 Salir.");
					opcionPaciente = Byte.parseByte(sc.nextLine());
					switch (opcionPaciente) {
					case 1:
						System.out.println("Dime el nombre del Paciente.");
						nombre = sc.nextLine();
						System.out.println("Dime los apellidos del Paciente.");
						apellidos = sc.nextLine();
						System.out.println("Dime la ciudad del Paciente.");
						String ciudad = sc.nextLine();
						System.out.println("Dime la dirección del Paciente.");
						String direccion = sc.nextLine();
						System.out.println("Dime el telefono del Paciente.");
						int telefono = Integer.parseInt(sc.nextLine());
						System.out.println("Dime la edad del Paciente.");
						int edad = Integer.parseInt(sc.nextLine());
						System.out.println("Dime el historial del Paciente.");
						String historial = sc.nextLine();
						Paciente paciente = new Paciente(nombre, apellidos, ciudad, direccion, telefono, edad,
								historial);
						daoP.agregarRegistro(paciente);
						break;
					case 2:
						System.out.println("Dime el id del Paciente que quieres modificar.");
						id = Integer.parseInt(sc.nextLine());
						System.out.println("Dime el campo que quieres cambiar del Paciente.");
						campo = sc.nextLine();
						System.out.println("Dime el valor que quieres cambiar del campo.");
						valor = sc.nextLine();
						daoP.actualizarRegistro(id, campo, valor);
						break;
					case 3:
						System.out.println("Dime el id del Paciente que quieres eliminar.");
						id = Integer.parseInt(sc.nextLine());
						daoP.eliminarRegistro(id);
						break;
					case 4:
						System.out.println("Dime el id del Paciente que quieres ver.");
						id = Integer.parseInt(sc.nextLine());
						daoP.obtenerRegistro(id);
						break;
					case 5:
						daoP.obtenerTodosLosRegistros();
					} // switch
				} while (opcionPaciente != 6);
				break;
			case 2:
				do {
				System.out.println("\n--- Menú Médicos ---\n1. Crear Médico.\n2. Modificar Médico."
						+ "\n3. Eliminar Médico.\n4. Ver informe Médico.\n5. Ver lista Médicos.\n6 Salir.");
				opcionMedico = Byte.parseByte(sc.nextLine());
				switch (opcionMedico) {
				case 1:
					System.out.println("Dime el nombre del Médico.");
					nombre = sc.nextLine();
					System.out.println("Dime los apellidos del Médico.");
					apellidos = sc.nextLine();
					System.out.println("Dime la especialidad del Médico.");
					String especialidad = sc.nextLine();
					Medico medico = new Medico(nombre, apellidos, especialidad);
					daoM.agregarRegistro(medico);
					break;
				case 2:
					System.out.println("Dime el id del Médico que quieres modificar.");
					id = Integer.parseInt(sc.nextLine());
					System.out.println("Dime el campo que quieres cambiar del Médico.");
					campo = sc.nextLine();
					System.out.println("Dime el valor que quieres cambiar del campo.");
					valor = sc.nextLine();
					daoM.actualizarRegistro(id, campo, valor);
					break;
				case 3:
					System.out.println("Dime el id del Médico que quieres eliminar.");
					id = Integer.parseInt(sc.nextLine());
					daoM.eliminarRegistro(id);
					break;
				case 4:
					System.out.println("Dime el id del Médico que quieres ver.");
					id = Integer.parseInt(sc.nextLine());
					daoM.obtenerRegistro(id);
					break;
				case 5:
					daoM.obtenerTodosLosRegistros();
				} // switch
				} while (opcionMedico != 6);
				break;
			case 3:
				do {
					System.out.println("\n--- Menú Citas ---\n1. Crear Cita.\n2. Modificar Cita."
							+ "\n3. Eliminar Cita.\n4. Ver informe Cita.\n5. Ver lista Citas.\n6 Salir.");
					opcionMedico = Byte.parseByte(sc.nextLine());
					switch (opcionMedico) {
					case 1:
						System.out.println("Dime el id del Paciente.");
						int id_paciente = Integer.parseInt(sc.nextLine());
						System.out.println("Dime el id del Médico.");
						int id_medico = Integer.parseInt(sc.nextLine());
						System.out.println("Dime la fecha de la Cita.");
						String fecha = sc.nextLine();
						System.out.println("Dime la hora de la Cita.");
						String hora = sc.nextLine();
						Cita cita = new Cita(id_paciente, id_medico, fecha, hora);
						daoC.agregarRegistro(cita);
						break;
					case 2:
						System.out.println("Dime el id de la Cita que quieres modificar.");
						id = Integer.parseInt(sc.nextLine());
						System.out.println("Dime el campo que quieres cambiar de la Cita.");
						campo = sc.nextLine();
						System.out.println("Dime el valor que quieres cambiar del campo.");
						valor = sc.nextLine();
						daoC.actualizarRegistro(id, campo, valor);
						break;
					case 3:
						System.out.println("Dime el id de la Cita que quieres eliminar.");
						id = Integer.parseInt(sc.nextLine());
						daoC.eliminarRegistro(id);
						break;
					case 4:
						System.out.println("Dime el id de la Cita que quieres ver.");
						id = Integer.parseInt(sc.nextLine());
						daoC.obtenerRegistro(id);
						break;
					case 5:
						daoC.obtenerTodosLosRegistros();
					} // switch
					} while (opcionMedico != 6);
					break;
			} // switch
		} while (opcion != 4);

		
		System.out.println("\nAdiós");
	} // main

}
// class
