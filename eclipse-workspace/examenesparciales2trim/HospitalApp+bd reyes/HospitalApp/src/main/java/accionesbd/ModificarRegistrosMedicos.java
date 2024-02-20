package accionesbd;

import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.Query;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Medicos;

public class ModificarRegistrosMedicos {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		ThreadLocalSessionContext context = new ThreadLocalSessionContext((SessionFactoryImplementor) sessionFactory);
		context.bind(sessionFactory.openSession());

		try {
			Session session = context.currentSession();

			session.beginTransaction();

			// Modificar el nombre por "Juani"
			String updateHql = "UPDATE Medicos SET nombre = 'Juani' WHERE id = 1";
			Query<?> updateQuery = session.createQuery(updateHql);
			updateQuery.executeUpdate();

			// Realizar una nueva consulta para obtener los datos actualizados
			String selectHql = "FROM Medicos WHERE id = 1";
			Query<Medicos> selectQuery = session.createQuery(selectHql, Medicos.class);
			List<Medicos> medico = selectQuery.list();

			// Imprimir resultados
			System.out.println("Registros en la tabla medicos después de la actualización:");
			for (Medicos f : medico) {
				System.out.println(f.toString());
			}
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			context.unbind(sessionFactory);
			sessionFactory.close();
		}
	}
}