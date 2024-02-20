package ejemploInterfaces;

import javax.swing.JOptionPane;

public class InformarEstado implements EventoCambiarPropiedad{

	@Override
	public void propiedadCambiada(ObjetoEvento e) {
		Persona p = (Persona)e.getOrigen();
		String mensaje = "Se ha detectado una modificacion en la persona "+p.getNombre()+" con dni:"+p.getDni()+
				"\nse ha modificado su "+e.getNombrePropiedad()+" que antes era "+e.getAnteriorPropiedad();
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
