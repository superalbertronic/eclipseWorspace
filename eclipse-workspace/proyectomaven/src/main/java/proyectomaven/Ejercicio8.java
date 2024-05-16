package proyectomaven;

import java.util.*;

import javax.persistence.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		// Abrimos la conexión a una base de datos.
		EntityManagerFactory emf = (EntityManagerFactory) Persistence.createEntityManagerFactory("BD_Clientes.odb");
		EntityManager em = emf.createEntityManager();
		// 1. Tenemos varios clientes en la base de datos, y queremos
		// mostrarlos por pantalla alfabéticamente en orden inverso
		// 2. Puedes usar los siguientes métodos de la clase Cliente:
		//
		// getNombre()
		// toString()
		// 3. Crea la consulta
		// 4. Ejecuta la consulta
		//5. Recorre la lista de clientes mostrando sus datos
		//Cerramos la conexión a la base de datos:

		em.close();
		emf.close();
	}
}
