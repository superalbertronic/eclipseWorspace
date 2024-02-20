package xml;

import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.exist.EXistException;


public class ConexionExistDB {

    private static final String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/productosDB";
    private static final String USUARIO = "admin";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Cargue el controlador JDBC
            Class.forName("org.exist.xmldb.DatabaseImpl");

            // Configure la conexión a la base de datos ExistDB
            Database database = DatabaseManager.getDatabase(URI, USUARIO, PASSWORD);
            Database database1=DatabaseManager.
            
            // Conectarse a la base de datos
            database.setProperty("create-database", "true");
            Collection collection = database.getCollection("/");
            System.out.println("Conexión a la base de datos ExistDB realizada correctamente");

        } catch (ClassNotFoundException e) {
            // Manejar excepción si el controlador JDBC no se encuentra
            e.printStackTrace();
        } catch (XMLDBException e) {
            // Manejar excepción si hay un problema con la conexión a la base de datos
            e.printStackTrace();
        }
    }
}
