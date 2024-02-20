package ejemploInterfaces;

import javax.swing.JOptionPane;

public class InformacionModificacion implements EventoCambiarPropiedad{

	@Override
	public void propiedadCambiada(ObjetoEvento e) {
		String mensaje = "El objeto "+getNombreClase(e.getOrigen().getClass().getName())+" ha modificado su "+e.getNombrePropiedad()
				+" "+e.getAnteriorPropiedad()+" por "+e.getValorPropiedad();
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	private String getNombreClase(String clase){
		return clase.substring(clase.lastIndexOf(".")+1);
	}

}
