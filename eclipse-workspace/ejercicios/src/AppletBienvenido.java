import javax.swing.JApplet; // importa la clase JApplet
import java.awt.Graphics; // importa la clase Graphics

 	@SuppressWarnings({ "deprecation", "serial" })
 public class AppletBienvenido extends JApplet {
	 public void paint( Graphics g )
 	{g.drawString(getName(), ALLBITS, ABORT);
 	} // fin del método paint
 } // fin de la clase AppletBienvenido