package proyectoxml;

import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import javax.xml.transform.OutputKeys;
import org.exist.xmldb.EXistResource;


public class QueryXml {
    
    private static String URI = "xmldb:exist://localhost:8080/exist/xmlrpc/db/";
    private static String COLLECTION = "productosDB";
    private static String RESOURCE = "productos.xml";

    public static void main(String args[]) throws Exception {
        
        final String driver = "org.exist.xmldb.DatabaseImpl";
        
        // inicializamos el driver de la base de datos
        Class cl = Class.forName(driver);
        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");
        DatabaseManager.registerDatabase(database);
        
        Collection col = null;
        XMLResource res = null;
        try {    
            // obtener la selección
            col = DatabaseManager.getCollection(URI + COLLECTION, "admin", "");
            col.setProperty(OutputKeys.INDENT, "no");
            res = (XMLResource)col.getResource(RESOURCE);
           
            
            if(res == null) {
                System.out.println("Base de datos no encontrada!");
            } else {
                // ejecutamos la consulta
                XPathQueryService xpathService = (XPathQueryService)col.getService("XPathQueryService", "1.0");
                xpathService.setProperty("indent", "yes");
                String xquery = "/productos/producto[precio < 50]";
                ResourceSet result = xpathService.query(xquery);
                
                // imprimimos el resultado
                ResourceIterator i = result.getIterator();
                while(i.hasMoreResources()) {
                    Resource r = i.nextResource();
                    System.out.println(r.getContent());
                }
            }
        } finally {
            
            
            if(res != null) {
                try { ((EXistResource)res).freeResources(); } catch(XMLDBException xe) {xe.printStackTrace();}
            }
            
            if(col != null) {
                try { col.close(); } catch(XMLDBException xe) {xe.printStackTrace();}
            }
        }
    }
}

