package modelo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// Configurar la sesión de Hibernate
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Crear el DAO de Empresa
		EmpresaDao empresaDAO = new EmpresaDaoHibernate(sessionFactory);

		
		//Insertar datos
		empresaDAO.agregarEmpresa(new Empresa(9, "Cristina", "Checa"));
		

		// Obtener y mostrar todas las empresas
		System.out.println("Empresas existentes:");
		empresaDAO.obtenerTodasLasEmpresas().forEach(empresa -> {
			System.out.println(
					"ID: " + empresa.getId() + ", Nombre: " + empresa.getNombre() + ", País: " + empresa.getPais());
		});
		// Cerrar la sesión de Hibernate
		sessionFactory.close();
	}
}
