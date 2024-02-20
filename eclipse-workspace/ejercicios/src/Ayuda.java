import java.io.File;
import java.net.URL;

import javax.help.HelpBroker;
import javax.help.HelpSet;
 
public class Prueba{
 
//Método llamado al cargar la ayuda.
private void cargarAyuda(){
try {
	// Carga el fichero de ayuda
	File fichero = new File("src/com/proyecto/help/help.hs");
	URL hsURL = fichero.toURI().toURL();
 
	// Crea el HelpSet y el HelpBroker
	HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
	HelpBroker hb = helpset.createHelpBroker();
 
	// Pone ayuda a item de menu al pulsar F1. mntmIndice es el JMenuitem
	hb.enableHelpOnButton(mntmIndice, "manual", helpset);
	hb.enableHelpKey(principal.getContentPane(), "ventana_principal", helpset);
 
} catch (Exception e) {
	logger.error("Error al cargar la ayuda: " + e);
}
}
}
