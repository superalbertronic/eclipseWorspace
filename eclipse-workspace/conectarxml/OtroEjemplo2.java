package xml;

import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.XPathQueryService;

public class OtroEjemplo2 {

    private static final String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/";
    private static final String COLLECTION = "/db/productosDB/";
    private static final String RESOURCE = "nombre-del-recurso.xml";

    public static void main(String args[]) throws Exception {

        // Initialize the database driver and register it
        Class<?> cl = Class.forName("org.exist.xmldb.DatabaseImpl");
        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");
        DatabaseManager.registerDatabase(database);

        // Get the collection and the resource
        Collection col = DatabaseManager.getCollection(URI + COLLECTION);
        XMLResource res = (XMLResource) col.getResource(RESOURCE);

        // Print the content of the resource
        if (res != null) {
            System.out.println(res.getContent());
        } else {
            System.out.println("Resource not found.");
        }

        // Clean up
        if (res != null) {
            res.freeResources();
        }
        if (col != null) {
            col.close();
        }
    }
}
