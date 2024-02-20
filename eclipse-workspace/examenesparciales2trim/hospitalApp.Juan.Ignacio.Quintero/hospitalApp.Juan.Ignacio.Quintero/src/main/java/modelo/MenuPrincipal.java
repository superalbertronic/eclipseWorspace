package modelo;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MenuPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		MedicosDao medicosDAO = new MedicosDao(sessionFactory);
		PacientesDao pacientesDao = new PacientesDao(sessionFactory);
		CitaDao citaDao = new CitaDao(sessionFactory);
		boolean salir = false;

		do {
			System.out.println("------ Menú ------");
			System.out.println("1. Gestionar pacientes");
			System.out.println("2. Gestionar médicos");
			System.out.println("3. Gestionar citas");
			System.out.println("4. Salir");
			System.out.print("Seleccione una opción: ");

			Pacientes pMenu = new Pacientes();
			Medicos mMenu = new Medicos();
			Cita cMenu;
			byte opcion = Byte.parseByte(sc.nextLine());
			byte opcionInterna;
			switch (opcion) {
			case 1:
				System.out.println("------ Menú Pacientes ------");
				System.out.println("1. Insertar paciente");
				System.out.println("2. Actualizar paciente");
				System.out.println("3. Mostrar lista de pacientes");
				System.out.println("4. Eliminar paciente");
				System.out.println("5. Volver al menú principal");
				System.out.print("Seleccione una opción: ");
				opcionInterna = Byte.parseByte(sc.nextLine());
				switch (opcionInterna) {
				case 1:
					pMenu = pedirDatosPaciente();
					pacientesDao.agregarPacientes(pMenu);
					break;
				case 2:
					pacientesDao.actualizarPacientes(new Pacientes(1,"Santiago", "Sanchez", "Spriengfield",
							"Calle random 35", 66666, 25, "asesino en serie"));
					break;
				case 3:
					System.out.println("Pacientes existentes:");
					pacientesDao.obtenerTodasLosPacientess().forEach(paciente -> {
						System.out.println(paciente);
					});
					break;
				case 4:
					pacientesDao.eliminarPacientes(1);
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("------ Menú Médicos ------");
				System.out.println("1. Insertar medico");
				System.out.println("2. Actualizar medico");
				System.out.println("3. Mostrar lista de medicos");
				System.out.println("4. Eliminar medico");
				System.out.println("5. Volver al menú principal");
				System.out.print("Seleccione una opción: ");

				opcionInterna = Byte.parseByte(sc.nextLine());
				switch (opcionInterna) {
				case 1:
					mMenu = pedirDatosMedico();
					medicosDAO.agregarMedicos(mMenu);
					break;
				case 2:
					medicosDAO.actualizarMedicos(new Medicos(1,"Juanii", "Quintero", "Traumatólogo"));
					break;
				case 3:
					System.out.println("Medicos existentes:");
					medicosDAO.obtenerTodasLosMedicoss().forEach(medico -> {
						System.out.println(medico);
					});
					break;
				case 4:
					medicosDAO.eliminarMedicos(1);
					break;
				default:
					break;
				}

				break;
			case 3:
				System.out.println("------ Menú Citas ------");
				System.out.println("1. Insertar cita");
				System.out.println("2. Actualizar cita");
				System.out.println("3. Mostrar lista de citas");
				System.out.println("4. Eliminar cita");
				System.out.println("5. Volver al menú principal");
				System.out.print("Seleccione una opción: ");

				opcionInterna = Byte.parseByte(sc.nextLine());
				switch (opcionInterna) {
				case 1:
					pMenu = pedirDatosPaciente();
					mMenu = pedirDatosMedico();
					pacientesDao.agregarPacientes(pMenu);
					medicosDAO.agregarMedicos(mMenu);
					cMenu = new Cita(pMenu, mMenu, Date.valueOf("2024-08-02"), "11:11");
					citaDao.agregarCita(cMenu);
					break;
				case 2:
					Session session = sessionFactory.openSession();
			        Transaction transaction = null;
			        actualizarEntidad(session, "UPDATE Cita SET id_paciente = 3 WHERE id = 2");
					break;
				case 3:
					System.out.println("Citas existentes:");
					citaDao.obtenerTodasLosCitas().forEach(cita -> {
						System.out.println(cita);
					});
					break;
				case 4:
					citaDao.eliminarCita(1);
					break;
				default:
					break;
				}
				break;

			case 4:
				salir = true;
				System.out.println("Por favor no vuelvas en tu puta vida a este menú que odio con lo más profundo de mi alma y corazón :D");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		} while (!salir);
		sessionFactory.close();
	}

	public static Pacientes pedirDatosPaciente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre del paciente a insertar");
		String nombre = sc.nextLine();
		System.out.println("Dime el apellido del paciente a insertar");
		String apellido = sc.nextLine();
		System.out.println("Dime la ciudad del paciente a insertar");
		String ciudad = sc.nextLine();
		System.out.println("Dime la direccion del paciente a insertar");
		String direccion = sc.nextLine();
		System.out.println("Dime el telefono del paciente a insertar");
		int telefono = Integer.parseInt(sc.nextLine());
		System.out.println("Dime la edad del paciente a insertar");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.println("Dime el historial del paciente a insertar");
		String historial = sc.nextLine();

		Pacientes p = new Pacientes(nombre, apellido, ciudad, direccion, telefono, edad, historial);
		return p;
	}

	public static Medicos pedirDatosMedico() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el nombre del medico a insertar");
		String nombre = sc.nextLine();
		System.out.println("Dime el apellido del medico a insertar");
		String apellido = sc.nextLine();
		System.out.println("Dime la especialidad del medico a insertar");
		String especialidad = sc.nextLine();

		Medicos m = new Medicos(nombre, apellido, especialidad);
		return m;
	}
	private static void actualizarEntidad(Session session, String updateHql) {
		session.beginTransaction();
		Query<?> updateQuery = session.createQuery(updateHql);
		updateQuery.executeUpdate();
	}
}
