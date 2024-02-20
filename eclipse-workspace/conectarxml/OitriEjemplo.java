package xml;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;

public class OitriEjemplo {

    private static final String URI = "xmldb:exist://localhost:8080/exist/xmlrpc";
    private static final String USUARIO = "admin";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Cargue el controlador JDBC
            Class.forName("org.exist.xmldb.DatabaseImpl");

            // Configure la conexión a la base de datos ExistDB
            Database database = DatabaseManager.getDatabase(URI, USUARIO, PASSWORD);
          
            // Conectarse a la base de datos
            Collection collection = database.getCollection("/db/productosDB");
            System.out.println("Conexión a la base de datos ExistDB realizada correctamente");

            // Obtener un recurso XML de la colección
            XMLResource resource = (XMLResource) collection.getResource("documento.xml");
            System.out.println("Contenido del recurso: " + resource.getContent());

            // Ejecutar una consulta XQuery
            String xquery = "for $p in //producto return $p";
            ResourceSet result = collection.query(xquery);
            System.out.println("Número de resultados: " + result.getSize());

            // Cerrar la colección y la conexión a la base de datos
            collection.close();
            database.close();

        } catch (ClassNotFoundException e) {
            // Manejar excepción si el controlador JDBC no se encuentra
            e.printStackTrace();
        } catch (XMLDBException e) {
            // Manejar excepción si hay un problema con la conexión a la base de datos
            e.printStackTrace();
        }
    }
}
  